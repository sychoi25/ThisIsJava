package ch05_ReferenceType;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores;
		
		//get sum & avg
		
		//#1 simple for loop
		scores = new int[] {83,39,90};
		int sum1 = 0;
		for(int i=0;i<scores.length;i++) {
			sum1 += scores[i];
		}
		System.out.println(sum1);
		
		//#2 using methods
		int sum2 = add(new int[] {83,39,90});
		System.out.println(sum2);
		
		//check
		boolean check = sum1==sum2;
		System.out.println(check);
		
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0;i<3;i++) {
			sum += scores[i];
		}
		return sum;
	}

}
