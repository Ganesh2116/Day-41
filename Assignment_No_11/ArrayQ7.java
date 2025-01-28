/*
Q7.Given two unsorted arrays that represent two sets (elements in every array are distinct), find the union and intersection of two arrays.

Example:

arr1[] = {7, 1, 5, 2, 3, 6}
arr2[] = {3, 8, 6, 20, 7}
Then your program should print Union as {1, 2, 3, 5, 6, 7, 8, 20} and Intersection as {3, 6, 7}. Note that the elements of union and intersection can be printed in any order.

*/ 


class ArrayQ7
{
	public static void main(String[] arge)
	{
	int a[] = {7, 1, 5, 2, 3, 6};
	int b[] = {3, 8, 6, 20, 7};
	
	int c[] = new int[a.length+b.length];
	
	for (int i=0;i<a.length;i++)
	{
		c[i]=a[i];	
		
	}
		
	for (int i=0;i<b.length;i++)
	{	
		c[a.length+i]=b[i];
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
	
	System.out.print("intresection array is :");
	for (int i=0;i<c.length;i++)
	{	
		for (int j=i+1;j<c.length;j++)
		{
			if (c[i] == c[j])
			{
				System.out.print(c[j]+" ");
			}
		}
	}


	
	for (int i=0;i<c.length;i++)
	{	
		for (int j=i+1;j<c.length;j++)
		{
			if (c[i] == c[j])
			{
				c[j] = -1;
			}
		}
	}

	
	System.out.println("\nUnion array is:");
	for (int i=0;i<c.length;i++)
	{
		if (-1 != c[i])
		System.out.print(c[i]+" ");	
		
	}
	
	}

}