import java.util.Scanner;

public class SwapWithThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers you want to swap:");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Swapped numbers are"+a+" "+b);
		in.close();
	}

}
