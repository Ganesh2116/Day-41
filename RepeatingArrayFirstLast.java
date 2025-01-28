class RepeatingArrayFirstLast
{
	public static void main(String[] arge)
	{
	int a[] = {2,3,4,5,6,78,7,4,2,3,10};
	
	int count = 0;
	
	// first repeating array elements 
	System.out.print("First repeating array elements is :");
	for (int i =0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if (a[i] == a[j])
			{
				System.out.print(a[i]+" ");
				count++;
				break;
			}
		}
		if (count>0)
		{
			break;
		}	
	}
	
	int lcount =0;
	for (int i =0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if (a[i] == a[j])
			{
				lcount =a[i];
		
			}
		}
			
	}
	
	System.out.println("Last repeating array element is : "+lcount);

	}
}