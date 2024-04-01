package Association.Task2;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String title) {
        Book bookToBorrow = null;
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                bookToBorrow = book;
                break;
            }
        }
        if (bookToBorrow != null) {
            books.remove(bookToBorrow);
            System.out.println(bookToBorrow.title + " has been borrowed.");
        } else {
            System.out.println("Book not available.");
        }
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println(book.title + " has been returned to the library.");
    }

    public void printAvailableBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available books:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}