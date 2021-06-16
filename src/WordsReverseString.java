import java.util.Scanner;

public class WordsReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordsReverseString wrs=new WordsReverseString();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string:");
		String input=s.nextLine();
		String output=new String();
		String[] str=input.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			output=output+" "+str[i];
		}
		System.out.println("The reversed string is"+output);
		s.close();
	}

}
