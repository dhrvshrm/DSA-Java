package Loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = in.nextInt();

        System.out.println("Enter the second number: ");
        int b = in.nextInt();

        System.out.println("Enter the operation: ");
        char operator = in.next().charAt(0);

        boolean isOperator = operator == '+' || operator == '-' || operator == '*' ||
                operator == '/' || operator == '%';

        if (isOperator) {
            switch (operator) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    if (b != 0) {
                        System.out.println(a / b);
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                case '%':
                    if (b != 0) {
                        System.out.println(a % b);
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
            }
        } else {
            System.out.println("Invalid operator");
        }
    }
}
