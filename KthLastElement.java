
public class KthLastElement {
	
	
	//using current runner approach. Time complexity=0(n power2) space complexity 0(1)
	public int lastElement(Node node, int index) {
		ListFunctions obj=new ListFunctions();
		int Node_Size=obj.calSize(node);
		if(index>Node_Size || index<=0) {
			return -1;
		}
		Node current=node;
		Node runner=node;
		while(index!=0) {
			runner=runner.next;
			index--;
		}
		
		while(runner!=null) {
			current=current.next;
			runner=runner.next;
		}
		
		return current.data;
		
	}
	
	//Time complexity o(n) and space complexity o(1)
	public int lastElementUtil(Node node, int index) {
		ListFunctions obj=new ListFunctions();
		int Node_Size=obj.calSize(node);
		if(index>Node_Size || index<=0) {
			return -1;
		}
	    for(int i=0;i<Node_Size-index;i++) {
	    	node=node.next;
	    }
	    return node.data;
	}

}
