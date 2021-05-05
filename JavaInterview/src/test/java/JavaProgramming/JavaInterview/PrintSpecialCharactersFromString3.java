package JavaProgramming.JavaInterview;

public class PrintSpecialCharactersFromString3 {

	public static void main(String[] args) {
		
		PrintSpecialCharactersFromString3.getSp();

	}

	private static void getSp() {
		
		String s = "abcd1234%%%";
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<s.length(); i++)
		{
			if(!Character.isLetterOrDigit(s.charAt(i)))
			{
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb);
		
	}

}
