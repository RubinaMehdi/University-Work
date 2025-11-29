import java.util.Scanner;

public class GradedTask510 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year (0=Sunday, 1=Monday,...6=Saturday): ");
        int firstDay = input.nextInt();

        String[] months = { "January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December" };
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30,
                              31, 31, 30, 31, 30, 31 };

        // Check for leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29; // February has 29 days in leap year
        }

        int dayOfWeek = firstDay;

        for (int i = 0; i < 12; i++) {
            System.out.println("\n\t\t" + months[i] + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // Print leading spaces for first day
            for (int j = 0; j < dayOfWeek; j++) {
                System.out.print("    ");
            }

            // Print all days in the month
            for (int day = 1; day <= daysInMonth[i]; day++) {
                System.out.printf("%3d ", day);

                dayOfWeek++;
                if (dayOfWeek == 7) { // new line after Saturday
                    dayOfWeek = 0;
                    System.out.println();
                }
            }
            if (dayOfWeek != 0) System.out.println(); // new line at end of month
        }
    }
}
