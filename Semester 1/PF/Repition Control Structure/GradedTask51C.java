import java.util.Scanner;

public class GradedTask51C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = input.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int num = input.nextInt();
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}
