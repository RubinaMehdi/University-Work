import java.util.Scanner;

public class GradedTask82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }

    // Return the reversal of an integer
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }
        return reversed;
    }

    // Return true if number is a palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
