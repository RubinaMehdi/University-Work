import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat1 = new int[3][4];
        int[][] mat2 = new int[4][3];
        int[][] result = new int[3][3]; // 3x3 result matrix

        // Input first matrix (3x4)
        System.out.println("Enter elements of first 3x4 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        // Input second matrix (4x3)
        System.out.println("Enter elements of second 4x3 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        // Multiply matrices
        for (int i = 0; i < 3; i++) { // rows of mat1
            for (int j = 0; j < 3; j++) { // columns of mat2
                int sum = 0;
                for (int k = 0; k < 4; k++) { // columns of mat1 / rows of mat2
                    sum += mat1[i][k] * mat2[k][j];
                }
                result[i][j] = sum;
            }
        }

        // Display result
        System.out.println("\nResult of multiplication (3x3 matrix):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
