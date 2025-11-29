
import java.util.*;   
public class GradedTask12 {
    public static void main(String[] args) {
       
        Scanner console = new Scanner(System.in);
        // Declare variables
        int length, width, area, perimeter;
        // Input from user
        System.out.print("Enter the length: ");
        length = console.nextInt();
        System.out.print("Enter the width: ");
        width = console.nextInt();
        // Calculate area and perimeter
        area = length * width;
        perimeter = 2 * (length + width);
        
        // Output results
        System.out.println();
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
