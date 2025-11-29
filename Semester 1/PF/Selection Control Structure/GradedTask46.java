import java.util.Scanner;

public class GradedTask46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1 to 10): ");
        int num = sc.nextInt();

        if (num == 1) System.out.println("Roman numeral: I");
        else if (num == 2) System.out.println("Roman numeral: II");
        else if (num == 3) System.out.println("Roman numeral: III");
        else if (num == 4) System.out.println("Roman numeral: IV");
        else if (num == 5) System.out.println("Roman numeral: V");
        else if (num == 6) System.out.println("Roman numeral: VI");
        else if (num == 7) System.out.println("Roman numeral: VII");
        else if (num == 8) System.out.println("Roman numeral: VIII");
        else if (num == 9) System.out.println("Roman numeral: IX");
        else if (num == 10) System.out.println("Roman numeral: X");
        else System.out.println("Error: Number must be between 1 and 10.");
    }
}
