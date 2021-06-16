import java.util.Scanner;

public class IfPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner in=new Scanner(System.in);
		Integer i=in.nextInt();
		IfPrimeNumber ifp=new IfPrimeNumber();
		System.out.println(ifp.primeNumber(i));
		in.close();

	}

	public boolean primeNumber(int j) {
		if(j==0||j==1) 
		return false;
		
		
		else if(j==2) 
			return true;
		
		
		
			for(int n=2;n<=j/2;n++) {
				if(j%n==0) {
					return false;
				}
				
			}
			return true;
		}
		
	}

