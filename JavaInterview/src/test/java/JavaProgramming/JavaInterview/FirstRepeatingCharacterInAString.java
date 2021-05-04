package JavaProgramming.JavaInterview;

import java.util.ArrayList;

public class FirstRepeatingCharacterInAString {

	public static void main(String[] args) {
		
		String s = "abcdabcd";
		char[] a = s.toCharArray();
		System.out.println(firstRepeating(a));

	}

	private static char firstRepeating(char[] a) {
		
		ArrayList<Object>al = new ArrayList<Object>();
		for(int i=0; i<a.length; i++)
		{
			char c = a[i];
			if(al.contains(c))
			{
				return c;
			}
			else
			{
				al.add(c);
			}
		}
		
		return 0;
	}

}
