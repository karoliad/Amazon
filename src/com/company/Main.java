package com.company;

import java.util.ArrayList;
import java.util.Scanner;


// TEST fredag 17.01.20


public class Main {
    public static void main(String[] args) {

// PRINTER UT BØKER
//    Book nyBok = Book.newBook();
//    Book.printBook(kvittering);
//        System.out.println("skriver ut booklist: "+ Book.bookList.indexOf(0) );


// PRINTER UT FILMER
    Movie kvittering= Movie.newMovie();
    Movie.printMovieDetails(kvittering);
    }
}
