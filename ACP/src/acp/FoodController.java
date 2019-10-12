package acp;

import java.util.HashMap;

/**
 *
 * @author Zac Allen
 */
public class FoodController {
    private final HashMap<String,FoodHandler> foodM = new HashMap();

    public void manageRequest(String request, HashMap<String,Object> data) {
        
        FoodHandler handler = foodM.get(request);
        if (handler != null) {
            handler.foodH(data);
        }
    }

    public void mapCommand(String command, FoodHandler handle) {
        foodM.put(command,handle);
    }
}
