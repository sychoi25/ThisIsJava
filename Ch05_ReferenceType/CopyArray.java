package ch05_ReferenceType;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#1 for loop
		int oldArray[] = {12,23,45};
		int newArray[] = new int[5];
		
		for(int i=0;i<oldArray.length;i++) {
			newArray[i] = oldArray[i];
		}
		
		
		//#2 System.arraycopy(orgArray, startingIndex, newArray, startingIndex, howMany)
		int orgArray[] = {12,23,34};
		int newArray2[] = new int[5];
		
		System.arraycopy(orgArray, 0, newArray2, 0, orgArray.length);
		
		
		
		for(int i=0;i<newArray.length;i++) {
			System.out.println(newArray[i]);
		}
		for(int i=0;i<newArray2.length;i++) {
			System.out.println(newArray2[i]);
		}
		
	}

}
