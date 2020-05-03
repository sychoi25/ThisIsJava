package ch3_Operators;

public class Ex08NaN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 5.0;
		double y = 0.0;
		
		double z = x%y;
		
		if(Double.isNaN(z)) {
			System.out.println("error");
		}else {
			System.out.println(z);
		}
	}

}
