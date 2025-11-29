import java.util.Scanner;
public class GradedTask24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // minutes since midnight

        int hours = (N / 60) % 24;   
        int minutes = N % 60;        
        System.out.println(hours + " " + minutes);
    }
} 
