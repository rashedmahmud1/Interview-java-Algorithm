
public class ifelse {
	

	
	int add(int a,int b) {
		int c = a+b;
	return c;

	}//end add
	
	int sub(int a,int b) {
		int c = a*b;
		return c;
		
	}//end of sub
			
		
	
	

	public static void main(String[] args) {
		
     int value1;
     int value2;
	ifelse x = new ifelse();
	value1 = x.add(5, 10);
	System.out.println(value1);
	value2 = x.sub(5, 10);
	System.out.println(value2);	
		if(value1>value2) {
			System.out.println("value1 is smaller:");
		}else {
				System.out.println("value2 is bigger:");
			}
		
	

	}//end of main method

}//end of main class
