package inhertiance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ShopTest {
    @Test void shopName(){
        Shop Nike=new Shop("Nike","Shoes shop","$$$$$");
       assertEquals("Nike", Nike.getName());
       assertEquals("$$$$$",Nike.getPriceCat());
    }

    @Test void addReview(){
        Shop Nike=new Shop("Nike","Shoes shop","$$$$$");
        Nike.addReview(new Review("Moe","Good quality but high price",4));
        //Check if review is added
        assertEquals(Nike.reviews.size(),1);
        //Check if another review can be added
        Nike.addReview(new Review("Mike","best shop ever",5) );
        assertEquals(Nike.reviews.size(),2);
        //Check if the same reviewer can't review multiple times
        Nike.addReview(new Review("Mike","best shop ever",5) );
        assertEquals(Nike.reviews.size(),2);

    }
}


