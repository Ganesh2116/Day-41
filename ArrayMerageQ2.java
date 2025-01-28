// merge 50 40 30 20 10 11 22 33 44 55

class ArrayMerageQ2
{
	public static void main(String[] arge)
	{
	int a[] = {10,20,30,40,50};
	int b[] = {11,22,33,44,55};
	
	int c[] = new int[a.length+b.length];
	
	int x= 0;
	for(int i=a.length-1;i>=0;i--)
	{
		c[x] = a[i];
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