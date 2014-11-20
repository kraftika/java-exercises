package data.structures;

public class LinkedList<Integer> {
	private int data;
	private LinkedList<Integer> next;
	
	public int getData(){
		return data;
	}
	
	public void setValue(int value){
		data = value;
	}
	
	public LinkedList<Integer> getNext(){
		return next;
	}
	
	public void setNext(LinkedList<Integer> element){
		next = element;
	}
}
