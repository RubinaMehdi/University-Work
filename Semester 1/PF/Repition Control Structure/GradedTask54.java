import java.util.Scanner;

public class GradedTask54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            count++;
        }

        System.out.println(count);
    }
}
