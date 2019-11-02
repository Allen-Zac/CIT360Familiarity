package hibernate;

/**
 *
 * @author Zac Allen
 */
public class FoodObject {
    private String foodCategory,type;
	private int identifier;
                
	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	public String getFoodCategory() {
            return foodCategory;
	}

	public void setFoodCategory(String foodCategory) {
            this.foodCategory = foodCategory;
	}

        public String getType() {
            return type;
        }
        
        public void setFoodType(String type) {
            this.type = type;
        }
}
