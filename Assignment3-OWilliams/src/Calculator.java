import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Type a number (integer or decimal) and press <ENTER>: ");
        double num1 = inputScanner.nextDouble();

        System.out.println("Type another number (integer or decimal) and press <ENTER>: ");
        double num2 = inputScanner.nextDouble();

        System.out.println("What math operator would you like to use? (+, -, *, /)");
        char operator = inputScanner.next().charAt(0);

        double result = 0.0;

        // Use 'if' statements to determine the math operation
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        } else {
            System.out.println("Invalid operator. Please enter +, -, *, or /");
            System.exit(0);
        }

        // Output the result with specified formatting
        System.out.println("The result is " + num1 + " " + operator + " " + num2 + " = " + result);

    }
}


