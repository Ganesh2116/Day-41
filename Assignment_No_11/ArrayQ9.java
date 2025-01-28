/*
Q9.Given an array of integers. All numbers occur twice except one number which occurs once. Find the number
Example :

Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
Output: 2
*/


class ArrayQ9
{
	public static void main(String[] arge)
	{
	int a[] = {2, 3, 5, 4, 5, 3, 4};
	
	for (int i=0;i<a.length;i++)
	{	
		int j;
		for (j=i+1;j<a.length;j++)
		{
			if(a[i] == a[j])
			{
				a[j] = -1;
				break;
			}
		}
		if (j == a.length && a[i] != -1)
		{
			System.out.print(a[i]+" ");
		}
	}
	}
}