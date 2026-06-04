package com.cfs.BookAPI.entity;

public class Book {
    private Long id;
    private String author;
    private String title;
    private Double price;
    public Book() {

    }

    Book(Long id, String author, String title, Double price) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.price = price;
    }
    public Long getId() {
        return id;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public Double getPrice() {
        return price;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public java.lang.String toString() {
        return "{ id : " +id+ ", author : " +author+ ", title : " +title+ ", price : " +price+ " }";
    }
}
