
public class Method {

	public static void main(String[] args) 	{
		sayHelloWorld();
		sayHelloTo("Charlie");
		sayHelloTo("John");
		int x = returnFive(); 
		System.out.println();
		int result = square(5);
	
		System.out.println(result);
			}
	static int square(int x) {
		return x*x;
	}
	static int returnFive() {
		return 5;
		} 
	
	static void sayHelloTo(String name) {
		System.out.println("Hello,"+name);
	}
	
	static void sayHelloWorld(){
		System.out.println("Hello,World");
	}
}
