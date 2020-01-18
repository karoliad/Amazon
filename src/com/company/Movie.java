package com.company;

public class Movie {
    // Instance-variabler
    private String title;
    private MovieGenre genre;
    private int price;
    private String director;
    private long productId;

    //    Constructor hvor man også skriver inn regissør
    public Movie(String title, MovieGenre genre, int price, String director, long productId) {
        this(title, genre, price, productId);
        this.director = director;
        this.productId = productId;
    }

    //   Constructor for opprettelsen av en film uten regissør
    public Movie(String title, MovieGenre genre, int price, long productId) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                ", director='" + director + '\'' +
                ", productId=" + productId +
                '}';
    }

    //  skriv ut kvittering for film med tittel, sjanger og pris
    public void printMovieDetails() {
        if (director == null) {
            System.out.println("Title: " + getTitle() +
                    "\nGenre: " + getGenre() +
                    "\nPrice: " + getPrice());
        } else {
            System.out.println(" \nTitle: " + getTitle() +
                    "\nGenre: " + getGenre() +
                    "\nPrice: " + getPrice() +
                    "\nDirector: " + getDirector() +
                    "\nProductId: " + getProductId());
        }
    }

    //Getters og setters for filmer
    public String getTitle() {
        return title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    public String getDirector() {
        return director;
    }

    public long getProductId() {
        return productId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    //Enums for movie
    enum MovieGenre {
        UNKNOWN,
        DRAMA,
        COMEDY,
        ACTION,
        DOCUMENTARY,
    }
}