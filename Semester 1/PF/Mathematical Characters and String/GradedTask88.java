import java.util.Scanner;

public class GradedTask88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int vowelCount = countVowels(input);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }

    // Method to count vowels in a string
    public static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase(); // Convert to lowercase for simplicity

        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }
}
