import java.util.Scanner;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers you want to swap:");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Swapped numbers are"+a+" "+b);
		in.close();
	}

}
