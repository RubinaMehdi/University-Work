import java.util.Scanner;

public class GradedTask410 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for number of books purchased
        System.out.print("Enter the number of books purchased this month: ");
        int books = sc.nextInt();

        int points;

        // Determine points based on number of books
        if (books == 0) {
            points = 0;
        } else if (books == 1) {
            points = 5;
        } else if (books == 2) {
            points = 15;
        } else if (books == 3) {
            points = 30;
        } else if (books >= 4) {
            points = 60;
        } else {
            points = 0; // just in case negative input
        }

        // Display result
        System.out.println("Points awarded: " + points);
    }
}
