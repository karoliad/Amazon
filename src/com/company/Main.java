package com.company;
import java.util.ArrayList;
import java.util.List;


// TEST1 branch fra github  fredag 17.01.20

public class Main {

    public static void main(String[] args) {
       List<Book> arrayListbooks = new ArrayList<>();
        arrayListbooks.add(new Book("Lord of the Rings", "Tolkien", 399));
        arrayListbooks.add(new Book("Harry Potter", "Rowling", 199));
        arrayListbooks.add(new Book("Hypnotisøren", "Kepler", 99));
        arrayListbooks.add(new Book("Spøkelse", "Jo Nesbø", 159));
        arrayListbooks.add(new Book("Snarveien til vin  ", "Ingvild Tennfjord", 379));
        arrayListbooks.add(new Book("Bobler ", "Ingvild Tennfjord", 99));

        List<Movie> arrayListMovies = new ArrayList<>();
        arrayListMovies.add(new Movie("Lord of the Rings", Movie.MovieGenre.ACTION, 399,"Peter Jackson", 1001));
        arrayListMovies.add(new Movie("Harry Potter", Movie.MovieGenre.DOCUMENTARY, 199,1002));
        arrayListMovies.add(new Movie("Hypnotisøren", Movie.MovieGenre.DRAMA, 99, "Julenissen", 1003));
        arrayListMovies.add(new Movie("Spøkelse", Movie.MovieGenre.ACTION, 299,1004));

        findMovieById(arrayListMovies, 1004);
        findMovieById(arrayListMovies, 1002);

//        for (Book book : arrayListbooks) {
//         book.printBookDetails();
//        }
//        System.out.println("\n________Movies_________");
//
//        for (Movie movie:arrayListMovies) {
//         movie.printMovieDetails();
//        }

    }

     public static void findMovieById(List<Movie> arrayListMovies, long productId){
         boolean noMoviesFound = true;
         for (Movie movie : arrayListMovies) {
             boolean foundMovie = movie.getProductId() == productId;
             if(foundMovie) {
                 System.out.println("Found this movie: " +"ProductId "+ productId);
                 movie.printMovieDetails();
                 noMoviesFound = false;
             }
         }
         if(noMoviesFound){
             System.out.println("Didn`t find a movie with productId " + productId);
         }
     }


}
