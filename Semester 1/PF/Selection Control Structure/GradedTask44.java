import java.util.Scanner;

public class GradedTask44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int min = (a < b ? a : b);
        System.out.println("Minimum = " + min);
    
        System.out.print("Enter two numbers: ");
         a = input.nextInt();
         b = input.nextInt();

        int max = (a > b ? a : b);
        System.out.println("Maximum = " + max);

        System.out.print("Enter a number: ");
        int x = input.nextInt();

        int sign = (x > 0 ? 1 : (x < 0 ? -1 : 0));
        System.out.println("Sign = " + sign);
    }
}
