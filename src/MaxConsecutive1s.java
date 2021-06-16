import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MaxConsecutive1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxConsecutive1s mc1=new MaxConsecutive1s();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numeric string:");
		//Input should be like '11gfh111io1111nj1'
		String input=s.nextLine();
		char[] ch=input.toCharArray();
		int count=0;
		List<Integer> l=new ArrayList<Integer>();
		for(int i=1;i<=ch.length;i++) {
			if(ch[i-1]!='1') {
				l.add(count);
				
				count=0;
			}
			else {
				count=count+1;
			}
		}
		 System.out.println("Number of maximum consecutive 1's is:    "+Collections.max(l));
	}

}
