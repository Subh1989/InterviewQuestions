package JavaProgramming.JavaInterview;

public class SwapString {

	public static void main(String[] args) {
		
		String a = "Test";
		String b = "api";
		System.out.println("Before swap: "+a+" "+b);
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("After swap: "+a+" "+b);
	}

}
