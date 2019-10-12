package acp;

import java.util.HashMap;

/**
 *
 * @author Zac Allen
 */
public class FoodCatcher implements FoodHandler {
    @Override
    public void foodH(HashMap<String, Object> data) {
        System.out.println("Displaying Foods: "+data);
    }
}
