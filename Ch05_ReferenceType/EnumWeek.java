package ch05_ReferenceType;

public class EnumWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Week today = Week.SAT;
		Week day1 = Week.MON;
		
		
		System.out.println(today);
		
		String name = today.name();
		System.out.println(today);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		int compareTo = day1.compareTo(today);
		System.out.println(compareTo);
		int compareToReverse = today.compareTo(day1);
		System.out.println(compareToReverse);
		
		Week firstDay = Week.valueOf("MON");
		System.out.println(firstDay);
		
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
				
		
		
		
	}

}
