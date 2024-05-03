package com.example.bookmart;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


import java.util.ArrayList;

public class ExploreCategoryAdapter extends RecyclerView.Adapter<ExploreCategoryAdapter.ViewHolder> {
    private ArrayList<BookDomain> cartlistDomains;
    private Fragment fragment;

    public ExploreCategoryAdapter(ArrayList<BookDomain> recommendedDomains, Fragment fragment) {
        this.cartlistDomains = recommendedDomains;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_showbooks, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BookDomain book = cartlistDomains.get(position);


        holder.name.setText(book.getTitle());
        holder.author.setText(book.getAuthor());
        holder.description.setText(book.getDescription());

        holder.disc.setText("("+book.getDis()+"% off)");
        holder.originalprice.setPaintFlags(holder.originalprice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        holder.originalprice.setText("₹"+book.getOprice());
        String feeWithSymbol = "₹" + String.valueOf(book.getFee());
        holder.price.setText(feeWithSymbol);

        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(book.getPic(), "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourceId).into(holder.pic);


        holder.bposition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                if (position != RecyclerView.NO_POSITION && position < cartlistDomains.size()) {
                    BookDomain selectedFood = cartlistDomains.get(position);
                    if (selectedFood != null) {
                        ShowDetailFragment showDetailFragment = ShowDetailFragment.newInstance(selectedFood);
                        FragmentTransaction fragmentTransaction = ((AppCompatActivity) holder.itemView.getContext()).getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.fragment_container, showDetailFragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                    }
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return cartlistDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,author,description,price,disc,originalprice;
        ImageView pic;

        RelativeLayout bposition;




        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.bookName);
            pic = itemView.findViewById(R.id.bookPic);
            author = itemView.findViewById(R.id.bookauthor);
            description = itemView.findViewById(R.id.bookdescription);
            price = itemView.findViewById(R.id.bookprice);
            disc = itemView.findViewById(R.id.discount);
            originalprice = itemView.findViewById(R.id.bookoriginalprice);
            bposition=itemView.findViewById(R.id.bookposition);

        }
    }
}