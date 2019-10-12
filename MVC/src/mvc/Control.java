package mvc;

/**
 *
 * @author Zac Allen
 */
public class Control {
    private final Model model;
    private final  View view;
    
    public Control(Model model, View view){
        this.model = model;
        this.view = view;
    }
    
    public String getFood(){
        return model.getFoodName();
    }
    
    public void setFood(String name){
        model.setFoodName(name);
    }
    
    public String getFoodCals(){
        return model.getFoodCals();
    }
    
    public void setFoodCals(String calories){
        model.setFoodCals(calories);
    }
    
    public String getFoodImpression(){
        return model.getFoodImpression();
    }
    
    public void setFoodImpression(String impression){
        model.setFoodImpression(impression);
    }
    
    public void updateView(){
        view.createNewFood(model.getFoodName(), model.getFoodCals(), model.getFoodImpression());
    }
}
