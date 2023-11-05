package calculate;
//Super class

/**
 * Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 */
public class Calculator {
    //Instance methods for addition, subtraction, multiplication and division with two parameters.
    public void addition(int a, int b) {
        System.out.println(a + b);
    }

    public void subtraction(int a, int b) {
        System.out.println(a - b);
    }

    public void multiplication(int a, int b) {
        System.out.println(a * b);
    }

    public void division(int a, int b) {
        if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    //Instance methods for addition, subtraction, multiplication and division with three parameters.
    public void calculateResult(int num1, int num2, char symbol) {
        int result = 0;
        //Switch statement used to determine that when the user enters first
        //number and second number and symbol based on symbol it does arithmetic operation.
        switch (symbol) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition is : " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction is : " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication is : " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Division is : " + result);
                break;
            default:
                System.out.println("Error: Invalid symbol.");
        }
    }
}