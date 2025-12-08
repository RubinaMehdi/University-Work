public class BMICalculator {
    public static void main(String[] args) {
        double weight = 62;   // in kilograms
        double height = 1.68; // in meters
        double bmi = weight / (height * height);
        // Step 3: Display the result
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
        System.out.println("Calculated BMI: " + bmi);
    }
}
