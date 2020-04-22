package com.company;

public class MovieWithDirector extends Movie {

    private String director;

    public MovieWithDirector( String title, MovieGenre genre, int price, long productId,String director) {
        super(title, genre, price, productId);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Director: " + this.director);;
    }


}

