package ch04_CondIterative;

import java.util.Scanner;

public class Ex07ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.deposit 2.withdrawal 3.balance 4.close
		
		
		boolean flag = true;
		
		int balance = 0;
		
		Scanner scn = new Scanner(System.in);
		
		while(flag) {
			System.out.println("=====================MENU=====================");
			System.out.println("1.Deposit | 2.Withdrawal | 3.Balance | 4.Close");
			System.out.print("Your choice> ");
			
			int inputNum = scn.nextInt();
			
			if(inputNum == 1) {
				System.out.print("How much> ");
				int inputAmount = scn.nextInt();
				balance += inputAmount;
			}else if(inputNum == 2) {
				System.out.print("How much> ");
				int inputAmount = scn.nextInt();
				balance -= inputAmount;
			}else if(inputNum == 3) {
				System.out.println("Current Balance> "+balance);
			}else {
				System.out.println("Goodbye!");
				flag = false;
			}
			
			
			
		}
		
		

	}

}
