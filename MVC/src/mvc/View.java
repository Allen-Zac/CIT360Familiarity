package mvc;

/**
 *
 * @author Zac Allen
 */
public class View {
    public void createNewFood(String foodName, String calories, String impression){
        System.out.println("Name: " + foodName);
        System.out.println("Number of Calories: " + calories);
        System.out.println("Impression of Food: " + impression);
        System.out.print("*********************************\n");
    }
}
