package ch05_ReferenceType;

public class ArraySum_AdvancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for( var : array){}
		
		int sum = 0;
		int scores[] = {12,23,34};
		
		for(int score : scores) {
			sum += score;
		}
		
		System.out.println(sum);
	}

}
