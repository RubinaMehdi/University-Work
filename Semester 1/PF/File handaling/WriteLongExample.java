import java.io.PrintWriter;

public class WriteLongExample {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("longValuesFile.txt");

            long bigNumber = 9876543210L;
            writer.print(bigNumber);
            writer.close();
            System.out.println("Long value written to file successfully.");
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}