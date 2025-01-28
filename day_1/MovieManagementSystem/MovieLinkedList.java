package MovieManagementSystem;

public class MovieLinkedList {
    private MovieNode head;
    private MovieNode tail;

    public MovieLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a new movie at the beginning, end, or a specific position
    public void addMovie(String title, String director, int yearOfRelease, double rating, Integer position) {
        MovieNode newNode = new MovieNode(title, director, yearOfRelease, rating);
        if (position == null) {  // Add at end
            if (tail == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        } else if (position == 0) {  // Add at beginning
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        } else {  // Add at specific position
            MovieNode current = head;
            int count = 0;
            while (current != null && count < position - 1) {
                current = current.next;
                count++;
            }
            if (current != null) {
                newNode.next = current.next;
                newNode.prev = current;
                if (current.next != null) {
                    current.next.prev = newNode;
                }
                current.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
            }
        }
    }

    // Remove a movie by Movie Title
    public void removeMovie(String title) {
        MovieNode current = head;
        while (current != null && !current.title.equals(title)) {
            current = current.next;
        }
        if (current != null) {  // Movie found
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                head = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            } else {
                tail = current.prev;
            }
        }
    }

    // Search for a movie by Director or Rating
    public MovieNode searchMovie(String director, Double rating) {
        MovieNode current = head;
        while (current != null) {
            if ((director != null && current.director.equals(director)) || (rating != null && current.rating == rating)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Display all movie records in forward order
    public void displayMoviesForward() {
        MovieNode current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.yearOfRelease + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    // Display all movie records in reverse order
    public void displayMoviesBackward() {
        MovieNode current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.yearOfRelease + ", Rating: " + current.rating);
            current = current.prev;
        }
    }

    // Update a movie's Rating by Movie Title
    public void updateRating(String title, double newRating) {
        MovieNode movie = searchMovie(title, null);
        if (movie != null) {
            movie.rating = newRating;
        }
    }
}
