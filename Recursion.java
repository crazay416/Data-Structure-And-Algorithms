package recursion;

public class Recursion {
	
	public static void main(String[] args) {
		int num = 3;
		System.out.print("This is func1: ");
		func1(num);
		
		System.out.print("\nThis is func2: ");
		func2(num);
	}
	
	public static void func1(int x) {
		if(x > 0) {
			System.out.print(x + " ");
			func1(x - 1);
		}
	}
	
	public static void func2(int x) {
		if(x > 0) {
			func2(x - 1);
			System.out.print(x + " ");
		}
	}

}
