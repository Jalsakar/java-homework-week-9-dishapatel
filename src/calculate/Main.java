package calculate;
//Subclass
/**
 * Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 * 4. Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

import java.util.Scanner;

public class Main {
    //Main method
    public static void main(String[] args) {
        //Scanner declaration for reading input from the console
        Scanner scanner = new Scanner(System.in);
        // To use the methods and functionality of the Calculator class through the calculator object.
        Calculator calculator = new Calculator();
        char continueCalculation;
        //do-while loop is used to repeatedly prompt the user for input and perform calculations.
        do {
            System.out.println("PLease enter first number : ");
            int num1 = scanner.nextInt();
            System.out.println("Please enter second number : ");
            int num2 = scanner.nextInt();
            System.out.println("Please choose the operator(+, -, *, /) : ");
            char symbol = scanner.next().charAt(0);
            //calculateResult method is called from Calculator class.
            calculator.calculateResult(num1, num2, symbol);
            System.out.println(" ");
            System.out.println("Would you like to do more calculations? Please enter : 'Y' or 'N' ");
            continueCalculation = scanner.next().charAt(0);
        } while (continueCalculation == 'Y' || continueCalculation == 'y');
        //If the user enters 'Y' or 'y', the loop continues; otherwise, the program terminates.
        System.out.println("Program Terminated.");
        scanner.close();//Closing Scanner to release the resources.
    }
}// Run the program