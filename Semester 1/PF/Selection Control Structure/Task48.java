import java.util.Scanner;

public class Task48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month in numeric  form : ");
        double month = sc.nextDouble();
        System.out.print("Enter a day in numeric form : ");
        double day = sc.nextDouble();
	System.out.print("Enter a two-digit year  : ");
        double year = sc.nextDouble();
         year = month * day;

       
        if (( month * day) == year ) {
            System.out.println("The Date is magic ");
        } else {
            System.out.println("The Date is not magic ");
        }

        sc.close();
    }
}