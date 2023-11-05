package HomeWork_Week_9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_Colours_Array {
    //Main method
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        //ArrayList to store the colors name
        ArrayList<String> colors = new ArrayList<>();
        System.out.println("Enter colors name (Type 'Exit' to finish input) : ");
        //while loop for input user data until the user types Exit
        while (true) {
            String color = scanner.nextLine();
            if (color.equalsIgnoreCase("Exit")) {
                break;
            }
            colors.add(color);
        }
        System.out.println("Colors in the ArrayList : " + colors);
        scanner.close();//Scanner closed to release the system resources

    }

    //Static method
    public static void printColors(ArrayList<String> colors) {
        //for each loop to print the collection of colors
        for (String color : colors) {
            System.out.println(color);
        }
    }
}//Run the programme