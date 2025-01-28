/*Q1.Given an array of N integers. Find the first element that occurs at least K number of times.
 
Example 1:
Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
7
*/

class ArrayQ1
{
	public static void main(String[] arge)
	{
	int a[] ={1, 7, 4, 3, 4, 8, 7};
	
	// first way

	int count =1;
	
	for (int i =0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if (a[i] == a[j]) 
			{
				System.out.println("Output is :"+a[i]);
				count++;
			
			}
		}
	}

	// 2nd way
	
	for (int i=0;i<a.length;i++)
	{
		int count=1;
		for (int j=i+1;j<a.length;j++)
		{
			if (a[i] == a[j])
			{
				a[j] = -1;
				count++;
			}
		}
		if (a[i] != -1)
		System.out.println("The frequency of elements is "+a[i]+" count is: "+count);
	}

	
	}

}