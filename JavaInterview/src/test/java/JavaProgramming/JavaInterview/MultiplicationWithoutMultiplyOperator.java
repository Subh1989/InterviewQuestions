package JavaProgramming.JavaInterview;

public class MultiplicationWithoutMultiplyOperator {

	public static void main(String[] args) {


		int result = getMultiply(5, 10);
		System.out.println(result);

	}

	private static int getMultiply(int i, int j) {
		
		int k=1;
		int sum = 0;
		while(k<=j)
		{
			sum = sum+i;
			k++;
		}
		
		return sum;
	}

}
