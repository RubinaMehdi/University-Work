import java.util.Scanner;

public class Activity4 {

    // Method to input array elements
    public static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("A[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
    }

    // Method to display array
    public static void display(int[] arr) {
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to search an element
    public static void search(int key, int[] arr) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
    }

    // Method to find largest element
    public static int largest(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    // Method to find smallest element
    public static int smallest(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    // Method to copy array
    public static void copyData(int[] source, int[] dest) {
        for (int i = 0; i < source.length; i++) {
            dest[i] = source[i];
        }
        System.out.print("Copied array: ");
        for (int val : dest) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int[] copiedArray = new int[10];
        int choice;

        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Input elements in array");
            System.out.println("2. Search element and its location");
            System.out.println("3. Find largest & smallest value");
            System.out.println("4. Copy data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    input(array);
                    display(array);
                    break;
                case 2:
                    input(array); // reuse input method
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    search(key, array);
                    break;
                case 3:
                    input(array);
                    int max = largest(array);
                    int min = smallest(array);
                    // Place largest at index 0 and smallest at index 9
                    int temp = array[0];
                    array[0] = max;
                    array[9] = min;
                    // optional: replace original max/min positions if different
                    for (int i = 1; i < 9; i++) {
                        if (array[i] == max)
                            array[i] = temp;
                        if (array[i] == min)
                            array[i] = array[i]; // already min at 9th
                    }
                    display(array);
                    break;
                case 4:
                    input(array);
                    copyData(array, copiedArray);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
