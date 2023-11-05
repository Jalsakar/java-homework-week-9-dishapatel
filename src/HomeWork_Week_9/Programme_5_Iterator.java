package HomeWork_Week_9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to iterate through all elements in an array list using Iterator.
 */
public class Programme_5_Iterator {
    //Main method
    public static void main(String[] args) {
        //Scanner declaration to read the input from the console
        Scanner scanner = new Scanner(System.in);
        //ArrayList to store the elements
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Enter elements (Type 'Exit' to finish input) : ");
        //while loop to enter the user input using scanner
        // and add each element to the ArrayList
        while (true) {
            String element = scanner.nextLine();
            if (element.equalsIgnoreCase("Exit")) {
                break;
            }
            arrayList.add(element);
        }
        System.out.println("Elements in the ArrayList : ");
        elementsInArrayListWithIterator(arrayList);
        scanner.close();// close the Scanner to release the resources
    }
    // static method takes the arguments and gets an iterator for the Arraylist

    public static void elementsInArrayListWithIterator(ArrayList<String> list) {
        java.util.Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}//Run the program