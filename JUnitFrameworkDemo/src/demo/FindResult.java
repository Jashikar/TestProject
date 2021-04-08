package demo;

public class FindResult {
	public static int FindMaximum(int[] arr)
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	public static boolean isEvenNum(int e)
	{
		if(e%2==0)
			return true;
		else
			return false;
	}
}
