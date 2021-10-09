import java.util.*;
class Mergearray
{
	void marray(int[] arr1, int[] arr2)
	{
		int[] marr = new int[arr1.length+arr2.length];
		int a=0,b=0,c=0;
		while(a < arr1.length)
		{
			marr[c] = arr1[a];
		    a++;
			c++;
		}
		while(b < arr2.length)
		{
			marr[c] = arr2[b];
		    b++;
			c++;
		}
         Arrays.sort(marr);
		 
		 System.out.println("Array 1: "+Arrays.toString(arr1));
		 System.out.println("Array 2: "+Arrays.toString(arr2));
	     System.out.println("Merge Array : "+Arrays.toString(marr));
	}   

 public static void main(String args[])
		{
			Mergearray m=new Mergearray();
			int[] arr1 = new int[]{12,13,45,22,46};
			int[] arr2 = new int[]{34,23,67,11,56};
			m.marray(arr1,arr2);
			
		}
}