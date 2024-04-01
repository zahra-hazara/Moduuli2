package Association.Task2;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("The Power of Your Subconscious Mind", "Joseph Murphy", 1963));
        library.addBook(new Book("How to Win Friends and Influence People", "Dale Carnegie", 1936));

        library.printAvailableBooks();

        library.borrowBook("The Power of Your Subconscious Mind");
        library.printAvailableBooks();

        Book returnedBook = new Book("The Power of Your Subconscious Mind", "Joseph Murphy", 1963);
        library.returnBook(returnedBook);
        library.printAvailableBooks();
    }
}
