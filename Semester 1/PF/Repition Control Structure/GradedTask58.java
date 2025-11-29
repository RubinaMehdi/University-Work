import java.util.Scanner;

public class GradedTask58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.println("Enter a sequence of integers ending with 0:");

        int previous = input.nextInt(); // first element
        if (previous == 0) {
            System.out.println(0);
            return;
        }

        int count = 0;

        while (true) {
            int current = input.nextInt();
            if (current == 0) break;

            if (current > previous) count++;

            previous = current;
        }

        System.out.println(count);
    }
}