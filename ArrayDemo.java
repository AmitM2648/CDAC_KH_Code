import java.util.Scanner;
class ArrayDemo{
	
	
	public void findMinimum(int[] arr){
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(min);
	}
	
	void printArray(int[] arr){
		System.out.print("Values in Array : ");
		for(int value:arr){
			System.out.print(value+" ");
		}
		System.out.println();
	}
	
	void arrayReverse(int[] arr){
		System.out.print("Reverse ");
		int length=arr.length;
		for(int i=0;i<length;i++){
			int temp=arr[i];
			arr[i]=arr[length-1];
			arr[length-1]=temp;
			length--;
		}
		printArray(arr);
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter size of an Array : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter elements of Array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		ArrayDemo obj=new ArrayDemo();
		obj.printArray(arr);
		obj.findMinimum(arr);
		obj.arrayReverse(arr);
	}
}