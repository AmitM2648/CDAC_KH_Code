class Stack
{
	int top;
	int size;
	char arr[];
	Stack(int size)
	{
		top=-1;
		this.size=size;
		arr=new char [size];
	}
	
	boolean isEmpty()
	{
		if(top<0)
			return true;
		else return false;
	}
	
	boolean push(char x)
	{
		if(top>=size)
			return false;
		else
		{
			top=top+1;
			arr[top]=x;
			return true;
		}
	}
	
	char pop()
	{
		if(top<0)
			return 0;
		else
		{
			char x=arr[top];
			top=top-1;
			return x;
		}
	}
	
			
}

class StackRev
{
	static void reverse(StringBuffer str)
	{
		int size=str.length();
		Stack s=new Stack(size);
		
		for(int i=0;i<size;i++)
			s.push(str.charAt(i));
		
		for(int i=0;i<size;i++)
		{
			char ch=s.pop();
			str.setCharAt(i,ch);
		}
    }
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("AmitMusale");
		reverse(sb);
		System.out.println(sb);
	}
}