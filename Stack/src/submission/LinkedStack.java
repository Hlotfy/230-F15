package submission;

import java.util.EmptyStackException;

import adt.Stack;

public class LinkedStack<T> implements Stack<T> {
	private Node top;
	
	@Override
	public void push(T newEntry) {
		Node oldTop = top;
		top = new Node(newEntry, oldTop);
	}

	@Override
	public T pop() {
		if(isEmpty()) {
			return null;
		}else{
			T oldTop = top.data;
			top = top.next;
			return oldTop;
		}
	}

	@Override
	public T peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}else{
			return top.data;
		}
	}

	@Override
	public boolean isEmpty() {
		return top==null;
	}

	@Override
	public void clear() {
		top = null;
	}
	
	public String toString() {
		String s = "";
		for (Node n = top; n != null; n = n.next)
			s += "| " + n.data + " |\n";
		s+= "+++++\n";
		return s;
	}
	
	private class Node 
	{
	  private T    data; // Entry in bag
	  private Node next; // Link to next node

		private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
	} // end Node

}
