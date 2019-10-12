package mvc;

/**
 *
 * @author Zac Allen
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model model = getFoodData();
        
        View view = new View();
        
        Control control = new Control(model, view);
        
        control.updateView();

        control.setFood("Pizza");
        control.setFoodCals("296");
        control.setFoodImpression("Delicous!");
        control.updateView();
        
        control.setFood("Fried Chicken");
        control.setFoodCals("320");
        control.setFoodImpression("Amazing!!");
        control.updateView();
    }
    
    private static Model getFoodData(){
        Model food = new Model();
        food.setFoodName("Shrimp");
        food.setFoodCals("32");
        food.setFoodImpression("Yummy.");
        return food;
    }
}
