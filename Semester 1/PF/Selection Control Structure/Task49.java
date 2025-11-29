import java.util.Scanner;

public class Task49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	// Prompt the user for the number of each type of coin
        System.out.print("Enter number of pennies : ");
        int pennies = sc.nextInt();

        System.out.print("Enter number of nickels : ");
        int nickels = sc.nextInt();

	System.out.print("Enter number of dimes: ");
        int dimes = sc.nextInt();
	
	
	System.out.print("Enter number of quarters: ");
        int quarters = sc.nextInt();

	//Total amount in dollar
	int totalCents = pennies * 1 + nickels *5 + dimes * 10 + quarters * 25;
       
        if (totalCents == 100) 
	{
            System.out.println("Congratulate! you entered one dollar. You Win! ");
        }
	else if(totalCents < 100)
	{
            System.out.println("The amount is less than one dollar.Try again. ");
        }
	else
	{
	     System.out.println("The amount is more than one dollar.Try again. ");
	}
        sc.close();
    }
}