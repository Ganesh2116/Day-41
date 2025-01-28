// merge 10 11 20 22 30 33 40 44 50 55

class ArrayMerageQ4
{
	public static void main(String[] arge)
	{
	int a[] = {10,20,30,40,50};
	int b[] = {11,22,33,44,55};
	
	int c[] = new int[a.length+b.length];
	
	// first way
	/*for(int i=0;i<a.length;i++)
	{
		c[i*2] = a[i];
	}
		
	for(int i=0;i<b.length;i++)
	{
		c[i*2+1] = b[i];
	}*/

	// 2nd way only array length same then use 
	int x =0;
	int y =0;
	for (int i=0;i<c.length;i++)
	{
		if (i%2 == 0)
		{
			c[i] = a[x];
			x++;
		}
		else 
		{
			c[i] = b[y];
			y++;
		}
	}
	
	System.out.println("Merage array is :");
	for (int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}
	}
}