class Print
{
	static void numPrint(int n)
	{
		if (n<101)
	 {
		System.out.println(n);
		numPrint(n+1);
	 }
	}
		
	public static void main(String args[])
	{
		
	 int n1=1;
	 numPrint(n1);
	  
	}
}
