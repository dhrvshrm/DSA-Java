import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");

        int a = in.nextInt();
        System.out.println("Enter the second number: ");
        int b = in.nextInt();
        System.out.println("Enter the operation: ");

        while (true) {

            char operator = in.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                if (operator == '+') {
                    System.out.println(a + b);
                }
                if (operator == '-') {
                    System.out.println(a - b);
                }
                if (operator == '*') {
                    System.out.println(a * b);
                }
                if (operator == '/') {
                    if (b != 0) {
                        System.out.println(a / b);
                    } else {
                        System.out.println("Division by 0 is not a valid operation");
                    }
                }
                if (operator == '%') {
                    System.out.println(a % b);
                }
                break;
            } else {
                System.out.println("Invalid operator");
            }
        }

    }
}
