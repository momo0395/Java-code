/*
 * Rotating array in right i.e if arr a[]={'a','p','c','d'} then output={'d','a','p','c'}
 * */
public class ArrayRotation {
	
	ArrayRotation arRight=new ArrayRotation();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch= {'a','l','p','t','y','w'};
		char temp=' ';
		for(int i=2;i<ch.length;i++) {
			temp=ch[i];
			ch[i]=ch[i-1];
			ch[i-1]=ch[i-2];
			
			
			
			
		}
		ch[0]=temp;
		
		System.out.println(ch);
	}

}
