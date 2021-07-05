package inhertiance;

import java.util.ArrayList;
import java.util.List;

public class Review {
    private  String author;
    private String body;
    private int stars;

    public Review(String author, String body, int stars) {
        this.author = author;
        this.body = body;
        this.stars = stars;
    }

    public Review() {
    }


    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
    public  String toString(){
return "Author name: "+author+"\nReview body: "+body+"\nGiven stars: "+stars;
    }


}
