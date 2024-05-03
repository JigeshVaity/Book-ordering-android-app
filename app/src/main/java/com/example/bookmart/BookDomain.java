package com.example.bookmart;

import android.content.Context;

import java.io.Serializable;
import java.util.ArrayList;

public class BookDomain implements Serializable {
    private String title;
    private String pic;
    private String description;
    private Double fee;

    private String dis;

    private String oprice;
    private String author;
    private String quantity;
    private int numberInCart;

    private String name;



    public BookDomain(String title, String pic, Double fee, String dis, String oprice, String description, String author, String quantity) {
        this.title = title;
        this.pic = pic;
        this.fee = fee;
        this.dis=dis;
        this.oprice=oprice;
        this.description = description;
        this.author = author;
        this.quantity = quantity;

    }
    public BookDomain(Context context, ArrayList<BookDomain> bookList) {
        // Constructor implementation
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getNumberInCart() {
        return numberInCart;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }

    public String getOprice() {
        return oprice;
    }

    public void setOprice(String oprice) {
        this.oprice = oprice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}