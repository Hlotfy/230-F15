package submission;

import adt.Stack;

public class ArrayStack<T> implements Stack<T> {
	@SuppressWarnings("unchecked")
	private T[] data = (T[])new Object[100];
	private int top = -1;

	public ArrayStack() {
	
	}

	@Override
	public void push(T newEntry) {
		if (top < data.length - 1) {  
			top++;  
			data[top] = newEntry;  
			System.out.println(newEntry);    
		} else {  
			System.out.println("Stack Overflow !");  
		}  
	}  

	@Override
	public T pop() {
		if (top >= 0) {  
			T value = data[top];
			top--;  
			//System.out.println("Pop operation done " + value + " removed!"); 
			return value;
		} else {  
			System.out.println("Stack Underflow !");
			return null;
		}  
	}

	@Override
	public T peek() {
		if(isEmpty()) {
			return null;
		} else {
			System.out.println(data[top]);
			return data[top];
		}
	}

	@Override
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void clear() {
		top = -1;
		//System.out.println("Stack cleared !");
	}
	
	public String toString() {
		String s = "";
		for (int i = top; i >= 0; i--)
			s += "| " + data[i] + " |\n";
			s+= "+++++\n";
		System.out.println(s);
		return s;
	}
	public static void main(String[] args) {  
		Stack<String> stack = new ArrayStack<String>();
		stack.push("Yo");
		stack.push("dude");
		stack.push("please");
		stack.push("work");
		stack.push("no");
		stack.pop();
		stack.peek();
		stack.toString();
		
		
	}
}
