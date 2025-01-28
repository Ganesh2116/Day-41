// merge 50 55 40 44 30 33 20 22 10 11

class ArrayMerageQ7
{
	public static void main(String[] arge)
	{
	int a[] = {10,20,30,40,50};
	int b[] = {11,22,33,44,55};
	
	int c[] = new int[a.length+b.length];
	
	int x = a.length-1;
	int y  = b.length-1;
	
	for (int i=0;i<c.length;i++)
	{
		if (i%2 == 0)
		{
			c[i] = a[x];
			x--;
		}
		else
		{
			c[i] = b[y];
			y--;
		}
	}
		
	System.out.println("Merage array is :");
	for (int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}
	}
}