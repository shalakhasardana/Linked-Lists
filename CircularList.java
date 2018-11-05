
public class CircularList {
	Node beginOfLoop(Node node) {
		if(node==null) {
			return null;
		}
	Node current=node;
	Node runner=node;
	current=current.next;
	runner=runner.next.next;
	while(current!=runner) {
		current=current.next;
		runner=runner.next.next;
	}
	current=node;
	while(current !=runner) {
		current=current.next;
		runner=runner.next;
	}
	return current;
	}
}
