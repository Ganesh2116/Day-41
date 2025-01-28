/*
Q2.Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
*/

class ArrayQ2
{
	public static void main(String[] arg)
	{
	int a[] = {16,17,4,3,5,2};
	
	
	System.out.print("Output is :");
	for (int i=0;i<a.length;i++)
	{
		int j ;
		for (j=i+1;j<a.length;j++)
		{
			if (a[i] < a[j])
			{
				break;
			}
		}
	
		if (j == a.length)
		{
			System.out.print(a[i]+" ");
		}
	}	
	
	}
}