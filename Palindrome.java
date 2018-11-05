
public class Palindrome {
	static Node left;
	public Boolean isPal(Node node) {
		if(node==null) {
			return null;
		}
		if(node.next==null) {
			return true;
		}
		
		left=node;
		return check(node);
	}

	private Boolean check(Node right) {
	    if(right==null) {
	    	return true;
	    }
	    boolean compare=check(right.next);
	    if(!compare) {
	    	return false;
	    }
	    boolean com=right.data==left.data;
	    left=left.next;
		return com;
	}

}
