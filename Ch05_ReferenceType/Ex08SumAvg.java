package ch05_ReferenceType;

public class Ex08SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = { {95,86},{83,92,96},{78,83,93,87,88}};
		int sum = 0;
		double avg = 0.0;
		int elementsNum = 0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum += array[i][j];
				elementsNum++;
			}
			
		}
		avg = sum/elementsNum;
		System.out.println(sum);
		System.out.println(avg);
		
		
		
	}

}
