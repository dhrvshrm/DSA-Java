import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number == 0) {
            System.out.println(0);
        } else if (number == 1) {
            System.out.println(1);
        } else {
            int prev = 0;
            int next = 1;
            int count = 2;

            while (count <= number) {
                int temp = next;
                next = prev + next;
                prev = temp;
                count++;
            }
            System.out.println(next);
        }
        in.close();
    }
}
