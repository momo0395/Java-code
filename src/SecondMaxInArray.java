
public class SecondMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arrInt= {3,11,30,5,1,16,13,13};
		Integer max1,max2;
		max1=max2=0;
		for(int i=0;i<arrInt.length;i++) {
			if(arrInt[i]>max1) {
				max2=max1;
				max1=arrInt[i];
				
			}
			else if(arrInt[i]>max2) {
				max2=arrInt[i];
			}
		}
		System.out.println(max2);
	}

}
