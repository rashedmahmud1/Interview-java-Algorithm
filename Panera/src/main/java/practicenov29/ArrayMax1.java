package practicenov29;

public class ArrayMax1 {

	public static void main(String[] args) {
		int x [] = {2,4,6,8,10};
		int max = 0;
		int len = x.length;
		
		for(int s=0;s<len;s++) {
			if(x[s]>max)
				max = x[s];
		}
  System.out.println(max);
	
	}//end of main method
}//end of class

