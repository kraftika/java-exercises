package stack;

import utils.StackNode;

public class SimpleStack<E> {
	
	E[] array = null;
	int capacity;
	int size = 0;
	StackNode top;
		
	@SuppressWarnings("unchecked")
	public SimpleStack(int cap) {
		this.capacity = cap;
		this.array = (E[])new Object[cap];
	}
	
	public boolean push(E data) {
		if (this.size == this.capacity) {
			return false;
		}
		
		this.array[size] = data;
		this.size++;
		return true;
	}
	
	public E pop() {
		if (this.size == 0) {
			return null;
		}
		
		E value = array[size - 1];
		array[size] = null;
		size--;
		return value;
	}
	
	public String toString() {
		if(this.size==0){
			return null;
		}
 
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < this.size; i++){
			sb.append(this.array[i] + ", ");
		}
 
		sb.setLength(sb.length()-2);
		return sb.toString();	
	}
	
	public static void main(String[] args) {
		SimpleStack<String> stack = new SimpleStack<String>(11);
		stack.push("M25");
		stack.push("welcome");
		stack.push("test 23");
		System.out.println(stack);
		
		stack.pop();
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
		stack.push("not this way");
		System.out.println(stack);
	}
}
