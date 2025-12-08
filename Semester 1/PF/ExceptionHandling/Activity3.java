import java.util.Scanner;
import java.util.InputMismatchException;

public class Activity3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            int[] numbers = { 10, 20, 30 };

            System.out.print("Enter an index (0-2): ");
            int index = input.nextInt();

            System.out.println("Value at index " + index + " = " + numbers[index]);
        }

        catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer only!");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of range (valid: 0 to 2)!");
        }

        System.out.println("Program finished.");
    }
}
