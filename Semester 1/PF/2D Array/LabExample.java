public class LabExample {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int[][] array = new int[rows][cols];

        // Initialize array with natural numbers starting from 11
        int number = 11;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = number++;
            }
        }

        // Display the array
        System.out.println("The 3x3 array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // Count prime numbers
        int primeCount = 0;
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
