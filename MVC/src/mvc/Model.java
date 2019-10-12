package mvc;

/**
 *
 * @author Zac Allen
 */
public class Model {
    private String name;
    private String calories;
    private String impression;
    
    public String getFoodName() {
        return name;
    }
    
    public void setFoodName(String name) {
        this.name = name;
    }
    
    public String getFoodCals() {
        return calories;
    }
    
    public void setFoodCals(String calories) {
        this.calories = calories;
    }
    
    public String getFoodImpression() {
        return impression;
    }
    
    public void setFoodImpression(String impression) {
        this.impression = impression;
    }
}
