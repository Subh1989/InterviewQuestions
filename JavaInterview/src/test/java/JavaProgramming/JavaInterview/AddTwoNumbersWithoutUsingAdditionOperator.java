package JavaProgramming.JavaInterview;

public class AddTwoNumbersWithoutUsingAdditionOperator {

	public static void main(String[] args) {
		
		System.out.println(AddTwoNumbersWithoutUsingAdditionOperator.Add(4,3));

	}

	private static int Add(int x, int y) {
		
		while(y!=0) {
			
			int carry = x&y;
			x = x^y;
			y = carry<<1;
		}
		
		return x;
	}

}
