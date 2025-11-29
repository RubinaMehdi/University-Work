import java.util.Scanner;

public class GradedTask26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hourly pay rate: ");
        double payRate = sc.nextDouble();

        double totalHours = 0;

        // Input hours worked for 5 weeks
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter hours worked in week " + i + ": ");
            double hours = sc.nextDouble();
            totalHours += hours;
        }

        // a. Income before taxes
        double incomeBeforeTax = totalHours * payRate;

        // a. Income after 14% tax
        double incomeAfterTax = incomeBeforeTax - (incomeBeforeTax * 0.14);

        // b. 10% spent on clothes
        double clothes = incomeAfterTax * 0.10;

        // c. 1% spent on school supplies
        double supplies = incomeAfterTax * 0.01;

        // Remaining money after clothes + supplies
        double remaining = incomeAfterTax - clothes - supplies;

        // d. 25% of remaining used to buy savings bonds
        double bondsYouBuy = remaining * 0.25;

        // e. Parents add $0.50 for each $1 you buy
        double parentsBuy = bondsYouBuy * 0.50;

    
        System.out.println("\n===== OUTPUT =====");
        System.out.println("Income before taxes: $" + incomeBeforeTax);
        System.out.println("Income after taxes: $" + incomeAfterTax);
        System.out.println("Money spent on clothes: $" + clothes);
        System.out.println("Money spent on school supplies: $" + supplies);
        System.out.println("Money spent on savings bonds: $" + bondsYouBuy);
        System.out.println("Money your parents spend on additional bonds: $" + parentsBuy);
    }
}
