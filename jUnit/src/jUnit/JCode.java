package jUnit;

/**
 *
 * @author Zac Allen
 */
public class JCode {
    
    String name;
    int age;
    int weight;
    String favoriteFood;
    
    public JCode(String name, int age, int weight, String favoriteFood){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
    
}


