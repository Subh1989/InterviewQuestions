package JavaProgramming.JavaInterview;

public class PrintAlphabetsFromString {

	public static void main(String[] args) {
		
		PrintAlphabetsFromString.getAlphabet();

	}

	private static void getAlphabet() {
		
		String s = "abcd1234%%%";
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb);
		
	}

}
