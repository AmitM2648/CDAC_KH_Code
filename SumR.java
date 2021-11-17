class SumR
{
	static int sum(int n)
	{
		if(n<=10)
		{
			return n+sum(n+1);
		}
		else return 0;
	}
	
	public static void main(String args[])
	{
		System.out.println(sum(1));
	}
}