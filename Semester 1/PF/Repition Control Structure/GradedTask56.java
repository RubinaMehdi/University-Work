import java.util.Scanner;

public class GradedTask56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sequence of integers ending with 0:");

        int max = Integer.MIN_VALUE;
        int indexOfMax = -1;
        int index = 1; // sequence index starts from 1

        while (true) {
            int num = input.nextInt();
            if (num == 0) break;

            if (num > max) {
                max = num;
                indexOfMax = index; // store first occurrence
            }

            index++;
        }

        System.out.println(indexOfMax);
    }
}
