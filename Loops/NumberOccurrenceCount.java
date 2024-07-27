package Loops;

import java.util.Scanner;

public class NumberOccurrenceCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;
        while (number > 0) {
            int remainder = number % 10;
            if (remainder == 2) {
                count++;
            }
            number = number / 10;
        }
        System.out.println(count);
    }
}
