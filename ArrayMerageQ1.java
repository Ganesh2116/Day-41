// merge 10 20 30 40 50 55 44 33 22 11

class ArrayMerageQ1
{
	public static void main(String[] arge)
	{
	int a[] = {10,20,30,40,50};
	int b[] = {11,22,33,44,55};
	
	int c[] = new int[a.length+b.length];
	
	int x= 0;
	for(int i=0;i<a.length;i++)
	{
		c[i] = a[i];
		x++;
	}
		
	for(int i=b.length-1;i>=0;i--)
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