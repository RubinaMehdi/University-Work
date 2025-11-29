import java.util.Scanner;

public class TransposeMatrix {

    // User-defined method to compute transpose
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows]; // swapped rows and columns

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 4;
        int[][] array = new int[rows][cols];

        // Input elements of the 3x4 array
        System.out.println("Enter elements of 3x4 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Display original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // Get transpose from the user-defined method
        int[][] transposedMatrix = transpose(array);

        // Display transposed matrix
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[0].length; j++) {
                System.out.print(transposedMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
