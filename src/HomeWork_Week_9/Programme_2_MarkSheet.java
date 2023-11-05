package HomeWork_Week_9;

import java.util.Scanner;

public class Programme_2_MarkSheet {
    public static void main(String[] args) {
        studentMarkSheet();//calling static method
    }
    //Input Student Details and Marks

    public static void studentMarkSheet() {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student Roll No:");
        int rollNo = scanner.nextInt();
        int mathsMarks, scienceMarks, englishMarks;
        //while loop to validate marks
        while (true) {
            System.out.println("Enter Maths marks (0-100):");
            mathsMarks = scanner.nextInt();
            if (mathsMarks >= 0 && mathsMarks <= 100) {
                break;
            } else {
                System.out.println("Invalid Input, Marks should be between 0 to 100.");
            }
        }
        while (true) {
            System.out.println("Enter Science marks (0-100):");
            scienceMarks = scanner.nextInt();
            if (scienceMarks >= 0 && scienceMarks <= 100) {
                break;
            } else {
                System.out.println("Invalid Input, Marks should be between 0 to 100.");
            }
        }
        while (true) {
            System.out.println("Enter English marks (0-100):");
            englishMarks = scanner.nextInt();
            if (englishMarks >= 0 && englishMarks <= 100) {
                break;
            } else {
                System.out.println("Invalid Input, Marks should be between 0 to 100.");
            }
        }
        int totalMarks = mathsMarks + scienceMarks + englishMarks;//Calculate total marks
        double percentage = (totalMarks / 300.0) * 100;//Calculate percentage
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printMarkSheet(name, rollNo, mathsMarks, scienceMarks, englishMarks, totalMarks, percentage, result, grade);
        scanner.close();//Closing Scanner to release the resources.
    }

    // Determine Pass or Fail with if statement
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }
//Assigning the grade by using if....else if statement
    public static String calculateGrade(double percentage, String result) {
        String grade = null;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "-";
        }
        return grade;
    }
//Printing mark sheet
    public static void printMarkSheet(String name, int rollNo, int mathMarks, int scienceMarks, int englishMarks, int totalMarks, double percentage, String result, String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                |");
        System.out.println("| Roll No:" + rollNo + "                 |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Maths:" + mathMarks + "                  |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + totalMarks + "                 |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }
}// Run the program