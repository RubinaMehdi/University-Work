import java.util.Scanner;
 public class GradedTask76 {
    public static void  main (String  args [] ) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter two words separated by space");
	String str = input.nextLine();
	int spacechk = str.indexOf(" ");
	int lengthchk = str.length();
	String str1 = str.substring(0, spacechk);
	String str2 = str.substring(spacechk , lengthchk);
	String reverse = (str2 + str1);
	System.out.println("The reversed string is " + reverse );
	}
 }