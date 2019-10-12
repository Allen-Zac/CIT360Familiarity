package acp;

import java.util.HashMap;

/**
 *
 * @author Zac Allen
 */
public class ACP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FoodController acpManager = new FoodController();

        acpManager.mapCommand("Food Info", new FoodCatcher());

        HashMap foodInfo = new HashMap();
        foodInfo.put("Pizza","Delicious");
        foodInfo.put("Cheeseburger","Tasty");
        foodInfo.put("Raisins","Blech");
        foodInfo.put("Squid", "Chewy");
        
        acpManager.manageRequest("Food Info",foodInfo);
    }
    
}
