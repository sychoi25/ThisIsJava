package ch2_VariablesTypes;

public class GarbageValue {
	public static void main(String[] args) {
		byte b = 125;
		int i = 125;
		
		for(int n=0;n<5;n++) {
			b++;
			i++;
			System.out.println("b: "+b+"\t"+"i: "+i);
		}
	}
}
