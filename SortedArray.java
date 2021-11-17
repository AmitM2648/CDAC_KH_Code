class SortedArray
{
	static void Sort(int arr[])
	{
		int size=arr.length;
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					for(int k=0;k<size;k++)
		            {
			            System.out.print(arr[k]+" ");
		            }
					System.out.println();
				}
			}
		}
		System.out.println("Sorted array");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		int arr[]={34,64,25,12,22,11,10};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Sort(arr);
	}
}
