package JavaProgramming.JavaInterview;

public class Swapping {

	public static void main(String[] args) {
		
		Swapping.getSwap();

	}

	private static void getSwap() {
		
		int a = 10;
		int b = 20;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("New value of a:: "+a+" and New value of b:: "+b);
		
	}

}
