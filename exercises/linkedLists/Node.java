package linkedLists;

/**
 * Created by ipistol on 4/5/15.
 */
public class Node {
  public int data;
  public Node nextNode;

  public Node(int data){
    this.data = data;
    this.nextNode = null;
  }

  public int getData(){
    return this.data;
  }

  public Node getNext(){
    return this.nextNode;
  }

  public void setNext(Node n){
    this.nextNode = n;
  }
}
