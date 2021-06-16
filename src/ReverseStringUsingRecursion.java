
public class ReverseStringUsingRecursion {
	public static void stringReverse(int i,String str1,String str2) {
		if(i<str1.length()){
			str2=str2+str1.charAt(str1.length()-i-1);

			i++;
			stringReverse(i,str1,str2);
			
		}
		else if(i==str1.length()) {
			System.out.println(str2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringReverse(0,"Moumita","");
	}

}
