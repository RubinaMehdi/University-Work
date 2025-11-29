import java.util.Scanner;

public class GradedTask81b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();  // Read user input

        System.out.print("Reversed number is: ");
        reverse(num);  // Call the method
    }

    // Method to display integer in reverse order
    public static void reverse(int number) {
        while (number != 0) {
            int lastDigit = number % 10;
            System.out.print(lastDigit);  // Print the last digit
            number /= 10;                 // Remove the last digit
        }
        System.out.println();  // Move to next line after printing
    }
}
