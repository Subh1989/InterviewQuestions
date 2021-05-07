package JavaProgramming.JavaInterview;

import org.testng.Assert;

public class ReverseANumberAndValidatePalindrome {

	public static void main(String[] args) {
		
		ReverseANumberAndValidatePalindrome.revNum();

	}

	private static void revNum() {
		
		int a = 121;
		int b = 121;
		int rev = 0;
		int sum = 0;
		
		while(a!=0)
		{
			int digit = a%10;
			rev = digit+rev*10;
			a = a/10;
			sum = sum+digit;
		}
		
		System.out.println(rev);
		System.out.println(sum);
		if(rev==b)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}
