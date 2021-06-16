import java.util.Scanner;

public class StringReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s=new Scanner(System.in);
 System.out.println("Enter input string");
 String input=s.nextLine();
 String expected=new String();
 for(int i=input.length()-1;i>=0;i--) {
	 expected=expected+input.charAt(i);
 }
 System.out.println("Reversed string is "+expected);
 s.close();
 StringReverse2 st=new StringReverse2();
	}
	
}
