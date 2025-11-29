import java.util.Scanner;

public class GradedTask51D{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = input.nextInt();  // read the value of N

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i * i * i;  // add i³ to sum
        }

        System.out.println("Sum of cubes from 1³ to " + N + "³ = " + sum);
    }
}
