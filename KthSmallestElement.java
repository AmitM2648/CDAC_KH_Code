import java.util.*;
class KthSmallestElement
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter array size");
	  int size=sc.nextInt();
	  int arr[]=new int [size];
	  System.out.println("Enter array elements");
	  for(int i=0;i<size;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  
	   System.out.println("Enter kth Smallest element");
	  int n=sc.nextInt();
	   for(int i=0;i<size;i++)
		{
			for (int j=i+1;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					int n1=arr[i];
					arr[i]=arr[j];
					arr[j]=n1;
				}
			}
			
		}
		System.out.println("kth Smallest number is "+arr[size-n]);
	}
}
