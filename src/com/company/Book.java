package com.company;

public class Book {
    //Instance-variabler
    private String title;
    private String author;
    private int price;

    //   Constructor for opprettelse av objektet bok
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                "\n";
    }

    // Skriv ut kvittering for bok med tittel, forfatter og pris
    public void printBookDetails() {
        System.out.println("\nTitle: " + title +
                "\nAuthor: " + author + "\nPrice: " + price);
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}


