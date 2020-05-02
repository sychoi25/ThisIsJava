package ch2_VariablesTypes;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intV = 'a';
		char castedChar = (char) intV;
		System.out.println(castedChar);
		
		double doubleV = 3.14;
		int castedI = (int) doubleV;
		System.out.println(castedI);
	}

}
