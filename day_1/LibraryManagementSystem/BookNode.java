package LibraryManagementSystem;

public class BookNode {
    String title;
    String author;
    String genre;
    int bookId;
    boolean availability;
    BookNode next;
    BookNode prev;

    public BookNode(String title, String author, String genre, int bookId, boolean availability) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.availability = availability;
        this.next = null;
        this.prev = null;
    }
}

