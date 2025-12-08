public class Example4 {
    public static void main(String[] args) {
        try {
            int arr[] = { 5, 0, 1, 2 };

            try {
                int x = arr[3] / arr[1]; // arr[1] = 0
            } catch (ArithmeticException ae) {
                System.out.println("divide by zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("array index out of bound exception");
            }

        } catch (Exception e) {
            System.out.println("Outer catch");
        }
    }
}
