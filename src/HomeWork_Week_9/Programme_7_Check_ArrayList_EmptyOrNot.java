package HomeWork_Week_9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_Check_ArrayList_EmptyOrNot {
    //Main method
    public static void main(String[] args) {
        isArrayListEmptyOrNot();//calling the method
    }
    public static void isArrayListEmptyOrNot(){
        //Create an ArrayList to store elements
        ArrayList<String> myArrayList = new ArrayList<>();
        //create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        //prompt the user to add elements to the ArrayList
        System.out.println("Enter elements to add to the ArrayList (enter 'done' to finish) : ");
        String input;
        while(true){
            input = scanner.nextLine();
            if(input.equals("done")){
                break;
            }
            myArrayList.add(input);
        }
        //Check if the ArrayList is empty
        if(myArrayList.isEmpty()){
            System.out.println("The ArrayList is empty.");
        }else{
            System.out.println("The ArrayList is not empty");
        }
        scanner.close(); //  Close the scanner
    }
}// Run the program