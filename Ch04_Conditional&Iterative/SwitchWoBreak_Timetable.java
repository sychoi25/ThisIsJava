package ch04_CondIterative;

public class SwitchWoBreak_Timetable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//time range
		int time = (int)(Math.random()*5)+9;
		
		System.out.println("Current Time : "+time);
		System.out.println("<To Do>");
		//course
		switch(time) {
		case 9:
			System.out.println("Course A");
		case 10:
		case 11:
			System.out.println("Course B");
		case 12:
			System.out.println("Lunch Time");
		case 13:
		case 14:
			System.out.println("Course C");
		}
		
	}

}
