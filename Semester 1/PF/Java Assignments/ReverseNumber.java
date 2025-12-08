import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
           int num = scanner.nextInt();
            int reversedNum = 0;
            // Step 2: Reverse the number
            while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit; 
            num = num / 10;                 
            }
            System.out.println("Reversed Number: " + reversedNum);
            scanner.close();
            } 
     }
