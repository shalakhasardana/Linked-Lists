
public class ListFunctions {
	static Node head1;
	
	public static void printList(Node head) {
		if(head==null) {
			return;
		}
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public static Node deleteNode(Node head, int d) {
		if(head==null) {
			return null;
		}
		if(head.data==d) {
			return head.next;
		}
		
		Node curr=head;
		while(curr.next !=null) {
			if(curr.next.data==d) {
				curr.next=curr.next.next;
				break;
			}
			curr=curr.next;
		}
		
		return head;
		
	}
	
	
	//return size of linkedlist
	public static int calSize(Node head) {
		if(head==null) {
			return 0;
		}
		Node n=head;
		int count=0;
		while(n !=null) {
			count=count+1;
			n=n.next;
		}
		return count;
		
	}
	
	public static Node insertInFront(Node head, int value) {
		if(head==null) {
			return new Node(value);
		}
		Node n=new Node(value);
		n.next=head;
		head=n;
		return head;
	}
	
	public static Node reverseListIterative(Node head) {
		if(head==null) {
			return null;
		}
		if(head.next==null) {
			return head;
		}
		
		Node node=reverseUtil(head,null);
		
		
		
		return node;
		
	}

	private static Node reverseUtil(Node curr, Node parent) {
		if(curr==null) {
			parent.next=curr;
			head1=parent;
			return head1;
			
		}
		
		Node node=curr.next;
		parent=curr;
		Node p=reverseUtil(node,parent);//3->null
		while(p.next!=null) {
		p=p.next;	
		}
		p.next=parent;
		p.next.next=null;
		return head1;
	}

}
