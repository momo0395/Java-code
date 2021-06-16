
public class FibonacciUsingRecursion {

	public static void fib(int i,int a,int b) {
		
		if(i<9) {
			System.out.print(a+" ");
			i=i+1;
			int c=a+b;
			a=b;
			b=c;
			
			
			fib(i,a,b);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fib(1,0,1);
	}

}
