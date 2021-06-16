import java.util.Scanner;
import java.util.Stack;

public class VowelReverseInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 VowelReverseInString vris=new  VowelReverseInString();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your string: ");
		String input=s.nextLine();
		char[] ch=input.toCharArray();
		Stack<Character> stack=new Stack<>();
		for(char c:ch) {
			
				if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U') {
					stack.push(c);
				}
			
			
		}
		System.out.println(stack);
		String output=new String();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='A' || ch[i]=='e' || ch[i]=='E' || ch[i]=='i' || ch[i]=='I' || ch[i]=='o' || ch[i]=='O' || ch[i]=='u' || ch[i]=='U'){
				output=output+stack.pop();
			}
			else {
				output=output+ch[i];
			}
		}
		System.out.println("String with reverse vowels is:  "+output);
	}

}
