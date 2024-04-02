package Association.Task3;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Check if a book is available
        String bookTitleToCheck = "Data Structures and Algorithms";
        boolean isAvailable = library.isBookAvailable(bookTitleToCheck);
        System.out.println("Is the book '" + bookTitleToCheck + "' available? " + isAvailable);

        // Borrow the book
        library.borrowBook(bookTitleToCheck);

        // Check again if the book is available after borrowing
        isAvailable = library.isBookAvailable(bookTitleToCheck);
        System.out.println("Is the book '" + bookTitleToCheck + "' available after borrowing? " + isAvailable);

        // Return the book
        library.returnBook(new Book(bookTitleToCheck, "Jane Doe", 2018)); // Assuming we know the author and year

        // Check again if the book is available after returning
        isAvailable = library.isBookAvailable(bookTitleToCheck);
        System.out.println("Is the book '" + bookTitleToCheck + "' available after returning? " + isAvailable);
    }
}