import java.util.Scanner;

public class GradedTask28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number between 0 and 1000
        System.out.print("Enter a number between 0 and 1000: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += lastDigit;
            temp = temp / 10;  // remove last digit
        }
        System.out.println("The sum of the digits is " + sum);
    }
}
