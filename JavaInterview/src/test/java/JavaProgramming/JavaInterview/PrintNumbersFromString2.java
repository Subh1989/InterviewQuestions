package JavaProgramming.JavaInterview;

public class PrintNumbersFromString2 {

	public static void main(String[] args) {
		
		PrintNumbersFromString2.getNumbers();

	}

	private static void getNumbers() {
		
		String s = "abcd1234%%%";
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb);
		
	}

}
