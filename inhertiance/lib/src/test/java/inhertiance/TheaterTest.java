package inhertiance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TheaterTest {
    @Test
    void TheaterName() {
        Theater theater = new Theater("Prime");
        assertEquals("Prime", theater.getName());
    }

    @Test
    void addingAndRemovingMovie() {
        Theater theater = new Theater("Prime");
        theater.addMovie("movie1");

        //check if movie was added
        assertEquals(theater.movies.size(), 1);
        //check if dublicate movie can be added

        theater.addMovie("movie1");
        assertEquals(theater.movies.size(), 1);

        //check adding a different movie
        theater.addMovie("movie2");
        assertEquals(theater.movies.size(), 2);

        //check if removing a movie with invalid name doesn't work
        theater.removeMovie("movie100");
        assertEquals(theater.movies.size(),2);

        //check if removing a movie with valid name works
        theater.removeMovie("movie1");
        assertEquals(theater.movies.size(),1);

    }

    @Test
    void addReview() {
        Theater theater = new Theater("Prime");
        theater.addMovie("movie1");

        //check making a review with non-exist movie name doesn't work;
        theater.addReview(new Review("moe","Bad movie",0,"movie100"));
        assertEquals(0,theater.reviews.size());

        //check making a review with exist movie name works;
        theater.addReview(new Review("moe","Bad movie",0,"movie1"));
        assertEquals(1,theater.reviews.size());

        //check making a review without movie name
        theater.addReview(new Review("Mike","Great theater",0));
        assertEquals(2,theater.reviews.size());


    }

}
