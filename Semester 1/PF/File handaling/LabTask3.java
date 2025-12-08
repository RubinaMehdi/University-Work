import java.io.*;
import java.util.*;

public class LabTask3 {

    // Function to check prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String fileName = "numbers.txt";
        ArrayList<Integer> list = new ArrayList<>();

        // Step 1: Read numbers from file
        try (Scanner file = new Scanner(new File(fileName))) {
            while (file.hasNextInt()) {
                list.add(file.nextInt());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Step 2: Remove prime numbers
        list.removeIf(num -> isPrime(num));

        // Step 3: Write updated data back to same file
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            for (int num : list) {
                pw.println(num);
            }
            System.out.println("Prime numbers removed and file updated.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
