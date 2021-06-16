import java.util.Scanner;

public class ContainsVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		ContainsVowels cv=new ContainsVowels();
		System.out.println(cv.ifContainsVowels(str));
		in.close();
	}
	public boolean ifContainsVowels(String str2) {
		char[] ch= {'a','e','i','o','u'};
		char[] strArr=str2.toCharArray();
		for(int j=0;j<strArr.length;j++) {
		for(int i=0;i<ch.length;i++) {
		if(strArr[j]==ch[i]) {
			return true;
		}
		
	}
		
}
		return false;
			
	}
}
	