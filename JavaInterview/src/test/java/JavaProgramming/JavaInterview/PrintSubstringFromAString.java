package JavaProgramming.JavaInterview;

public class PrintSubstringFromAString {

	public static void main(String[] args) {
		
		String s = "abcd";
		char[] a = s.toCharArray();
		PrintSubstringFromAString.getSubstring(a, a.length);

	}

	private static void getSubstring(char[] a, int n) {
		
		for(int len = 1; len<=n; len++)
		{
			for(int i=0; i<=n-len; i++)
			{
				int j=i+len-1;
				for(int k=i; k<=j; k++)
				{
					System.out.print(a[k]);
				}
				System.out.println();
			}
		}
		
	}

}
