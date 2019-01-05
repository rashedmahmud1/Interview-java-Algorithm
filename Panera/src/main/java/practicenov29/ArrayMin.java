package practicenov29;

public class ArrayMin {

	public static void main(String[] args) {
		int[]x = {8,6,9,7,3,9};
		int min = 10;
		int len = x.length;
		for(int s = 0;s<len;s++) {
			if(x[s]<min)
			min = x[s];
	
		}//end of for loop
		System.out.println(min);

	}//end of main method

}//end of class
