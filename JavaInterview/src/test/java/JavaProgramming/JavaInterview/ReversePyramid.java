package JavaProgramming.JavaInterview;

public class ReversePyramid {

	public static void main(String[] args) {
		
		ReversePyramid.getValue();

	}

	private static void getValue() {
		
		for(int i=5; i>0; i--)
		{
			for(int j=i; j>0; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
