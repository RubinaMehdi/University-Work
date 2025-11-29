import java.util.Scanner;

public class GradedTask71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double EARTH_RADIUS = 6371.01; // in km

        // Prompt user for first point
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double lat1 = input.nextDouble();
        double lon1 = input.nextDouble();

        // Prompt user for second point
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double lat2 = input.nextDouble();
        double lon2 = input.nextDouble();

        // Convert degrees to radians
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        // Calculate the great circle distance
        double distance = EARTH_RADIUS * Math.acos(
                Math.sin(lat1) * Math.sin(lat2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2)
        );

        System.out.println("The distance between the two points is " + distance + " km");
    }
}
