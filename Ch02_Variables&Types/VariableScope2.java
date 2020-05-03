package ch2_VariablesTypes;

public class VariableScope2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int c = 100;
		
		if(a>5) {
			b = 3;
		}else {
			c = 3;
		}	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
