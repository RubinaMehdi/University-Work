import java.util.Scanner;

public class GradedTask72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. ASCII code to character");
        System.out.println("2. Character to Unicode (ASCII code)");
        System.out.print("Enter 1 or 2: ");
        int choice = input.nextInt();
        input.nextLine(); // consume the leftover newline

        if (choice == 1) {
            // ASCII code to character
            System.out.print("Enter an ASCII code (0 to 127): ");
            int ascii = input.nextInt();
            if (ascii >= 0 && ascii <= 127) {
                char ch = (char) ascii;
                System.out.println("The character for ASCII code " + ascii + " is " + ch);
            } else {
                System.out.println(ascii + " is an invalid ASCII code");
            }
        } else if (choice == 2) {
            // Character to Unicode
            System.out.print("Enter a character: ");
            char ch = input.nextLine().charAt(0);
            int code = (int) ch;
            System.out.println("The Unicode for the character " + ch + " is " + code);
        } else {
            System.out.println("Invalid choice");
        }
    }
}
