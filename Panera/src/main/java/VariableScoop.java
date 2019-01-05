
public class VariableScoop {
	//because x is declared outside of any method, it is an scoop to all methods,
	//in other words any method can access x;
	static int x;
	
	public static void main(String[] args) {
		x = 5;
System.out.println(x);
doSomething();
System.out.println(x);

	}
	static void doSomething() {
		x = 10;
		
	}

	}
	

		
	


