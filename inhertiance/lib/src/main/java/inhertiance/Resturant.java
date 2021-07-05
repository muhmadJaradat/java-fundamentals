package inhertiance;

import java.util.ArrayList;
import java.util.List;

public class Resturant extends Review {
    private  String name;
    private int stars;
    private  String price;
    List<Review> resturantReview=new ArrayList();

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
    public void addReview(Review review){
        if (resturantReview.size()==0){
            resturantReview.add(review);
           setStars(review.getStars());
        }
        else {
            boolean isHere=false;
            for (Review el: resturantReview
                 ) {
                if(el.getAuthor()==review.getAuthor())isHere=true;
            }
            if (isHere == false) {
                resturantReview.add(review);
                setStars(review.getStars());
            }

        }
        }

        public void changeRating(int stars){

        }
    }

