import java.util.Scanner;

public class MaxRowColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][4];

        // Input elements
        System.out.println("Enter elements of 3x4 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Find row with maximum sum
        int maxRowSum = 0;
        int maxRowIndex = 0;
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += array[i][j];
            }
            if (sum > maxRowSum) {
                maxRowSum = sum;
                maxRowIndex = i;
            }
        }

        // Find column with maximum sum
        int maxColSum = 0;
        int maxColIndex = 0;
        for (int j = 0; j < 4; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += array[i][j];
            }
            if (sum > maxColSum) {
                maxColSum = sum;
                maxColIndex = j;
            }
        }

        // Display results
        System.out.println("Row with maximum sum: " + (maxRowIndex + 1));
        System.out.println("Column with maximum sum: " + (maxColIndex + 1));

        sc.close();
    }
}
