import java.io.*;
import java.util.*;

public class LabTask2 {
    public static void main(String[] args) {
        String fileName = "numbers.txt";
        ArrayList<Integer> list = new ArrayList<>();

        try (Scanner file = new Scanner(new File(fileName))) {

            while (file.hasNextInt()) {
                list.add(file.nextInt());
            }

            Collections.sort(list); // sort in ascending order

            System.out.println("Sorted Data:");
            for (int num : list) {
                System.out.println(num);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
