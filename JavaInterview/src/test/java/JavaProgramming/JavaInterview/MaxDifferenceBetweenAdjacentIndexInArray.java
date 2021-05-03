package JavaProgramming.JavaInterview;

public class MaxDifferenceBetweenAdjacentIndexInArray {

	public static void main(String[] args) {
		
		MaxDifferenceBetweenAdjacentIndexInArray.getDiff();

	}

	private static void getDiff() {
		
		int [] a = {1,2,3,4,8,12,10,22,23};
		int diff = 0;
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i+1]-a[i]>diff)
			{
				diff = a[i+1]-a[i];
			}
		}
		System.out.println(diff);
		
	}

}
