import java.util.Scanner;

public class GradedTask57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.println("Enter a sequence of integers ending with 0:");

        int evenCount = 0;

        while (true) {
            int num = input.nextInt();
            if (num == 0)
             break;

            if (num % 2 == 0)
             evenCount++;
        }

        System.out.println(evenCount);
    }
}