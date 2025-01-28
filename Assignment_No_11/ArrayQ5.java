/*
Q5.Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. The task is to find the element that would be at the k’th position of the final sorted array.
 

Example 1:

Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output:
6
*/

class ArrayQ5
{
	public static void main(String[] arge)
	{
	int a[] = {2, 3, 6, 7, 9};
	int b[] =  {1, 4, 8, 10};
	
	int c[] = new int[a.length+b.length];
	
	for (int i=0;i<a.length;i++)
	{
		c[i] = a[i];
		
		
	}
	
	for (int i=0;i<b.length;i++)
	{
		c[a.length+i] = b[i];
		
	}
	
	for (int i=0;i<c.length;i++)
	{
		for (int j=i+1;j<c.length;j++)
		{
			if (c[i]>c[j])
			{
				int temp = c[i];
				c[i] = c[j];
				c[j] = temp;
			}
		}
	}	
	int k = 5;
		
	System.out.print("Kth position element is :");
	for (int i=0;i<c.length;i++)
	{
		if (i+1 == k)
		{
			System.out.print(c[i]);
			
		}
	}
	}
}