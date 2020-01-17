package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
//Instance-variabler
    private String title;
    private String author;
    private  int price;

//  Opprett arraylist for lagring av bøker
    static ArrayList<Book> bookList = new ArrayList<>(); // nono this must go! flytt til main


//   Constructor for opprettelse av objektet bok
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

//Getters og setters for bøker
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPrice() { return price; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPrice(int price) { this.price = price; }

//Opprett nytt bok-objekt og legger til i arrayList, krever de tre parameterne som er definert i constructoren
    public Book newBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book title");
        String title = scanner.nextLine();
        System.out.println("Please Author");
        String author = scanner.nextLine();
        System.out.println("Please enter price");
        int price = scanner.nextInt();
        Book myNewBook = new Book(title, author, price);
        bookList.add(myNewBook);

        return myNewBook;
    }

// Skriv ut kvittering for bok med tittel, forfatter og pris
    public void printBook() {
        System.out.println("\n- MY FAVOURITE BOOK IS -\nTitle: " + title +
                "\nAuthor: " + author + "\nPrice: " + price+"\n");
    }

////    Oppretter array for å lagre bøkene som er skrevet inn
//    static void opprettBookArray(Book book, Book book1) {
//        Book[] myBooks = new Book[2];
//        myBooks[0] = book;
//        myBooks[1] = book1;
//
//        for (int i = 0; i < myBooks.length; i++) {
//            Book.printBook(myBooks[i]);
//        }
    }


