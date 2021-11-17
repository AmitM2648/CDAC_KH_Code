class DeleteANode
{
	Node head;
	Node tail;
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		    this.next=null;
		}
	}
	
	void addNode(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next=newnode;
			tail=newnode;
		}
	}
	
	void deleteAt(int index)
	{
		if(head==null)
			return;
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			if(n==null && n.next.next==null)
				return;
			Node node=n.next.next;
			n.next=node;
		}
	}
	
	void display()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	
	
	public static void main(String args[])
	{
		DeleteANode d=new DeleteANode();
		d.addNode(44);
		d.addNode(65);
		d.addNode(11);
		d.addNode(22);
		d.addNode(33);
		d.addNode(86);
		d.addNode(83);
		d.deleteAt(1);
		d.display();
	}
}