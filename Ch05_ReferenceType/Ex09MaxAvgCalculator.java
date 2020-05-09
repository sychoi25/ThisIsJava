package ch05_ReferenceType;

import java.util.Scanner;

public class Ex09MaxAvgCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		double avg = 0.0;
		
		while(run) {
			System.out.println("==================================================================");
			System.out.println("1.Number of Students | 2.Scores | 3.scoreList | 4.Analyze | 5.Quit");
			System.out.print("Choose Menu> ");
			
			int selectNo = scn.nextInt();
			
			if(selectNo == 1) {
				System.out.print("Number of Students> ");
				studentNum = scn.nextInt();
				scores = new int[studentNum];
				
			}else if(selectNo == 2) {
				for(int i=0;i<studentNum;i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = scn.nextInt();
				}
			
			}else if(selectNo == 3) {
				for(int i=0;i<studentNum;i++) {
					System.out.println("scores["+i+"] : " + scores[i]);
				}
				
			}else if(selectNo == 4) {
				int max = scores[0];
				for(int i=0;i<studentNum;i++) {
					sum += scores[i];
					if(scores[i]>max) {
						max = scores[i];
					}
				}
				avg = sum/studentNum;
				
				System.out.println("Max: "+max);
				System.out.println("Avg: "+avg);
				
			}else if(selectNo == 5) {
				System.out.println("Goodbye");
				run = false;
			}
		}
		
	}

}
