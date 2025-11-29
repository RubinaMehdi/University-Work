import java.util.Scanner;
 public class GradedTask710 {
    public static void  main (String  args [] ) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string  : ");
	String str = input.nextLine();

	//System.out.println("Print the third character of the string : " );
	System.out.println(str.charAt(2));

	//System.out.println("Print the second to last character of this string : " );
	System.out.println(str.charAt(str.length()-2));

	//System.out.println("Print the first five characters of this string : " );
	for(int i = 0; i <= 4; i++) {
	System.out.println(str.charAt(i));
	}
	//or
	//System.out.println(str.substring(0,5));

	//System.out.println("Print all but the last two characters of this string  : " );
	System.out.println(str.substring(0,str.length()-2));

	//System.out.println("Character at even indices :");
	for (int i = 0; i <= str.length();i += 2) {
	
	System.out.println(str.charAt(i));
	}

	//System.out.println("Character at odd indices :");
	for (int i = 1; i < str.length();i += 2) {
	
	System.out.println(str.charAt(i));
	}

	//System.out.println("Print all the Character in reverse order " );
	for(int i = str.length()-1;i >= 0;i--) {
	System.out.println(str.charAt(i));
	}

	//System.out.println("Print every second character of the string in reverse order : " );
	for(int i = str.length()-1;i >= 0;i -= 2) {
	System.out.println(str.charAt(i));
	}

	//System.out.println("Print the length of given string : " );
	System.out.println(str.length());
  	}
} 