package HomeWork_Week_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Create a HashMap object called people that will store String keys and Integer values.
 * And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap_Object {
    //Main method
    public static void main(String[] args) {
        //Object creation to call the instance method
        Programme_9_HashMap_Object people1 = new Programme_9_HashMap_Object();
        people1.toStoreKeysAndValues();

    }

    //Instance method
    public void toStoreKeysAndValues() {
        //created empty HashMap named people to store name-age pairs
        Map<String, Integer> people = new HashMap<>();
        //Scanner declaration to read the user input
        Scanner scanner = new Scanner(System.in);
        //while loop used to enter key-value pairs or type quiet to exit
        System.out.println("Enter key-value pairs : or Type 'quit' to exit : ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            //Split the input into Array key-value using a space character
            String[] keyValue = input.split(" ");
            //if statement used to check the validity of the user input
            if (keyValue.length == 2) {
                String name = keyValue[0];
                int age = Integer.parseInt(keyValue[1]);
                people.put(name, age);
            } else {
                System.out.println("Invalid input. Please use the correct format 'name, age'.");
            }
        }
        //To display the stored input in name and age pair
        System.out.println("Name and Age in the map : ");
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println("Name : " + entry.getKey() + " Age : " + entry.getValue());
        }
        //close the scanner to release the system resources
        scanner.close();
    }
}//Run the program