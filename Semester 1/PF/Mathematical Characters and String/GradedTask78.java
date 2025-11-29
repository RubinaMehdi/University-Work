import java.util.Scanner;
 public class GradedTask78 {
    public static void  main (String  args [] ) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string in which the letter h occurs at least twice : ");
	String str = input.nextLine();
	int index1 = str.indexOf("h");
	int index2 =  str.lastIndexOf("h");
	String s1 = str.substring(0, index1);
	String s2 = str.substring(index2+1,str.length());
	System.out.println(s1+s2);
		
  	}
}