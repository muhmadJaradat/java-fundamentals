package inhertiance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ResturantTest {
    @Test void ResturantName(){
        Resturant nameTest=new Resturant("Alreef","$$");
        assertEquals(nameTest.getName(),"Alreef");
    }
    @Test void ResturantToString(){
        Resturant KFC= new Resturant("KFC","$$$");
        assertEquals(KFC.toString(),"KFC has "+KFC.getStars()+" stars and its price is $$$");
    }
    @Test void ResturantReview(){
        Resturant resturant=new Resturant("KFC","$$$");

        resturant.addReview(new Review("Yousef","bad Resturant",3));
        resturant.addReview(new Review("moe","bad Resturant",4));
        resturant.addReview(new Review("moe","bad Resturant",4));
        resturant.addReview(new Review("Yousef","bad Resturant",3));
         // Check if the add review methods add dublicate or not ,, here we should only have 2 reviews
        assertEquals( resturant.resturantReview.size(),2);
        // Check if the rating does change after adding new review
        //here the based on last valie update the rating stars should be 4
        assertEquals( resturant.getStars(),4);
        // after adding new review with different rating
        resturant.addReview(new Review("Ali","Good Resturant",5));
        assertEquals(resturant.getStars(),5);


    }
}

