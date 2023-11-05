package HomeWork_Week_9;
/**
 * Write a Java program to reverse an array of integer values
 */

import java.util.Arrays;
import java.util.Scanner;

public class Programme_3_Reverse_Integer_Value {
    //Main method
    public static void main(String[] args) {
        //Scanner declaration to read th user input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = scanner.nextInt();
        int[] originalArray = new int[n];//a size of array to store the integer value
        System.out.println("Enter " + n + " Integer values : ");
        //using for loop to input the integer value
        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }
        int[] reverseArray = reverseArray(originalArray);
        System.out.println("Original Array is :" + Arrays.toString(originalArray));
        System.out.println("Reverse Array is : " + Arrays.toString(reverseArray));
        scanner.close();// scanner closed to release the system resources
    }
    //Reverse the order of the elements of the Array
    public static int[] reverseArray(int[] array) {
        int length = array.length;//calculate the length of the original array
        int[] reverse = new int[length];//reverse array has same length as original array
        for (int i = 0; i < length; i++) //iterates through the indices of the original array.
        {
            reverse[i] = array[length - 1 - i];
        }
        return reverse;//has reversed elements
    }
//Print the elements of the Arrays on separate line
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.println(j + " ");
        }
        System.out.println();
    }
}// Run the program