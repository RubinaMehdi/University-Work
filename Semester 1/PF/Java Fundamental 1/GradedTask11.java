import java.util.Scanner; 
public class GradedTask11 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        //  Variable declaration
        int num1, num2, num3, average;
        //  Store values
        num1 = 125;
        num2 = 28;
        num3 = -25;
        //  Calculate and store the average
        average = (num1 + num2 + num3) / 3;
        
        //  Output the values
        System.out.println("Value of num1: " + num1);
        System.out.println("Value of num2: " + num2);
        System.out.println("Value of num3: " + num3);
        System.out.println("Average: " + average);
    } 
}
