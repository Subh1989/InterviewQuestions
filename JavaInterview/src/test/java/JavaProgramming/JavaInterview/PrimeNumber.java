package JavaProgramming.JavaInterview;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int val = 100;
		PrimeNumber.getNumber(val);

	}

	private static int getNumber(int val) {
		
		boolean flag = false;
		for(int i=2; i<=val/2; i++)
		{
			if(val%i==0)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Not a prime Number");
		}
		else
		{
			System.out.println("Prime Number");
		}
		
		return val;
	}

}
