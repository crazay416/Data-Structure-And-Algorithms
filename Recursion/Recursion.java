package algorithms;

public class Recursion {
	
	
	public static void main(String[] args) {
		System.out.println("Prints number before recursion");
		fun1(3);
		System.out.println("\nPrints number after recursion recursion");
		fun2(3);
	}
	
	
	static void fun1(int n) {
		if (n > 0) {
			System.out.println(n);
			fun1(n - 1);
		}
	}
	
	
	static void fun2(int n) {
		if (n > 0) {
			fun2(n - 1);
			System.out.println(n);
		}
	}

}
