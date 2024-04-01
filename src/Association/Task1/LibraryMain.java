package Association.Task1;
import Association.Task1.Book;
import Association.Task1.Library;
public class LibraryMain {
    public static void main(String[] args) {
        // Creating instances of the Book class
        Book book1 = new Book("Evolve Your Brain ", "Joe Dispenza", 2007);
        Book book2 = new Book("How to Win Friends and Influence People", "Dale Carnegie", 1936);
        Book book3 = new Book("Siddhartha", "Hermann Hesse", 1922);
        Book book4 = new Book("Becoming supernatural", "Joe Dispenza", 2017);

        // Creating an instance of the Library class
        Library library = new Library();

        // Adding the book instances to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Displaying the list of all books in the library
        System.out.println("All books in the library:");
        library.displayBooks();

        // Searching for books by a specific author and displaying the results
        String searchAuthor = "George Orwell";
        System.out.println("\nSearching for books by author: " + searchAuthor);
        library.findBooksByAuthor(searchAuthor);
    }
}