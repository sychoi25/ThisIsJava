package ch2_VariablesTypes;

public class CheckValueB4TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 128;
		byte b = 0;
		
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) {
			//type casting 불가
		}else {
			b = (byte) i;
		}
		System.out.println(b);
		
		
	}

}
