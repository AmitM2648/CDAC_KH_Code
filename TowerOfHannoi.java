class TowerOfHannoi
{
	static void tower(int n,char s,char i,char d)
	{
		if(n==1)
		{
			System.out.println("Disk 1 Moves from "+s+" to "+d);
		}
		else
		{
			tower(n-1,s,d,i);
			System.out.println("Disk "+n+"Moves from "+s+" to "+d);
			tower(n-1,i,s,d);
		}
	}
	
	public static void main(String args[])
	{
		int n=3;
		tower(n,'A','B','C');
	}
}
