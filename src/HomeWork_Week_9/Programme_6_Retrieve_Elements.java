package HomeWork_Week_9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Programme_6_Retrieve_Elements {//Main method
    public static void main(String[] args) {
        //Create an ArrayList of strings
        ArrayList<Integer> arrayList = new ArrayList<>();
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        //Prompt the user to add some elements to the Arraylist
        System.out.println("Enter elements to add to the ArrayList (enter 'done' to finish) : ");
        String input;
        while(true){
            input = scanner.nextLine();
            if(input.equals("done")){
                break;
            }
            arrayList.add(Integer.valueOf(input));
        }
        //Display elements of ArrayList
        System.out.println("Elements in the ArrayList : " + arrayList);
        //Prompt the user to enter the index to find the elements
        System.out.println("Enter the index to retrieve an elements : ");
        //Read the index entered by the user
        int indexToRetrieve = scanner.nextInt();
        //Check if the index is within the valid range of the Arraylist
        if (indexToRetrieve >= 0 && indexToRetrieve < arrayList.size()) {
            int element = arrayList.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + " is : " + element);
        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (arrayList.size() - 1));
        }
        //Close the scanner to release the resource
        scanner.close();
    }
}// Run the program