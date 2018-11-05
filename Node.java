//Implementation of Singly linkedList
public class Node {
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
	
//Convert array into singly linkedlist	
	public Node(int[] array) {
		data=array[0];
		Node curr=this;
		for(int i=1;i<array.length;i++) {
			curr.next=new Node(array[i]);
			curr=curr.next;
			
		}
	}
//creates a node that append it to tail of singly linkedlist
	public void appendToTail(int data) {
		Node n=this;
		while(n.next!=null) {
			n=n.next;
		}
		n.next=new Node(data);
		
	}
//append node to tail of singly linkedlist	
    public void appendToTail(Node node) {
    	Node n=this;
		while(n.next!=null) {
			n=n.next;
		}
		n.next=node;
	}

}
