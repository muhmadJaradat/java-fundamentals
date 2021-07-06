package inhertiance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Theater extends Review implements addReview {
    private final String name;
    List<Review> reviews;
    Set<String> movies;

    public Theater(String name) {
        this.name = name;
        this.reviews=new ArrayList<>();
        this.movies=new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public Set<String> getMovies() {
        return movies;
    }
    public void addMovie(String movie){
        movies.add(movie);
    }
    public void removeMovie(String movie){
        movies.remove(movie);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", reviews=" + reviews +
                ", movies=" + movies +
                '}';
    }

    @Override
    public void addReview(Review review) {

        if (movies.contains(review.getMovie())||review.getMovie()==null ){
        if (reviews.size()==0){
            reviews.add(review);
            setStars(review.getStars());
        }
        else {
            boolean isHere=false;
            for (Review el: reviews
            ) {
                if(el.getAuthor()==review.getAuthor())isHere=true;
            }
            if (isHere == false) {
                reviews.add(review);
                setStars(review.getStars());
            }

        }
    }
        else {
            System.out.println("Sorry but "+review.getMovie()+" is not in our list!");
        }
    }


}
