package JavaProgramming.JavaInterview;

public class Fibonacci {

	public static void main(String[] args) {
		
		Fibonacci.getfibonacci();

	}

	private static void getfibonacci() {
		
		int n = 9;
		int f1 = 0;
		int f2 = 1;
		int k = 0;
		while(k<n)
		{
			int sum = f1+f2;
			System.out.println(sum);
			f1 = f2;
			f2 = sum;
			k++;
		}
		
	}

}
