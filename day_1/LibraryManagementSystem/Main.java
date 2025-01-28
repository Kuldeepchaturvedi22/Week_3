package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        LibraryLinkedList library = new LibraryLinkedList();
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 101, true, null);
        library.addBook("To Kill a Mockingbird", "Harper Lee", "Fiction", 102, true, null);
        library.addBook("1984", "George Orwell", "Dystopian", 103, false, 0);
        library.displayBooksForward();

        library.removeBook(102);
        System.out.println("After Deletion:");
        library.displayBooksForward();

        library.updateAvailability(103, true);
        System.out.println("After Availability Update:");
        library.displayBooksForward();

        System.out.println("Books in Reverse Order:");
        library.displayBooksBackward();

        System.out.println("Total Number of Books: " + library.countTotalBooks());
    }
}
