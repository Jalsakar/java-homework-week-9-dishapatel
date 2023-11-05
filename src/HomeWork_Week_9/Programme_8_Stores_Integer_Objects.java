package HomeWork_Week_9;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if else)
 */
public class Programme_8_Stores_Integer_Objects {
    public static void main(String[] args) {
        Programme_8_Stores_Integer_Objects obj = new Programme_8_Stores_Integer_Objects();
        obj.toStoreIntegerObjects();
    }

    public void toStoreIntegerObjects() {
        //Create a HashSet to store Integer objects
        HashSet<Integer> numberSet = new HashSet<>();
        //Add numbers 4, 7, and 8 to the set
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);
        System.out.println("Numbers in the set : ");
        //Iterate through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            //Check if the number is in the set
            if (numberSet.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }
    }
}// Run the program