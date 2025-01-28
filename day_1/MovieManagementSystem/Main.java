package MovieManagementSystem;

public class Main {
    public static void main(String[] args) {
        MovieLinkedList movieList = new MovieLinkedList();
        movieList.addMovie("Inception", "Christopher Nolan", 2010, 8.8, null);
        movieList.addMovie("The Matrix", "Lana Wachowski, Lilly Wachowski", 1999, 8.7, null);
        movieList.addMovie("Interstellar", "Christopher Nolan", 2014, 8.6, 0);
        movieList.displayMoviesForward();

        movieList.removeMovie("The Matrix");
        System.out.println("After Deletion:");
        movieList.displayMoviesForward();

        movieList.updateRating("Interstellar", 9.0);
        System.out.println("After Rating Update:");
        movieList.displayMoviesForward();

        System.out.println("Movies in Reverse Order:");
        movieList.displayMoviesBackward();
    }

}
