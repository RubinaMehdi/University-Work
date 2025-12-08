import java.io.FileWriter;

public class WriteExample {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("myfile.txt");
            file.write("Hello Rubina!");
            file.close();
            System.out.println("Data saved in file");
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}