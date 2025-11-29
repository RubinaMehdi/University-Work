import java.util.Scanner;

public class GradedTask23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int desksA = (a + 1) / 2;
        int desksB = (b + 1) / 2;
        int desksC = (c + 1) / 2;

        int totalDesks = desksA + desksB + desksC;

        System.out.println(totalDesks);
    }
}
