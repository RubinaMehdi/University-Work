import java.util.Scanner;
 public class GradedTask79 {
    public static void  main (String  args [] ) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string  : ");
	String str = input.nextLine();
	int index1 = str.indexOf('h');
	int index2 = str.lastIndexOf('h');
	String str2 = " ";
	for(int i = 0; i < str.length(); i++) {
	char ch = str.charAt(i);
	if(ch == 'h' && i != index1 && i != index2) {
	str2 += 'H';
	} else {
	str2 += ch;
	}
	}
	System.out.println(str2);
	
	
	
  	}
}