import java.util.Scanner;

public class ElectricitySavings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of units consumed from the solar system: ");
        double solarUnits = input.nextDouble();
        System.out.print("Enter number of units consumed from the electricity company: ");
        double companyUnits = input.nextDouble();
        double solarRate = 7.0;
        double companyRate = 60.0;
        double totalBillSolar = solarUnits * solarRate;
        double totalBillCompany = companyUnits * companyRate;
        double totalUnits = solarUnits + companyUnits;

        double totalBillIfCompany = totalUnits * companyRate;
        double actualBill = totalBillSolar + totalBillCompany;
        double savings = totalBillIfCompany - actualBill;

        System.out.println("Total units consumed: " + totalUnits);
        System.out.println("Bill for solar units (Rs.7 per unit): Rs. " + totalBillSolar);
        System.out.println("Bill for company units (Rs.60 per unit): Rs. " + totalBillCompany);
        System.out.println("Total bill if all units from company: Rs. " + totalBillIfCompany);
        System.out.println("Actual bill using both sources: Rs. " + actualBill);
        System.out.println("Total savings using solar energy: Rs. " + savings);

        input.close();
    }
} 
