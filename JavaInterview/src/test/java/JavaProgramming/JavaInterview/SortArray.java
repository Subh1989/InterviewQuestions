package JavaProgramming.JavaInterview;

public class SortArray {

	public static void main(String[] args) {
		
		SortArray.getArray();

	}

	private static void getArray() {
		
		int [] a = {1,2,3,5,4,6,2};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					a[i] = a[i]+a[j];
					a[j] = a[i]-a[j];
					a[i] = a[i]-a[j];
				}
			}
			System.out.println(a[i]);
		}
		
		
	}

}
