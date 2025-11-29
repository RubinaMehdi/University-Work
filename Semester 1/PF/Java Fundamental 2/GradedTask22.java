import java.util.Scanner;

public class GradedTask22{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();   
        int K = input.nextInt();  

        int eachGets = K / N;      
        int remaining = K % N;  

        System.out.println(eachGets);
        System.out.println(remaining);
    }
}


