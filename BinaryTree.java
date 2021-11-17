class BinaryTree
{
	Node root;
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
		
	}
	
	Node addNode(Node root,int newdata)
	{
		if(root==null)
		{
			root=new Node(newdata);
			return root;
		}
		
		if(newdata<=root.data)
		    root.left=addNode(root.left,newdata);
		else
			root.right=addNode(root.right,newdata);
		return root;
	}
	
	void preorder(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	void postorder(Node root)
	{
		if(root==null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	void preorder()
	{
		preorder(root);
	}
	
	void inorder()
	{
		inorder(root);
	}
	
	void postorder()
	{
		postorder(root);
	}
	
		
	
	void addNode(int newdata)
	{
		root=addNode(root,newdata);
	}
	
	public static void main(String args[])
	{
		BinaryTree bt=new BinaryTree();
		bt.addNode(10);
		bt.addNode(20);
		bt.addNode(5);
		bt.addNode(4);
		bt.addNode(8);
		bt.addNode(15);
		bt.addNode(25);
		bt.preorder();
		System.out.println();
		bt.inorder();
		System.out.println();
		bt.postorder();
		System.out.println();
	}
}
		
