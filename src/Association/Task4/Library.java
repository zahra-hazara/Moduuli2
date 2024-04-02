package Association.Task4;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (Book book : books) {
            System.out.println("Title: \"" + book.getTitle() + "\", Author: \"" + book.getAuthor() + "\", Year: " + book.getPublicationYear());
        }
    }

    public void borrowBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(title)) {
                books.remove(i);
                System.out.println("Book borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println("Book returned: " + book.getTitle());
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public void setBookRating(String title, double rating) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setRating(rating);
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void addBookReview(String title, String review) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.addReview(review);
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    // You may want to add methods to get a book's rating and reviews
    public void printBookDetails(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Year: " + book.getPublicationYear());
                System.out.println("Rating: " + book.getRating());
                System.out.println("Reviews:");
                for (String review : book.getReviews()) {
                    System.out.println("- " + review);
                }
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
}
