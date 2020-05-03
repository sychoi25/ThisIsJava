package ch04_CondIterative;

public class Ex05LinearFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4x+5y = 60
		//under 10
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				if(4*i+5*j==60) {
					System.out.println("("+i+","+j+")");
				}
			}
		}
		
	}

}
