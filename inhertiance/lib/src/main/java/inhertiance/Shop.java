package inhertiance;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Review implements addReview{
    private final String name;
    private String description;
    private String priceCat;
    List<Review> reviews=new ArrayList<>();

    public Shop(String name, String description, String priceCat) {
        this.name = name;
        this.description = description;
        this.priceCat = priceCat;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPriceCat() {
        return priceCat;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priceCat='" + priceCat + '\'' +
                '}';
    }

    @Override
    public void addReview(Review review) {

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

}
