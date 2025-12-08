import java.io.PrintWriter;

public class WriteCharArrayExample {
    public static void main(String[] args) {
        try {
            // character Array
            char[] letters = { 'R', 'u', 'b', 'i', 'n', 'a' };
            // Create PrinterWriter object
            PrintWriter writer = new PrintWriter("charArrayFile.txt");
            // Write char array to file
            writer.print(letters);
            // Close the writer
            writer.close();
            System.out.println("Character array written to file successfully.");
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}