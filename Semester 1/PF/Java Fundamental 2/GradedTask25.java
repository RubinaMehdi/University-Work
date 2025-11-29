import java.util.Scanner;

public class GradedTask25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Input total amount of milk produced
        System.out.print("Enter total milk produced in liters: ");
        double totalMilk = sc.nextDouble();

        double cartonCapacity = 3.78;   // liters per carton
        double costPerLiter = 0.38;     // cost of production
        double profitPerCarton = 0.27;  // profit per carton

        int cartonsNeeded = (int)Math.round(totalMilk / cartonCapacity);

        double totalCost = totalMilk * costPerLiter;

        double totalProfit = cartonsNeeded * profitPerCarton;
        System.out.println("Number of cartons needed: " + cartonsNeeded);
        System.out.println("Cost of producing milk: $" + totalCost);
        System.out.println("Total profit: $" + totalProfit);
    }
}
