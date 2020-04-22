package com.company;

public class Movie implements Product, Comparable<Movie> {
    // Instance-variabler
    protected final String title;
    public MovieGenre genre;
    private final int price;
    private final Long productId;

    //   Constructor for opprettelsen av en film uten regissør
    public Movie(String title, MovieGenre genre, int price, Long productId) {
        this.price = price;
        this.productId = productId;
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    public Long getProductId() {
        return productId;
    }

    //  skriv ut kvittering for film med tittel, sjanger og pris
    @Override
    public void printDetails() {
        System.out.println(" ");
        System.out.println("Title: " + this.title);
        System.out.println("Genre: " + this.genre);
        System.out.println("Price: " + this.price);




    }

    @Override
    public int compareTo(Movie movie) {
        if (this.productId.equals(movie.productId)) {
            return 0;
        } else if (this.productId < movie.productId) {
            return -1;
        } else return 1;
    }

}


    //Enums for movie
    enum MovieGenre {
        UNKNOWN,
        DRAMA,
        COMEDY,
        ACTION,
        DOCUMENTARY,
    }
