// merge 50 11 40 22 30 33 20 44 10 55

class ArrayMerageQ6
{
	public static void main(String[] arge)
	{
	int a[] = {10,20,30,40,50};
	int b[] = {11,22,33,44,55};
	
	int c[] = new int[a.length+b.length];

	int x = a.length-1;
	int y = 0;
	
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