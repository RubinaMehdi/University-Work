public class ReversedArray {
    public static void main(String[] args) {

        
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Array to store reversed copy
        int[] reversed = new int[original.length];

        // Copy elements in reverse order
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        // Display original array
        System.out.println("Original array:");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }

        // Display reversed array
        System.out.println("\nReversed array:");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}
