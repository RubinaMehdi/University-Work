import java.util.Scanner;
 public class GradedTask74 {
    public static void  main (String  args [] ) {
	// Generate a random number between 0 and 25
        int rand = (int) (Math.random() * 26);

        // Convert to uppercase letter (A-Z)
        char letter = (char) ('A' + rand);

        System.out.println("Random uppercase letter: " + letter);
    }
}