package JavaProgramming.JavaInterview;

public class Pyramid {

	public static void main(String[] args) {
		
		Pyramid.getValue();

	}

	private static void getValue() {
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
