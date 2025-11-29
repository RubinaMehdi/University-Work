public class GradedTask84 {
    public static void main(String[] args) {
        System.out.println("Year\tDays");
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + "\t" + numberOfDaysInAYear(year));
        }
    }

    // Method to return number of days in a year
    public static int numberOfDaysInAYear(int year) {
        if (isLeapYear(year)) {
            return 366;  // Leap year
        } else {
            return 365;  // Non-leap year
        }
    }

    // Helper method to check leap year
    public static boolean isLeapYear(int year) {
        // Leap year if divisible by 4 and (not divisible by 100 or divisible by 400)
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
