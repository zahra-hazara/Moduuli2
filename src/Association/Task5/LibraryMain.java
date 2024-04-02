package Association.Task5;
import Association.Task4.Book;
public class LibraryMain {
    public static void main(String[] args) {
        // Create a new Library instance
        Library library = new Library();

        // Create Book instances
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Set ratings for the books
        book1.setRating(4.7);
        book2.setRating(4.2);

        // Add reviews to the books
        book1.addReview("Good book for new student.");
        book1.addReview("Brilliant , a must-read.");
        book2.addReview("every developer need to know.");

        // Calculate and display the average book rating
        double averageRating = library.getAverageBookRating();
        System.out.println("Average Book Rating: " + averageRating);

        // Find and display the most reviewed book
        Book mostReviewedBook = library.getMostReviewedBook();
        if (mostReviewedBook != null) {
            System.out.println("Most Reviewed Book: " + mostReviewedBook.getTitle());
            System.out.println("Number of Reviews: " + mostReviewedBook.getReviews().size());
            for (String review : mostReviewedBook.getReviews()) {
                System.out.println("Review: " + review);
            }
        } else {
            System.out.println("No reviews found in the library.");
        }
    }
}
