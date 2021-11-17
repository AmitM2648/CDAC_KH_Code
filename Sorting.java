class Sorting
{
	void bubbleSort(int arr[])
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
				}
			}
		}
	}
	
	void selectionSort(int arr[])
	{
		int size=arr.length;
		for(int i=0;i<size-1;i++)
		{
			int min=i;
			for(int j=i+1;j<size;j++)
			{
				if(arr[j]<arr[min])
				{
					min=arr[j];
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	
	void insertionSort(int arr[])
	{
		int size=arr.length;
		for(int i=1;i<size;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
			
	void display(int arr[])
	{
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Sorting s=new Sorting();
		int arr[]={5,2,6,1,3};
		//s.bubbleSort(arr);
		//s.display(arr);
		//s.selectionSort(arr);
		//s.display(arr);
		s.insertionSort(arr);
		s.display(arr);
	}
}
