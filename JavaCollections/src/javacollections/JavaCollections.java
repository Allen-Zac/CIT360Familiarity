package javacollections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Zac Allen
 */
public class JavaCollections {

    public static void main(String[] args) {
        boolean running = true;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Which collection would you like to run?\n"
                + "L = List\n"
                + "S = Set\n"
                + "M = Map\n"
                + "Q = Queue\n"
                + "T = Tree\n"
                + "E = Exit\n\n"
                + "Please Enter Your Selection:");
        
        
        while(running == true){
            
            String input = s.nextLine();
            
            switch (input.trim().toUpperCase()) {
            case "L":
                //Create a new List called carList.
                List<String> carList = new ArrayList<>();
                
                //Add the first element to the List.
                carList.add(0,"Camaro");
                
                System.out.println("\ncarList:\n" + carList);
                
                //Add two new elements to the List.
                carList.add("Lamborghini");
                carList.add("Mustang");
                
                System.out.println("\ncarList after adding two more cars:\n" + carList);
                
                //Add an element into the middle of the list.
                carList.add(1,"Corvette");
                
                System.out.println("\ncarList after adding a new car to index 1:\n" + carList);
                
                //Remove two different elements from the List using different syntax.
                carList.remove(2);
                carList.remove("Camaro");
                
                System.out.println("\ncarList after removing two elements:\n" + carList);
                
                System.out.println("\nPlease Enter Your Selection:");
                break;
            case "S":
                //Create a new Set called numSet1
                Set<Integer> numSet1 = new HashSet<>();
                
                //Add 5 new elements to numSet1. (Note that '0' will not be added twice.)
                numSet1.add(0);
                numSet1.add(1);
                numSet1.add(2);
                numSet1.add(0);
                numSet1.add(3);
                
                System.out.println("\nnumSet1 after adding 5 ints(notice that '0' ins't added twice):\n" + numSet1);
                
                //Create a new set called numSet2.
                Set<Integer> numSet2 = new HashSet<>();
                
                //Add 5 new elements to numSet2.
                numSet2.add(2);
                numSet2.add(3);
                numSet2.add(4);
                numSet2.add(5);
                numSet2.add(6);
                
                System.out.println("\nnumSet1: " + numSet1 + 
                        "\nnumSet2: "+ numSet2);
                
                //Create a new Set called union which contains all of the items from numSet1.
                Set<Integer> union = new HashSet<>(numSet1); 
                
                //Add all of numSet2 to numSet1 to see how the union works.
                union.addAll(numSet2);
                
                System.out.println("\nUnion of numSet1 and numSet2:\n" + union);
                
                //Create a new Set called intersection which contains all the data from numSet1.
                Set<Integer> intersection = new HashSet<>(numSet1);
                
                //Perform an intersection of numSet1 and numSet2.
                intersection.retainAll(numSet2);
                
                System.out.println("\nIntersection of numSet1 and numSet2:\n" + intersection);
                
                //Create a new Set which contains the data from numSet1.
                Set<Integer> difference = new HashSet<>(numSet1);
                
                //Find the difference between numSet1 and numSet2.
                difference.removeAll(numSet2);
                
                System.out.println("\nDifference of numSet1 and numSet2:\n" + difference);
                
                //Create a new Set which contains the data from numSet2.
                Set<Integer> difference2 = new HashSet<>(numSet2);
                
                //Find the difference between numSet2 and numSet1.
                difference2.removeAll(numSet1);
                
                System.out.println("\nDifference of numSet2 and numSet1:\n" + difference2);
                
                System.out.println("\nPlease Enter Your Selection:");
                break;
            case "M":
                System.out.println("Place holder for Map");
                System.out.println("\nPlease Enter Your Selection:");
                break;
            case "Q":
                System.out.println("Place holder for Queue");
                System.out.println("\nPlease Enter Your Selection:");
                break;
            case "T":
                System.out.println("Place holder for Tree");
                System.out.println("\nPlease Enter Your Selection:");
                break;
            case "E": 
                running = false;
            }   
        }
        
    }
    
}
