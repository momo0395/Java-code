import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurenceOfCharInString  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OccurenceOfCharInString oocis=new OccurenceOfCharInString ();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input=s.nextLine();
		oocis.charOccurrence(input);
		s.close();
	}
	
	public void charOccurrence(String str) {
		
		HashMap<Character,Integer> charCount=new HashMap<Character,Integer>();
		char[] charArr=str.toCharArray();
		for(char c:charArr) 
		
		{
			if(c!=' '){
				
			
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			}
			
			else {
				charCount.put(c, 1);
			}
			}
		}
		for(Map.Entry entry:charCount.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
