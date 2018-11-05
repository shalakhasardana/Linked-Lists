
public class SumOfLinkedList {
	
	Node getSum(Node node1,Node node2) {
		if(node1==null && node2 ==null) {
			return null;
		}
		if(node1==null) {
			return node2;
		}
		if(node2==null) {
			return node1;
		}
		int SizeOfNode1=ListFunctions.calSize(node1);
		int SizeOfNode2=ListFunctions.calSize(node2);
		if(SizeOfNode1 != SizeOfNode2) {
			if(SizeOfNode1>SizeOfNode2) {
				node2=padding(node2,SizeOfNode1-SizeOfNode2);
			}else {
				node1=padding(node1,SizeOfNode2-SizeOfNode1);
			}
		}
		Node sum=new Node(0);
		Node head=sum;
		int carry=0;
		while(node1!=null) {
			int data=node1.data+node2.data+carry;
			if(data>=10) {
				carry=1;
				data=data%10;
			}else {
				carry=0;
			}
			
		sum.next=new Node(data);
		sum=sum.next;
			
		node1=node1.next;
		node2=node2.next;
		}
		if(carry!=0) {
			sum.next=new Node(1);
		}
		return head.next;
		
	}

	private Node padding(Node node, int i) {
		Node temp=node;
		while(node.next!=null) {
			node=node.next;
		}
		while(i!=0) {
			Node curr=new Node(0);
			node.next=curr;
			node=node.next;
			i--;
		}
		
		return temp;
	}

}
