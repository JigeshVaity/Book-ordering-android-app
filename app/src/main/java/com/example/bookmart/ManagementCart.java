package com.example.bookmart;

import android.content.Context;
import android.widget.Filter;
import android.widget.Toast;

import com.example.bookmart.BookDomain;
import com.example.bookmart.ChangeNumberItemsListener;

import java.util.ArrayList;
public class ManagementCart {
    private Context context;
    private TinyDB tinyDB;

    public ManagementCart(Context context) {
        this.context = context;
        this.tinyDB = new TinyDB(context);
    }

    public void insertFood(BookDomain item) {
        ArrayList<BookDomain> listFood = getListCart();
        boolean existAlready = false;
        int n = 0;
        for (int i = 0; i < listFood.size(); i++) {
            if (listFood.get(i).getTitle().equals(item.getTitle())) {
                existAlready = true;
                n = i;
                break;
            }
        }
        if (existAlready)
        {
            listFood.get(n).setNumberInCart(item.getNumberInCart());
        }
        else
        {
            listFood.add(item);
        }

        tinyDB.putListObject("CartList",listFood);
        Toast.makeText(context, "Added to your Cart", Toast.LENGTH_SHORT).show();
    }

    public ArrayList<BookDomain> getListCart()
    {
        return tinyDB.getListObject("CartList");
    }
    public void minusNumberFood(ArrayList<BookDomain> listfood, int position, ChangeNumberItemsListener changeNumberItemsListener)
    {
        if(listfood.get(position).getNumberInCart()==1)
        {
            listfood.remove(position);
        }
        else
        {
            listfood.get(position).setNumberInCart(listfood.get(position).getNumberInCart() -1 );
        }

        tinyDB.putListObject("CartList",listfood);
        changeNumberItemsListener.changed();
    }

    public void plusNumberFood(ArrayList<BookDomain> listfood,int position,ChangeNumberItemsListener changeNumberItemsListener)
    {
        listfood.get(position).setNumberInCart(listfood.get(position).getNumberInCart() + 1);
        tinyDB.putListObject("CartList",listfood);
        changeNumberItemsListener.changed();
    }

    public void clearCart() {
        tinyDB.remove("CartList");
    }
    public Double getTotalFee()
    {
        ArrayList<BookDomain>listfood2=getListCart();
        double fee=0;
        for(int i = 0; i< listfood2.size(); i++)
        {
            fee = fee + (listfood2.get(i).getFee() * listfood2.get(i).getNumberInCart());
        }
        return fee;
    }
}