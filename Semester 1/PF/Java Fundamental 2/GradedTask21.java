import java.util.Scanner;
public class GradedTask21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in dollars (e.g., 11.56): ");
        double amount = input.nextDouble();
        int remainingAmount = (int) Math.round(amount * 100);
        int dollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int quarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int dimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int nickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int pennies = remainingAmount;
        System.out.println("Your amount " + amount + " consists of:");
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
        input.close();
    }
}


