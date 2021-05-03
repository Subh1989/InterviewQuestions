package JavaProgramming.JavaInterview;

import java.util.ArrayList;

public class CompareTwoArraysAndCreateNewArrayForMatchedValue {

	public static void main(String[] args) {
		
		CompareTwoArraysAndCreateNewArrayForMatchedValue.getArray();

	}

	private static void getArray() {
		
		int a[] = {1,2,3,4};
		int b[] = {1,2,5,6};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==b[i])
			{
				al.add(a[i]);
			}
		}
		System.out.println(al);
		Object[] obj = al.toArray();
		for(Object c:obj)
		{
			System.out.println(c);
		}
		
	}

}
