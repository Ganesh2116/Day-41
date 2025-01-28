/*
Q6.Given an array of size N filled with numbers from 1 to N-1 in random order. The array has only one repetitive element. The task is to find the repetitive element.

Examples:

Input: a[] = {1, 3, 2, 3, 4}
Output: 3
*/

class ArrayQ6
{
	public static void main(String[] arge)
	{
	int a[]  = {1, 3, 2, 3, 4};
	
	int sum = 0;
	for (int i=0;i<a.length;i++)
	{
		sum = sum +a[i];
	}
	
	// formula = (n-1 )* n/2; n = a.length;

	int exsum = (a.length-1)*a.length/2;
	
	int rep = sum - exsum;
	
	System.out.println("repetitive elements is :"+rep);
	
	}
}