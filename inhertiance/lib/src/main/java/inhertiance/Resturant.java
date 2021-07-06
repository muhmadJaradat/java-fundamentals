package inhertiance;

import java.util.ArrayList;
import java.util.List;

public class Resturant extends Review implements addReview {
    private  String name;
    private int stars;
    private  String price;
    List<Review> reviews =new ArrayList();

    public Resturant(String name,String price) {

        this.name=name;
        this.stars=0;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String toString(){
        if (stars==1) return name +" has "+stars+" star and its price is "+price;
        return name +" has "+stars+" stars and its price is "+price;
    }
    @Override
    public void addReview(Review review){
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

        public void changeRating(int stars){

        }
    }

