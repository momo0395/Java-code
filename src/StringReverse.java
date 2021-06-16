import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		System.out.println("Please enter the string to be reversed:");
		Scanner in = new Scanner(System.in);
		str=in.nextLine();
		System.out.println(str);
		int length=str.length();
		char[] myStr=str.toCharArray();
		char[] myReverseStr= new char[20];
		for(int i=0;i<myStr.length;i++) {
			
			myReverseStr[i]=myStr[length-i-1];
			
		}
		String reverseStr= new String(myReverseStr);
		System.out.println("The reversed string is "+reverseStr);
		in.close();
	}
	

}
