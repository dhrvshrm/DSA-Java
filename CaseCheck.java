import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char character = in.next().trim().charAt(0);

        if (character >= 'a' && character <= 'z') {
            System.out.println("Lowercase");
        } else if (character >= 'A' && character <= 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Invalid");
        }
    }
}
