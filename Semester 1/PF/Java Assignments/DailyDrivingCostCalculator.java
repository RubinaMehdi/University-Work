import java.util.Scanner;

public class DailyDrivingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double totalMiles = scanner.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = scanner.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFees = scanner.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = scanner.nextDouble();

        double totalDailyCost = (totalMiles / milesPerGallon) * costPerGallon
                                + parkingFees + tolls;

        System.out.printf("Total Daily Driving Cost: $%.2f\n", totalDailyCost);

        scanner.close();
  	  }
}
