package JavaProgramming.JavaInterview;

import java.io.IOException;

// Reverse String
// Reverse String and validate it is palindrome
public class ReverseString {
	
	public static void main(String[] args) throws IOException {

	ReverseString.revString();
	ReverseString.valPalindrome();
	
	}

	private static void valPalindrome() {
		
		String s = "subhankar";
		String revS = "";
		for(int i=s.length()-1; i>=0; i--)
		{
			revS = revS+s.charAt(i);
		}
		System.out.println(revS);
		
	}

	private static void revString() {
		
		String s = "madam";
		String revS = "";
		for(int i=s.length()-1; i>=0; i--)
		{
			revS = revS+s.charAt(i);
		}
		System.out.println(revS);
		if(revS.equalsIgnoreCase(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
	}
}