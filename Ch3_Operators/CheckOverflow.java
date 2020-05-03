package ch3_Operators;

public class CheckOverflow {

	
	public static int safeAdd(int left, int right) {
		if(right>0) {
			if(left>(Integer.MAX_VALUE-right)) {
				throw new ArithmeticException("overflow + ");
			}
		}else { //right=<0
			if(left<(Integer.MIN_VALUE-right)) {
				throw new ArithmeticException("overflow - ");
			}
		}
		
		return left+right;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}catch (ArithmeticException e) {
			System.out.println("overflow");
		}
		
	}
	
}
