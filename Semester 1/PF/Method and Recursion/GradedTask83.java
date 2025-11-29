import java.util.Scanner;

public class GradedTask83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = sc.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double smallest = Math.min(num1, Math.min(num2, num3));
        double largest = Math.max(num1, Math.max(num2, num3));
        double middle = num1 + num2 + num3 - smallest - largest;

        System.out.println("Numbers in increasing order: " + smallest + " " + middle + " " + largest);
    }
}
