import java.util.*;

public class Assignment3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Matrix Multiplication");
            System.out.println("2. 0-1 Square Matrix Checker");
            System.out.println("3. Arrange a,b,c");
            System.out.println("4. One-D Array Tasks");
            System.out.println("5. Smart Grid Optimization");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: matrixMultiply(); break;
                case 2: zeroOneMatrix(); break;
                case 3: arrangeABC(); break;
                case 4: oneDArrayMenu(); break;
                case 5: smartGrid(); break;
            }

        } while (choice != 0);
    }

    // Q1 – SIMPLE MATRIX MULTIPLICATION
    static void matrixMultiply() {
        System.out.print("Enter rows & cols of matrix 1: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();

        System.out.print("Enter rows & cols of matrix 2: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Multiplication NOT possible.");
            return;
        }

        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] result = new int[r1][c2];

        System.out.println("Enter matrix 1:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter matrix 2:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    result[i][j] += a[i][k] * b[k][j];

        System.out.println("Result:");
        for (int[] row : result) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }

    // Q2 – SIMPLE 0-1 MATRIX CHECKER
    static void zeroOneMatrix() {
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        Random r = new Random();

        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = r.nextInt(2);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        // check rows
        for (int i = 0; i < n; i++) {
            boolean same = true;
            for (int j = 1; j < n; j++)
                if (m[i][j] != m[i][0]) same = false;

            if (same)
                System.out.println("All " + m[i][0] + "s on row " + i);
        }

        // check major diagonal
        boolean major = true;
        for (int i = 1; i < n; i++)
            if (m[i][i] != m[0][0]) major = false;

        if (major)
            System.out.println("All " + m[0][0] + "s on major diagonal");
        else
            System.out.println("No same numbers on major diagonal");
    }

    // Q3 – SIMPLE ABC ARRANGEMENT
    static void arrangeABC() {
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        char[] arr = new char[n];

        System.out.println("Enter a, b or c:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.next().charAt(0);

        int a = 0, b = 0, c = 0;
        for (char ch : arr) {
            if (ch == 'a') a++;
            else if (ch == 'b') b++;
            else c++;
        }

        int index = 0;
        while (a-- > 0) arr[index++] = 'a';
        while (b-- > 0) arr[index++] = 'b';
        while (c-- > 0) arr[index++] = 'c';

        System.out.println("Arranged: " + Arrays.toString(arr));
    }

    // Q4 – SIMPLE ONE-D ARRAY MENU
    static void oneDArrayMenu() {
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int ch;
        do {
            System.out.println("\n--- 1D Menu ---");
            System.out.println("1. Count number");
            System.out.println("2. Partition");
            System.out.println("3. Frequencies");
            System.out.println("4. Circular Sum");
            System.out.println("5. Left Shift by 2");
            System.out.println("0. Back");
            System.out.print("Enter: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter number: ");
                    int x = sc.nextInt();
                    int c = 0;
                    for (int i : arr)
                        if (i == x) c++;
                    System.out.println("Count = " + c);
                    break;

                case 2:
                    int first = arr[0];
                    int[] temp = new int[n];
                    int k = 0;
                    for (int i : arr) if (i < first) temp[k++] = i;
                    temp[k++] = first;
                    for (int i : arr) if (i > first) temp[k++] = i;
                    arr = temp;
                    System.out.println(Arrays.toString(arr));
                    break;

                case 3:
                    for (int i = 0; i < n; i++) {
                        int freq = 1;
                        if (arr[i] == -999) continue;
                        for (int j = i + 1; j < n; j++) {
                            if (arr[i] == arr[j]) {
                                freq++;
                                arr[j] = -999;
                            }
                        }
                        System.out.println(arr[i] + " appears " + freq + " times");
                    }
                    break;

                case 4:
                    int[] ans = new int[n];
                    for (int i = 0; i < n; i++)
                        ans[i] = arr[(i+1)%n] + arr[(i+2)%n];
                    arr = ans;
                    System.out.println(Arrays.toString(arr));
                    break;

                case 5:
                    int[] shift = new int[n];
                    for (int i = 0; i < n; i++)
                        shift[i] = arr[(i+2)%n];
                    arr = shift;
                    System.out.println(Arrays.toString(arr));
                    break;
            }

        } while (ch != 0);
    }

    // Q5 – SIMPLE SMART GRID
    static void smartGrid() {
        int[][] g = {
                {120, 200, 150},
                {180, 250, 300},
                {170, 160, 140}
        };
        int t = 200;

        System.out.println("Original:");
        print(g);

        int[][] out = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (g[i][j] > t) {
                    int sum = 0, c = 0;
                    if (i > 0) { sum += g[i-1][j]; c++; }
                    if (i < 2) { sum += g[i+1][j]; c++; }
                    if (j > 0) { sum += g[i][j-1]; c++; }
                    if (j < 2) { sum += g[i][j+1]; c++; }
                    out[i][j] = sum / c;
                } else {
                    out[i][j] = g[i][j];
                }
            }
        }

        System.out.println("Optimized:");
        print(out);
    }

    static void print(int[][] m) {
        for (int[] row : m) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
