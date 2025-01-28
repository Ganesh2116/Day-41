// merge 10 55 20 44 30 33 40 22 50 11

class ArrayMerageQ5
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
		c[i*2+1] = b[b.length-i-1];
	}*/
	
	// 2nd way when array same length
	int x = 0;
	int y = b.length-1;
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