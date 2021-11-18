import java.util.*;

public class InfixtoPostfix {

	String conversion(String Expression) {
		int size=Expression.length();
		Stack stack = new Stack(size);
		String result = new String("");

		for (int i = 0; i < Expression.length(); i++) {
			char c = Expression.charAt(i);

			if (Character.isLetterOrDigit(c))
				result += c;

			else if (c == '(') {
				stack.push(c);
			}

			else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(')
					result += stack.pop();
				stack.pop();
			} else {
				while (!stack.isEmpty() && (prioritys(c) <= prioritys(stack.peek()))) {
					result += stack.pop();
				}
				stack.push(c);
			}
		

		}
		while (!stack.isEmpty()) {
			if(stack.peek()=='(') {
				return "invalidExpression";		
			}
			result +=stack.pop();
		}
		return result;
		

	}
// deciding the priorities
	int prioritys(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;

		}
		return -1;

	}

	public static void main(String[] args) {
		InfixtoPostfix i1 = new InfixtoPostfix();
		String s=i1.conversion("a*b+(c+d)e-f(g-e*y)-l");
		System.out.println(s);
	}
}
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
	
	char peek()
	{
		return arr[top];
	}
}