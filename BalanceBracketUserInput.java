import java.util.Scanner;
class Stack{
	int top;
	int capacity;
	char[] arr;
	Stack(int capacity){
		this.capacity=capacity;
		this.top=-1;
		this.arr=new char[capacity];
	}
	
	boolean isFull(){
		return top==capacity-1;
	}
	
	boolean isEmpty(){
		return top==-1;
	}
	
	void push(char value){
		if(!isFull())
			arr[++top]=value;
	}
	
	char pop(){
		if(isEmpty())
			return ' ';
		else
			return arr[top--];
	}
}

class BalanceBracketUserInput{
	static boolean balance(String str){
		int size=str.length();
		Stack stack=new Stack(size);
		for(int i=0;i<size;i++){
			char ch=str.charAt(i);
			if(ch=='(' || ch=='[' || ch=='{'){
				stack.push(ch);
				continue;
			}
			if(stack.isEmpty())
				return false;
			char check;
			switch(ch){
				case ')' : 
					check = stack.pop();
					if(check == '{' || check == '[')
						return false;
					break;
					
				case '}' : 
					check = stack.pop();
					if(check == '(' || check == '[')
						return false;
					break;
					
				case ']' : 
					check = stack.pop();
					if(check == '{' || check == '(')
						return false;
					break;
			}
		}
		return (stack.isEmpty());
	}
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=scan.next();
		if(balance(str))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}