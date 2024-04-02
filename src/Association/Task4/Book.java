package Association.Task4;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double rating;
    private ArrayList<String> reviews;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.reviews = new ArrayList<>();
        // Initialize with an invalid rating to signify no rating has been set yet.
        this.rating = -1.0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0.0 && rating <= 5.0) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating. Ratings should be between 0.0 and 5.0.");
        }
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void addReview(String review) {
        reviews.add(review);
    }
}
