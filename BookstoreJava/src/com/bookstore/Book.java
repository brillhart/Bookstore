package com.bookstore;

import java.math.BigDecimal;

public class Book {

    //attributes
    private String title;
    private String author;
    private BigDecimal price;

    //constructor
    public void Book (String title, String author, BigDecimal price) {
        this.title = title;
        this.author = author;
        this.price = new BigDecimal(price);
    }

    //receipt printout to get easy printout
    public String toString() {
        return getTitle() + " - " + getAuthor() + "/n$" + getPrice();
    }

    //getters and setters
    public BigDecimal getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
