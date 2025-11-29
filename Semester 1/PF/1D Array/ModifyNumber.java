public class ModifyNumber {

    public static void modify(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 3;  
        }
    }

    public static void main(String[] args) {

        // Initialize array of 10 elements
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        modify(numbers);

        System.out.println("\nArray after modification (each element multiplied by 3):");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
