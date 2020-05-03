package ch3_Operators;

public class ConditionalOoerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score1 = 95;
		char grade1 = (score1>90) ? 'A' : 'B';
		System.out.println(grade1);
		
		int score2 = 95;
		char grade2;
		if(score2>90) {
			grade2 = 'A';
		}else {
			grade2 = 'B';
		}
		System.out.println(grade2);

	}

}
