package com.example.bookmart;

import android.content.Context;

import java.io.Serializable;
import java.util.ArrayList;

public class ExploreCategoryDomain implements Serializable {
    private String bookName;
    private String bookPic;
    private String bookdescription;
    private String bookprice;
    private String bookauthor;


    private String discount;

    private String bookoriginalprice;

    private String genre;

    public ExploreCategoryDomain() {
    }

    public ExploreCategoryDomain(String bookName, String bookPic, String bookdescription, String bookprice, String bookauthor, String discount, String bookoriginalprice) {
        this.bookName = bookName;
        this.bookPic = bookPic;
        this.bookdescription = bookdescription;
        this.bookprice = bookprice;
        this.bookauthor = bookauthor;
        this.discount = discount;
        this.bookoriginalprice = bookoriginalprice;
        this.genre = genre;
    }

    public String getGenre(){
        return genre;
    }
    public String setGenre(){
        return genre;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPic() {
        return bookPic;
    }

    public void setBookPic(String bookPic) {
        this.bookPic = bookPic;
    }

    public String getBookdescription() {
        return bookdescription;
    }

    public void setBookdescription(String bookdescription) {
        this.bookdescription = bookdescription;
    }

    public String getBookprice() {
        return bookprice;
    }

    public void setBookprice(String bookprice) {
        this.bookprice = bookprice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getBookoriginalprice() {
        return bookoriginalprice;
    }

    public void setBookoriginalprice(String bookoriginalprice) {
        this.bookoriginalprice = bookoriginalprice;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }
}