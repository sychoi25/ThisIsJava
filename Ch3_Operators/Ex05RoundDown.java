package ch3_Operators;

public class Ex05RoundDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 356;
		int r = i - i%100;
		System.out.println(r);
		System.out.println(i -= i%100);
	}

}
