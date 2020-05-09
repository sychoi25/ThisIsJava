package ch05_ReferenceType;

public class Ex07MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int max = 0;
		int [] array= {1,5,3,8,2};
		int min = array[0];
		
		int max = array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
			if(array[i]<min) {
				min = array[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		
		
		
	}

}
