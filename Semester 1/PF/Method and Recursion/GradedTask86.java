import java.util.Scanner;

public class GradedTask86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of lowercase words: ");
        String line = sc.nextLine();

        String[] words = line.split(" ");
        String result = "";

        for (String word : words) {
            result += capitalize(word) + " ";
        }

        System.out.println("Capitalized line: " + result.trim());
    }

    public static String capitalize(String word) {
        if (word.length() == 0) return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
