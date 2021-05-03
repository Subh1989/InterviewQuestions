package JavaProgramming.JavaInterview;

public class CountOccuranceOfCharacterInAString {

	public static void main(String[] args) {
		
		int count = CountOccuranceOfCharacterInAString.getCount("Community", 'm');
		System.out.println(count);

	}

	private static int getCount(String s, char c) {
		
		int count = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==c)
			{
				count++;
			}
		}
		
		return count;
	}

}
