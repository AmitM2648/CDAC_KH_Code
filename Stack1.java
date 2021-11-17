class Stack1
{
	static final int max=5;
	int top;
	int arr[]=new int[max];
	
	Stack1()
	{
		top=-1;
	}
	
	boolean isEmpty()
	{
		if(top<0)
		{
			System.out.println("Stack is empty");
		    return true;
		}
        else return false; 		
	}
	
	boolean isFull()
	{
		if(top>=max-1)
		{
			System.out.println("Stack is full");
			return true;
		}
		else return false;
	}
	
	void push(int n)
	{
		if(top>=max-1)
			System.out.println("Data cannot be added to stack");
		else
		{
			top=top+1;
			arr[top]=n;
			System.out.println(n+" Data added to stack");
		}
	}
	
	int peek()
	{
		return arr[top];
	}
	
	void pop()
	{
		if(top<0)
			System.out.println("Data cannot be deleted as stack is empty");
		else
		{
			int x=arr[top];
			top=top-1;
			System.out.println(x+" Data deleted from stack");
		}
	}
	
	static public void main(String args[])
	{
		Stack1 s=new Stack1();
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
		s.push(5);
		s.push(4);
		s.push(8);
		s.push(10);
		s.push(12);
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
		s.pop();
		s.pop();
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
	}
}

			
