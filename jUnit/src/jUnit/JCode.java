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
    boolean happy;
    boolean old;
    String[] array;
    
    public JCode(){
        
    }
    
    public JCode(String name, int age, int weight, String favoriteFood, boolean happy, boolean old, String[] array){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.favoriteFood = favoriteFood;
        this.happy = happy;
        this.old = old;
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }
    
    public boolean getHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public boolean getOld() {
        return old;
    }

    public void setOld(boolean old) {
        this.old = old;
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


