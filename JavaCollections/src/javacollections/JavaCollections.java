package javacollections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

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
                System.out.println("\nCreate and print the key-value pairs for our map.");
                
                //Create a new map
                Map<String, String> car = new HashMap<>();
                
                //Fill the map
                car.put("a","Corvette");
                car.put("b","Lamborghini");
                car.put("c","Audi");
                car.put("d","Ferrari");
                
                //Create a set to make printing key-value pairs easier.
                Set< Map.Entry< String,String> > set = car.entrySet();    
  
                //Print key-value pairs.
                for (Map.Entry< String,String> map:set) 
                { 
                    System.out.print(map.getKey()+":"); 
                    System.out.println(map.getValue()); 
                }
                
                System.out.println("\nRemove 'b' from our map, then re-print.");
                
                //Remove a key-value pair
                car.remove("b");
                
                for (Map.Entry< String,String> map:set) 
                { 
                    System.out.print(map.getKey()+":"); 
                    System.out.println(map.getValue()); 
                }
                
                System.out.println("\nNow we will add a new key-value pair for 'b', and print both keys and values using the keySet() and values() methods.");
                
                //Add a new key-value pair
                car.put("b", "Mustang");
                
                //Print they keys and values seperately using a different method.
                System.out.println(car.keySet());
                System.out.println(car.values());
                
                System.out.println("\nPlease Enter Your Selection:");
                break;
            case "Q":
                //Create a new Queue called carFifo
                Queue<String> carFifo = new LinkedList<>();
                
                //Populate carFifo
                carFifo.add("Focus");
                carFifo.add("Altima");
                carFifo.add("Civic");
                carFifo.add("Camry");
                
                System.out.println("\nPrint the contents of our queue.");
                
                System.out.println(carFifo);
                
                //Remove the first item in the Queue.
                carFifo.remove();
                
                System.out.println("\nAs we expected, remove() removes the first item added to the queue. It works FIFO as it should.");
                
                System.out.println(carFifo);
                
                System.out.println("\nHere we can see that adding a new item to the queue places it in the back.");
                
                //Add Focus back to the Queue, it should be added to the back.
                carFifo.add("Focus");
                
                System.out.println(carFifo);
                
                System.out.println("\nWe can use peek() to look at the first item in the queue.");
                
                //Peek at the first item in the queue.
                System.out.println(carFifo.peek());
                
                System.out.println("\nPlease Enter Your Selection:");
                break;
            case "T":
                //Create a new TreeSet called tree.
                TreeSet<Integer> tree = new TreeSet<>();
                
                System.out.println("\nPrint our TreeSet. You'll notice that the values are automatically sorted least to greatest.");
                
                //Add the values 1-10 to to tree.
                tree.add(2);
                tree.add(1);
                tree.add(4);
                tree.add(3);
                tree.add(7);
                tree.add(5);
                tree.add(9);
                tree.add(10);
                tree.add(6);
                tree.add(8);
                
                System.out.println(tree);
                
                System.out.println("\nAdd '3' again to the tree. The value will not show up twice because duplicate values are not allowed.");
                
                //Add the value 3. It won't be added because duplicate values are not allowed.
                tree.add(3);
                
                System.out.println(tree);
                
                System.out.println("\nPlease Enter Your Selection:");
                break;
            case "E": 
                running = false;
            }   
        }
        
    }
    
}
