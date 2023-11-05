package HomeWork_Week_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme_11_Compare_ArrayList {
    //Main method
    public static void main(String[] args) {
        //Calling static method directly
        compareToArrayList();
    }

    public static void compareToArrayList() {
        System.out.println("Before compare : ");
        //Create first ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Black");
        list1.add("White");
        list1.add("Pink");
        System.out.println("Elements in list1 : " + list1);

        //Create second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Black");
        list2.add("Pink");
        System.out.println("Elements in list2 : " + list2);

        //Create HashSet to efficiently compare the elements
        HashSet<String> set1 = new HashSet<>(list1);
        HashSet<String> set2 = new HashSet<>(list2);

        //Find common elements
        set1.retainAll(set2);
        System.out.println("Common elements : " + set1);

        //Find elements that are in list1 but not in list2
        List<String> elementsOnlyInList1 = new ArrayList<>(set1);
        elementsOnlyInList1.removeAll(list1);

        //Find the elements that are in list2 but not in list1
        List<String> elementsOnlyInList2 = new ArrayList<>(set2);
        elementsOnlyInList1.removeAll(list1);

        //Display the output
        System.out.println("After compare : ");
        System.out.println("Elements in list1 : " + elementsOnlyInList1);
        System.out.println("Elements in list2 : " + elementsOnlyInList2);
    }
}// Run the program