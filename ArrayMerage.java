// merge

class ArrayMerage
{
	public static void main(String[] arge)
	{
	int a[] = {11,22,33,44,55};
	int b[] = {1,2,3,4,5};
	int c[] = new int[a.length+b.length];
	
	int x= 0;
	for(int i=0;i<a.length;i++)
	{
		c[i] = a[i];
		x++;
	}
		
	for(int i=0;i<b.length;i++)
	{
		c[x] = b[i];
		x++;
	}
	
	System.out.println("Merage array is :");
	for (int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}
	}
}