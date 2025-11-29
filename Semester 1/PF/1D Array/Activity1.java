import java.util.Scanner;

public class Activity1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        // Input from user
        System.out.println("Enter array elements...");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Find largest
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Find second largest
        int largest2 = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != largest && numbers[i] > largest2) {
                largest2 = numbers[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("2nd Largest = " + largest2);
    }
}
