package javaintroduction;

public class ArraysTest1 {

	public static void main(String[] args) {
		
//		int sum =0;
//		int[] i = {2,5,1,9,6};
//			for(int j=0; j<i.length; j++) {
//				sum = sum+i[j];
//				System.out.println(sum);
//			}
//			//System.out.println(sum);
		int sum = 0;
		int average;
		int[] a = {2,5,3,9,6};
		for(int b=0; b<a.length; b++) {
			sum=sum+a[b];
	
		}
		average = sum/a.length;
		System.out.println(average);
	}

}
