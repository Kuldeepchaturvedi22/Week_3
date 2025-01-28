package LibraryManagementSystem;

public class LibraryLinkedList {
    private BookNode head;
    private BookNode tail;

    public LibraryLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a new book at the beginning, end, or a specific position
    public void addBook(String title, String author, String genre, int bookId, boolean availability, Integer position) {
        BookNode newNode = new BookNode(title, author, genre, bookId, availability);
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
            BookNode current = head;
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

    // Remove a book by Book ID
    public void removeBook(int bookId) {
        if (head == null) return;

        BookNode current = head;
        while (current != null && current.bookId != bookId) {
            current = current.next;
        }
        if (current != null) {  // Book found
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

    // Search for a book by Book Title or Author
    public BookNode searchBookByTitleOrAuthor(String title, String author) {
        BookNode current = head;
        while (current != null) {
            if ((title != null && current.title.equalsIgnoreCase(title)) || (author != null && current.author.equalsIgnoreCase(author))) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Update a book's Availability Status
    public void updateAvailability(int bookId, boolean availability) {
        BookNode book = searchBookById(bookId);
        if (book != null) {
            book.availability = availability;
        }
    }

    // Search for a book by Book ID
    private BookNode searchBookById(int bookId) {
        BookNode current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Display all books in forward order
    public void displayBooksForward() {
        BookNode current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", Book ID: " + current.bookId + ", Availability: " + current.availability);
            current = current.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksBackward() {
        BookNode current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", Book ID: " + current.bookId + ", Availability: " + current.availability);
            current = current.prev;
        }
    }

    // Count the total number of books in the library
    public int countTotalBooks() {
        int count = 0;
        BookNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
