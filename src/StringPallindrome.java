
import java.util.Scanner;

public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPallindrome sp=new StringPallindrome();
		StringBuffer sb1=new StringBuffer("");
		StringBuffer sb2=new StringBuffer("");
		System.out.println("Enter the string");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		sb1=sb1.append(str);
		System.out.println(sb1);
		System.out.println(sb1.length());
		for(int i=sb1.length()-1;i>=0;i--) {
			sb2=sb2.append(sb1.toString().charAt(i));
		}
		
		System.out.println(sb2);
		if(sb1.toString().equals(sb2.toString())) {
			System.out.println("The string is pallindrome");
		}
		else {
			System.out.println("The string is not pallindrome");
		}
		
		s.close();
	}

}
