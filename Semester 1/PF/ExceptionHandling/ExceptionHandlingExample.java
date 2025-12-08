import java.util.Scanner;

class ExceptionHandlingExample {
     public static void main(String args[]) {
          Scanner input = new Scanner(System.in);
          int a, b, choice;

          do {
               System.out.println("Enter Ist value ");
               a = input.nextInt();
               System.out.println("Enter 2nd value ");
               b = input.nextInt();
               System.out.println("1.Add\n2:Subtract\n3;multiplication\n4:Divide\n5:Quit\nEnter your choice: ");
               choice = input.nextInt();
               try {

                    switch (choice) {

                         case 1:
                              System.out.println(a + "+" + b + "=" + (a + b));
                              break;

                         case 2:
                              System.out.println(a + " - " + b + " = " + (a - b));
                              break;

                         case 3:
                              System.out.println(a + " * " + b + " = " + (a * b));
                              break;

                         case 4:
                              System.out.println(a + "/" + b + "=" + (a / b));
                              break;
                         case 5:
                              break;
                         default:
                              System.out.println("You have entered an invalid choice");
                    }
               }

               catch (ArithmeticException e) {
                    System.out.println("It is divide by ZERO exception");
                    System.out.println("Try Again...");
               }

          } while (choice != 5);
     }
}