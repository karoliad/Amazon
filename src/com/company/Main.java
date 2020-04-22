package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Movie("Lord of the Rings", MovieGenre.DOCUMENTARY, 399, 1001L));
        productList.add(new MovieWithDirector("Home alone2",MovieGenre.ACTION, 456, 3002L, "Peter Pan"));
        productList.add(new Book("Snarveien til vin  ", "Ingvild Tennfjord", 379,2006L));
        productList.add(new ChildrensBook("Le petit prince", "Gaultier", 199,"Over 4 years old",2008L));
        productList.add(new Movie("Harry Potter", MovieGenre.DOCUMENTARY, 199,  1002L));
        productList.add(new Book("Two towers", "Tolkien", 399,2011L));
        productList.add(new ChildrensBook("Pippi Langstrømpe","Astrid Lindgren",99,"over 6 years old",2010L));
        productList.add(new Book("Harry Potter", "Rowling", 199,2002L));
        productList.add(new Book("Hypnotisøren", "Lars Kepler", 99,2003L));

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("ghostBusters", MovieGenre.DOCUMENTARY, 129, 2008L));
        movies.add(new Movie("Shawshank", MovieGenre.ACTION, 179, 2009L));
        movies.add(new Movie("Die hard", MovieGenre.COMEDY, 299, 2010L));

        productList.addAll(movies);

        for(Product product : productList){
            product.printDetails();
            String productType = product.getClass().getSimpleName();
            System.out.println("Type of product: "+ productType.toUpperCase());
        }



    }

}
