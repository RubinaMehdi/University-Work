import java.util.Scanner;

public class GradedTask45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println(3); // all equal
        } else if (a == b || a == c || b == c) {
            System.out.println(2); // two equal
        } else {
            System.out.println(0); // all different
        }
    }
}
