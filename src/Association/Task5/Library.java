package Association.Task5;
import Association.Task4.Book;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    public Library() {
        books = new ArrayList<>(); // Initialize the ArrayList
    }
    public void addBook(Book book) {
        this.books.add(book);
    }
    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0.0;
        }
        double totalRating = 0.0;
        int ratedBooksCount = 0;
        for (Book book : books) {
            if (book.getRating() >= 0) { // Assuming -1 denotes an unrated book
                totalRating += book.getRating();
                ratedBooksCount++;
            }
        }
        return ratedBooksCount > 0 ? totalRating / ratedBooksCount : 0.0;
    }

    public Book getMostReviewedBook() {
        Book mostReviewedBook = null;
        int maxReviews = 0;
        for (Book book : books) {
            int reviewsCount = book.getReviews().size();
            if (reviewsCount > maxReviews) {
                maxReviews = reviewsCount;
                mostReviewedBook = book;
            }
        }
        return mostReviewedBook; // This will return null if no books have reviews
    }
}
