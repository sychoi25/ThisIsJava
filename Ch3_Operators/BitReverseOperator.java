package ch3_Operators;

public class BitReverseOperator {
	public static void main(String[] args) {
		int a = 10;
		boolean result = (-a == ~a+1);
		System.out.println(result);
	}
}

