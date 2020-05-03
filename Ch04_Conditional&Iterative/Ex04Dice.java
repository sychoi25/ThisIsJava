package ch04_CondIterative;

public class Ex04Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * if sum != 5, try again
		 * if sum == 5, close
		 */
		
		//#1
		int sum = 0;

		while(sum!=5) {
			int dice1 = (int) (Math.random()*6) + 1;
			int dice2 = (int) (Math.random()*6) + 1;
			System.out.println("("+dice1+","+dice2+")");
			sum = dice1 + dice2;			
		}
		
		System.out.println("#1, closed");
		
		//#2
		while(true) {
			int d1 = (int)(Math.random()*6)+1;
			int d2 = (int)(Math.random()*6)+1;
			System.out.println("("+d1+","+d2+")");
			int sum2 = d1 + d2;
			if(sum2 == 5) {
				break;
			}
		}
		System.out.println("#2, closed");
		
		
	}

}
