import java.util.Scanner;

public class Activity3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        char[] characters = new char[10];
        int counter = 0;

        // Input characters
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "] = ");
            characters[i] = input.next().charAt(0); 
        }

        // Frequency checking
        for (int i = 0; i < 10; i++) {
            counter = 0;

            for (int j = 0; j < 10; j++) {
                if (characters[i] == characters[j]) {
                    counter++;
                }
            }

            System.out.println(characters[i] + " occurs " + counter + " times");
        }
    }
}

