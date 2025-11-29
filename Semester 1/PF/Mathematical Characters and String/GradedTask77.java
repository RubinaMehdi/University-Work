import java.util.Scanner;
 public class GradedTask77 {
    public static void  main (String  args [] ) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string : ");
	String str = input.nextLine();
	int index= str.indexOf("f");
	while(index != -1){
	
	System.out.println(index);
	index = str.indexOf("f" ,index +1);
	
		}
  	}
}