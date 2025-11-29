import java.util.Scanner;

public class GradedTask47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle 1: ");
        double l1 = sc.nextDouble();
        System.out.print("Enter width of rectangle 1: ");
        double w1 = sc.nextDouble();

        System.out.print("Enter length of rectangle 2: ");
        double l2 = sc.nextDouble();
        System.out.print("Enter width of rectangle 2: ");
        double w2 = sc.nextDouble();

        double area1 = l1 * w1;
        double area2 = l2 * w2;

        if (area1 > area2) {
            System.out.println("Rectangle 1 has the greater area.");
        } 
        else if (area2 > area1) {
            System.out.println("Rectangle 2 has the greater area.");
        } 
        else {
            System.out.println("Both rectangles have the same area.");
        }
    }
}
