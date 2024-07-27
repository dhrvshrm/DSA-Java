
import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        int sum = returnSum();
        System.out.println("The sum is: " + sum);

    }

    static int returnSum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = in.nextInt();
        int sum = number1 + number2;
        return sum;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = in.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum is: " + sum);
    }

}
