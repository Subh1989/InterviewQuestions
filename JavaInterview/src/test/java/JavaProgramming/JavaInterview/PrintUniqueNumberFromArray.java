package JavaProgramming.JavaInterview;

import java.util.ArrayList;

public class PrintUniqueNumberFromArray {

	public static void main(String[] args) {
		
		PrintUniqueNumberFromArray.getNumber();

	}

	private static void getNumber() {
		
		int [] a = {1,2,3,4,1,4};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++)
		{
			int k=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
			}
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					k++;
				}
			}
			
			if(k==1)
			{
				System.out.println(a[i]);
			}
		}
		
	}

}
