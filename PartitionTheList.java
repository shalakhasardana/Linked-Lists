
public class PartitionTheList {
	public Node paritionUtil(Node node, int data) {
		Node BeforeNode=null;
		Node AfterNode=null;
		while(node!=null) {
			Node NextNode=node.next;
			if(node.data>=data) {
				node.next=AfterNode;
				AfterNode=node;
			}else {
				node.next=BeforeNode;
				BeforeNode=node;
			}
			node=NextNode;
		}
		if(BeforeNode==null) {
			return AfterNode;
		}else if(AfterNode==null) {
			return BeforeNode;
		}else {
			Node temp=BeforeNode;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=AfterNode;
		return BeforeNode;
		}
	}

}
