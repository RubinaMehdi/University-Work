import java.util.Scanner;

public class GradedTask87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printMatrix(n);
    }

    // Method to print n-by-n matrix of random 0s and 1s
    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = (int) (Math.random() * 2); // 0 or 1
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
