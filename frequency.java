class frequency
{
	public static void main(String[] arg)
	{
	int a[] ={1,2,3,4,5,6,6,7,8,8,8,8,3,2,3,4,5,7,2,12,2,4,6,6,7,4};

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