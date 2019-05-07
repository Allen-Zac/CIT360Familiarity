package javacollections;

import java.util.Scanner;

/**
 *
 * @author Zac Allen
 */
public class JavaCollections {

    public static void main(String[] args) {
        boolean running = true;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Which collection would you like to run?");
        
        while(running == true){
            
            String input = s.nextLine();
            
            switch (input.trim().toUpperCase()) {
            case "N":
                System.out.println("Place holder for collection 1");
                break;
            case "L":
                System.out.println("Place holder for collection 2");
                break;
            case "H":
                System.out.println("Place holder for collection 3");
                break;
            case "Q": 
                running = false;
            }   
        }
        
    }
    
}
