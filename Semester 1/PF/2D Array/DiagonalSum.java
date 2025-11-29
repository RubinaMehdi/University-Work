import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 4;
        int[][] array = new int[size][size];
        int sum = 0;

        // Input 4x4 matrix elements
        System.out.println("Enter elements of 4x4 matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Display the matrix
        System.out.println("\nThe 4x4 Matrix is:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculate sum of the main diagonal
        for (int i = 0; i < size; i++) {
            sum += array[i][i]; // elements where row index = column index
        }

        System.out.println("\nSum of the main diagonal: " + sum);
        sc.close();
    }
}
