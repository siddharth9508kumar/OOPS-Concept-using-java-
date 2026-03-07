import java.util.ArrayList;

class Movie {
    String title;
    String director;
    String[] actors;
    ArrayList<String> reviews;

    public Movie(String title, String director, String[] actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<>();
    }

    void addReview(String review) {
        reviews.add(review);
    }

    void printReviews() {
        System.out.println("\n--- Reviews for " + title + " ---");
        if (reviews.isEmpty()) {
            System.out.println("No reviews yet.");
        } else {
            for (String r : reviews) {
                System.out.println("-> " + r);
            }
        }
    }

    void MovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.print("Actors: ");
        for (String a : actors) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] actors = {"Hrithik Roshan", "Prabhas", "Akhil Akkineni"};
        Movie m1 = new Movie("Aarambh", "S. S. Rajamouli", actors);

        m1.MovieDetails();

        m1.addReview("Outstanding performances by the lead actors!");
        m1.addReview("Rajamouli once again delivers a visual spectacle.");
        m1.addReview("Perfect blend of action, drama, and emotions.");

        m1.printReviews();
    }
}

// Output
// Title: Aarambh
// Director: S. S. Rajamouli
// Actors: Hrithik Roshan Prabhas Akhil Akkineni

// --- Reviews for Aarambh ---
// -> Outstanding performances by the Lead actors!
// -> Rajamouli once again delivers a visual spectacle.
// -> Perfect blend of action, drama, and emotions.
