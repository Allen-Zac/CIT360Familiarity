package json;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import org.quickconnect.json.*;

/**
 *
 * @author Zac Allen
 */
public class JSON {

    //This program accepts a JSON file, then changes the output of it.
    public static void main() {
        
	System.out.print("r = Reads a JSON string and converts it to an ArrayList or HashMap \n" 
                       + "t = Reads and Parses a JSON file");
	System.out.print("Select an option: ");
        try (Scanner scan = new Scanner(System.in)) {
        String userResponse = scan.nextLine();
            
        //Allows for a selection.
        switch (userResponse) {
            case "r":
                jsonUtility();
                break;
            case "t":
                jsonInputStream();
                break;
            default:
                System.out.println("Input not found. Please try again.");
                break;
            }
        }
    }
	
    private static void jsonUtility() {
           
        //Input the JSON file path.
        try ( 
            Scanner scan2 = new Scanner(System.in)) {
            String userResponse2 = "";
            System.out.print("Input the name of your JSON file: /n");
            userResponse2 = scan2.nextLine();
            
            //JUtil parses the information into a HashMap.
            String infoIn = JSONUtilities.parse(userResponse2).getClass().getSimpleName();
           
            if("HashMap".equals(infoIn)){
                HashMap jsonHash = (HashMap) JSONUtilities.parse(userResponse2);
                System.out.println("Your file has successfully been converted into a HashMap.");
                System.out.println("");
                System.out.println(jsonHash);

                //Allows the new info to be saved.
                saveResult(jsonHash);
            } 
        
        }
    }
	 
    //Option 2. Implements Jinstream to read the JSON file.
    private static void jsonInputStream() {

        Scanner inputScan;
        
        try (
            Scanner scan3 = new Scanner(System.in)) {
            String userResponse3 = "";
            System.out.print("Enter the file path to reach your JSON file: ");
            userResponse3 = scan3.nextLine();
            InputStream userInputString = new FileInputStream(new File(userResponse3));
            inputScan = new Scanner(userInputString);
            String userString = "";
            
        while (inputScan.hasNext()) {
            userString += inputScan.nextLine();
        }
            
            //Parses the data to create data type.
            String inType = JSONUtilities.parse(userString).getClass().getSimpleName();
            JSONInputStream jsonInput = new JSONInputStream(new FileInputStream(new File(userResponse3)));

        //New HashMap to hold the data.
        if( "HashMap".equals(inType)){
            HashMap newJMap = (HashMap) jsonInput.readObject();
            System.out.println("File has been converted into a HashMap.");
            System.out.println(newJMap);
            
            saveResult(newJMap);
        }
        //New ArrayList to hold the data.
        else if ("ArrayList".equals(inType)){
            ArrayList newJArray = (ArrayList) jsonInput.readObject();
            System.out.println("File has been converted into an ArrayList.");
            System.out.println(newJArray);
            
            saveResult(newJArray);
        }
        }
            inputScan.close();
    }
        
	//Here is where we can save our new files..
        private static void saveResult(Serializable object) {
            System.out.println("Save Results? y or n ");
       
            try (Scanner scan4 = new Scanner(System.in)) {
            String userResponse4 = scan4.next();
            
            //Uses JSON to save the data.
            if (userResponse4.equals("y")) {
                System.out.print("Input the file path where the new file should be saved: ");
                String newFP = scan4.next();
                FileOutputStream fOut = new FileOutputStream(newFP);
                JSONOutputStream jOut = new JSONOutputStream(fOut);
                jOut.writeObject(object);
                System.out.println("Your file was successfully saved!");
            }
        } 
    }    
}