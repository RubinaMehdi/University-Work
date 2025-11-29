import java.util.Scanner;

public class Prime2DArray {
    
    // User-defined method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // numbers less than 2 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // divisible by some number, not prime
            }
        }
        return true; // number is prime
    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int[][] array = new int[rows][cols];
        int number = 11; // starting number
        int primeCount = 0;

        // Initialize the 2D array with natural numbers starting from 11
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = number;
                number++;
            }
        }

        // Display the array
        System.out.println("The 3x3 Array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // Count the prime numbers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isPrime(array[i][j])) {
                    primeCount++;
                }
            }
        }

        System.out.println("Number of prime numbers in the array: " + primeCount);
    }
}
