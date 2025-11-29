import java.util.Scanner;

public class GradedTask81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();  // read number from user

        int sum = sumDigits(n1);  // call the method
        System.out.println("The sum of digits is: " + sum);

    }   
    public static int sumDigits(int num) {

            int sum = 0;
            while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
            System.out.println(sum);
        }
            return sum;
        }
    }

        