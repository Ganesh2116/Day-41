/*
Q3.Given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array.
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Note: Retun the index of Equilibrium point. (1-based index)

Example 1:

Input:
n = 5
A[] = {1,3,5,2,2}
Output: 3
*/


class ArrayQ3
{
	public static void main(String[] arge)
	{
	int a[]  = {1,3,5,2,2};
	 
	for (int i=0;i<a.length;i++)
	{
		int lsum = 0;
		int rsum = 0;

		for (int j=0;j<i;j++)
		{
			lsum = lsum +a[j];
			
		}
		// System.out.println(lsum+" ");
		
		for (int k=i+1;k<a.length;k++)
		{
			rsum = rsum +a[k];
			
		}
		//System.out.println(rsum+" ");
		
		if (lsum == rsum)
		{
			System.out.print("output Equilibrium : "+a[i-1]);
			break;
		}
		
	}
	
	
	}
}