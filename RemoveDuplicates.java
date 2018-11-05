import java.util.HashSet;

public class RemoveDuplicates {
	/*
	 * using temprary buffer for example Hash Set
	 * Time complexity-o(n)
	 * Space complexity-o(n)
	 * */
	
	static Node head;
	public Node removeDupUtil(Node node) {
		head=node;
	    HashSet<Integer> hash=new HashSet<Integer>(); 
	    hash.add(node.data);
	    while(node.next!=null) {
	    	if(hash.contains(node.next.data)) {
	    		node.next=node.next.next;
	    	}else {
	    		hash.add(node.next.data);
	    		node=node.next;
	    	}
	    	
	    	
	    }
		return head;
	}
	
	
	
	/*Using current and runner approach
	 * Time complexity-o(n power2)
	 * Space complexity-o(1)
	 * */
	
	public Node removeDup(Node node) {
	head=node;
		Node current=node;
		Node runner=node;
		while(current !=null) {
			while(runner.next!=null) {
				if(current.data==runner.next.data) {
					runner.next=runner.next.next;
				}else {
			        runner=runner.next;
				}   
			}
			current=current.next;
		}
		return head;
	}
}
