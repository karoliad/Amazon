package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
// Instance-variabler
   private String title;
   private MovieGenre genre;
   private int price;
    private String director;

//    Constructor hvor man også skriver inn regissør
    public Movie(String title, MovieGenre genre, int price, String director){
        this(title, genre, price);
        this.director = director;
    }

 //   Constructor for opprettelsen av en film uten regissør
    public Movie(String title, MovieGenre genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }
//Getters og setters for filmer
    public String getTitle() { return title; }
    public MovieGenre getGenre() { return genre; }
    public int getPrice() { return price; }
    public String getDirector(){return director;}
    public void setTitle(String title) { this.title = title; }
    public void setGenre(MovieGenre genre) { this.genre = genre; }
    public void setPrice(int price) { this.price = price; }
    public void setDirector(String director){this.director= director;}

//Oppretter objektet movie med tre parametere fra constructoren
    public Movie newMovie(){
//       Opprett array med plass til 5 filmer
        String[] myMovieList = new String [5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter movie title");
        String title = scanner.nextLine();
        System.out.println("Please choose genre\n" +
                            "1 - Drama\n" +
                            "2 - Comedy\n" +
                            "3 - Action\n" +
                            "4 - Documentary");
        int genre = scanner.nextInt();
        MovieGenre chosenGenre;
        switch (genre) {
            case 1:
                chosenGenre = MovieGenre.DRAMA;
                break;
            case 2:
                chosenGenre = MovieGenre.COMEDY;
                break;
            case 3:
                chosenGenre = MovieGenre.ACTION;
                break;
            case 4:
                chosenGenre = MovieGenre.DOCUMENTARY;
                break;
            default:
                chosenGenre = MovieGenre.UNKNOWN;
                System.out.println("No valid entry, genre is set to "+ chosenGenre+"\n");
                break;
        }

        System.out.println("Please enter price");
        int price = scanner.nextInt();
        System.out.println("do you want to add the director? y/n ");
        String yN = scanner.next().toLowerCase();
        String director ="";
        if ("y".equals(yN)) {
            System.out.println("Please enter director");
            scanner.nextLine();
            director = scanner.nextLine();
        } else
            director = "";

        Movie myNewMovie;
        boolean hasDirector = !director.isEmpty();
        if(hasDirector) {
            myNewMovie = new Movie(title, chosenGenre, price, director);
        }else{
           myNewMovie = new Movie(title, chosenGenre, price);
        }
        return myNewMovie;

    }
 //  skriv ut kvittering for film med tittel, sjanger og pris
    public void printMovieDetails() {
//        Må kunne sjekke fra forrige metode hvilken constructor som er i bruk
//        boolean hasDirector -
        if(director.isEmpty()) {
            System.out.println("\n- MY FAVOURITE MOVIE - \nTitle: " + getTitle() + "\nGenre: "
                    + getGenre() + "\nPrice: " + getPrice() + "\n");
        }else{
            System.out.println("\n- MY FAVOURITE MOVIE - \nTitle: " + getTitle() + "\nGenre: "
                    + getGenre() + "\nPrice: " + getPrice() + "\nDirector: "+ director);
        }
    }
//    Oppretter array for lagring av innskrevne filmer
    public void opprettMovieArray(Movie movie, Movie movie2) {
        Movie[] myMovies = new Movie[2];
        myMovies[0] = movie;
        myMovies[1] = movie2;

        for (Movie myMovie : myMovies) {
            myMovie.printMovieDetails();
        }
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
