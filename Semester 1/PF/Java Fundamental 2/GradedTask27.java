import java.util.Scanner;

public class GradedTask27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int priceA = 20;
        int priceB = 15;
        int priceC = 10;
        int priceD = 5;

        
        System.out.print("Enter number of Class A tickets sold: ");
        int soldA = sc.nextInt();

        System.out.print("Enter number of Class B tickets sold: ");
        int soldB = sc.nextInt();

        System.out.print("Enter number of Class C tickets sold: ");
        int soldC = sc.nextInt();

        System.out.print("Enter number of Class D tickets sold: ");
        int soldD = sc.nextInt();

        // Calculate income for each class
        int incomeA = soldA * priceA;
        int incomeB = soldB * priceB;
        int incomeC = soldC * priceC;
        int incomeD = soldD * priceD;

        // Total income
        int totalIncome = incomeA + incomeB + incomeC + incomeD;

        // Display results
        System.out.println("\nIncome from Class A tickets: $" + incomeA);
        System.out.println("Income from Class B tickets: $" + incomeB);
        System.out.println("Income from Class C tickets: $" + incomeC);
        System.out.println("Income from Class D tickets: $" + incomeD);
        System.out.println("Total income generated: $" + totalIncome);
    }
}
