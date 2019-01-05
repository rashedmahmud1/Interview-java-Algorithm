
public class Loop {

	public static void main(String[] args) {
		forloop();
	//dowhileloop();
	// whileloop();
}//end of main method
	
	static void whileloop() {
		
		int counter = 5;
		while(counter<10) {
			counter = counter+1;
			System.out.println(counter);
		}
		
	}
	
	static void dowhileloop() {
		int counter = 10;
		do {
			counter = counter+1;
			System.out.println(counter);
			
		}while(counter<10);
	}
	static void forloop() {
		for(int counter=0;counter<10;counter=counter+1) {
			System.out.println(counter);
			
		}
	}

}//end of class
