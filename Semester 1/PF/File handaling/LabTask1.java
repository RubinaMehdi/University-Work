import java.io.*;
import java.util.*;

public class LabTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fileName = "numbers.txt";

        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {

            System.out.println("Enter 10 integer values:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int num = input.nextInt();
                pw.println(num);
            }

            System.out.println("Data successfully saved in " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
