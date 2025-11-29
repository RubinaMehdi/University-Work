import java.util.Scanner;

public class MaxPrimeSimple {

    // Check if number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];

        // Input array
        System.out.println("Enter elements of 3x4 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Find row with maximum primes
        int maxRowPrimes = 0, maxRow = 0;
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                if (isPrime(arr[i][j])) count++;
            }
            if (count > maxRowPrimes) {
                maxRowPrimes = count;
                maxRow = i;
            }
        }

        // Find column with maximum primes
        int maxColPrimes = 0, maxCol = 0;
        for (int j = 0; j < 4; j++) {
            int count = 0;
            for (int i = 0; i < 3; i++) {
                if (isPrime(arr[i][j])) count++;
            }
            if (count > maxColPrimes) {
                maxColPrimes = count;
                maxCol = j;
            }
        }

        // Display result
        if (maxRowPrimes >= maxColPrimes) {
            System.out.println("Row with maximum prime numbers: Row " + (maxRow + 1));
        } else {
            System.out.println("Column with maximum prime numbers: Column " + (maxCol + 1));
        }

        sc.close();
    }
}
