package ch04_CondIterative;

public class Ex03MultiplesOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//#1 Add multiples of 3
		int sum = 0;
		
		for(int i=1;i<101;i++) {
			if((i%3) == 0) {
				sum +=i;
			}
		}
		
		System.out.println(sum);
		
		
		//#2 Binding
		int num = 100/3;
		int result;
		//result = 3*(1+2+ ... + num)
		
		int added = 0;
		for(int i=0;i<num+1;i++) {
			added += i;
		}
		
		result = 3*added;
		
		System.out.println(result);
		
		
		//check
		boolean check = (sum==result);
		System.out.println(check);
		
	}

}
