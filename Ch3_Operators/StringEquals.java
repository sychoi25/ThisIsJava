package ch3_Operators;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sy";
		String s2 = "sy";
		String s3 = new String ("sy");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
