package ch3_Operators;

public class IncreaseDecreaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println(x);
		z = x++;
		System.out.println(z);
		System.out.println(x);
		z= ++x;
		System.out.println(z);
		System.out.println(x);
		z = ++x + y++;
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
	}

}
