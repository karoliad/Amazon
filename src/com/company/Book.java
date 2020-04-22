package com.company;

public class Book implements Product {
    //Instans-variabler
    protected final String title;
    protected final String author;
    protected final int price;
    protected final Long productId;

    //   Constructor for opprettelse av objektet bok
    public Book(String title, String author, int price, Long productId) {
        this.price = price;
        this.productId = productId;
        this.title = title;
        this.author = author;
    }

    // Skriv ut kvittering for bok med tittel og  forfatter
    @Override
    public void printDetails() {
        System.out.println(" ");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);


    }




    //Getters og setters for bøker
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public Long getProductId() {
        return productId;
    }

}




