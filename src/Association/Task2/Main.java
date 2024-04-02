package Association.Task2;
import Association.Task1.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Initially display all books
        library.displayBooks();

        // Borrow a book
        library.borrowBook("Data Structures and Algorithms");


        // Return the borrowed book
        library.returnBook(book2);

    }
}
