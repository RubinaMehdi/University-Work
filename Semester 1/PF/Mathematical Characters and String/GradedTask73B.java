import java.util.Scanner;

public class GradedTask73B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hex = input.next().toUpperCase(); // convert input to uppercase

        // Validate input: must be 0-9 or A-F
        if (hex.length() == 1 && ((hex.charAt(0) >= '0' && hex.charAt(0) <= '9') ||
                                  (hex.charAt(0) >= 'A' && hex.charAt(0) <= 'F'))) {

            int decimal = 0;

            // Convert hex digit to decimal
            if (hex.charAt(0) >= '0' && hex.charAt(0) <= '9') {
                decimal = hex.charAt(0) - '0';
            } else {
                decimal = hex.charAt(0) - 'A' + 10;
            }

            // Convert decimal to binary string
            String binary = Integer.toBinaryString(decimal);
            System.out.println("The binary value is " + binary);

        } else {
            System.out.println(hex + " is an invalid input");
        }
    }
}
