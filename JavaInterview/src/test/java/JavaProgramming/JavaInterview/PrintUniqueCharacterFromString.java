package JavaProgramming.JavaInterview;

import java.util.ArrayList;

public class PrintUniqueCharacterFromString {

	public static void main(String[] args) {
		
		PrintUniqueCharacterFromString.getChar();

	}

	private static void getChar() {
		
		String s = "madam";
		ArrayList<Character>al = new ArrayList<Character>();
		for(int i=0; i<s.length(); i++)
		{
			int k=0;
			if(!al.contains(s.charAt(i)))
			{
				al.add(s.charAt(i));
				k++;
			}
			for(int j=i+1; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					k++;
				}
			}
			if(k==1)
			{
				System.out.println(s.charAt(i));
			}
		}
		
	}

}
