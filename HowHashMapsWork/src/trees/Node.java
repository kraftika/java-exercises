package trees;

public class Node {
	private int data;
	private Node left;
	private Node right;
	
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public Node left() {
		return this.left;
	}
	
	public Node right() {
		return this.right;
	}
	
	public void setLeft(Node n) {
		this.left = n;
	}
	
	public void setRight(Node n) {
		this.right = n;
	}
	
	public int getData(){
		return this.data;
	}
}	
