import java.io.PrintWriter;

public class WriteIntExample {
    public static void main(String[] args) {
        try {
            String fileName = "intValuesFile.txt";
            PrintWriter writer = new PrintWriter(fileName);
            int number = 12345;
            writer.print(number);
            writer.close();
            System.out.println("Integer value written to file successfully.");
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}