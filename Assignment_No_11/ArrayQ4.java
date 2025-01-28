/*
Q4.You are given two arrays, A and B, of equal size N. The task is to find the minimum value of A[0] * B[0] + A[1] * B[1] + .... + A[N-1] * B[N-1], where shuffling of elements of arrays A and B is allowed.


Example 1:
Input:
N = 3
A[] = {3, 1, 1}
B[] = {6, 5, 4}
Output:
23
*/

class ArrayQ4
{
	public static void main(String[] arge)	
	{
	int a[] = {3,1,1};
	int b[] = {6,5,4};
	
	System.out.println("Sort accsending  array 1st:");
	for (int i=0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if (a[i]>a[j])
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	
	for (int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	
	System.out.println("\nSort descending  array 2nd:");
	for (int i=0;i<b.length;i++)
	{
		for (int j=i+1;j<b.length;j++)
		{
			if (b[i]<b[j])
			{
				int temp = b[i];
				b[i] = b[j];
				b[j] = temp;
			}
		}
	}
	
	for (int i=0;i<b.length;i++)
	{
		System.out.print(b[i]+" ");
	}
	
		
	int sum = 0;
	for (int i=0;i<a.length;i++)
	{
		sum =sum + a[i]*b[i];
	}
	
	System.out.println("\nOutput is: "+sum);
	}
}