
public class Tester {

	public static void main(String[] args) {
		Node n=new Node(1);
		n.next=new Node(1);
		n.next.next=new Node(3);
		n.next.next.next=new Node(2);
		n.next.next.next.next=new Node(1);
		
		Node n1=new Node(8);
		n1.next=new Node(4);
		
		/*RemoveDuplicates obj=new RemoveDuplicates();
		ListFunctions obj1=new ListFunctions();
		//Using HashSet
		//Node node=obj.removeDupUtil(n);
		//Using current Runner Approach
		Node node=obj.removeDup(n);
		obj1.printList(node);*/
		
		/*//Find the K th to the last element
		KthLastElement obj=new KthLastElement();
		//Case1: find starting element
		System.out.println(obj.lastElement(n, 4));
		System.out.println(obj.lastElementUtil(n,4));
		//Case2: find last element
		System.out.println(obj.lastElement(n, 1));
		System.out.println(obj.lastElementUtil(n,1));
		//Case3: Negative test case if index= 0
		System.out.println(obj.lastElement(n, 0));
		System.out.println(obj.lastElementUtil(n,0));
		//Case4: Negative test case if index= -1
		System.out.println(obj.lastElement(n, -1));
		System.out.println(obj.lastElementUtil(n,-1));
		//Case5: Negative test case if index= 10
		System.out.println(obj.lastElement(n, 10));
		System.out.println(obj.lastElementUtil(n,10));
		//Case5: Postive test case if index= 2
		System.out.println(obj.lastElement(n, 2));
		System.out.println(obj.lastElementUtil(n,2));*/
		
		
/*	    //PartitionTheList around the value
		PartitionTheList obj=new PartitionTheList();
		Node curr=obj.paritionUtil(n,3);
		ListFunctions obj1=new ListFunctions();
		obj1.printList(curr);*/
		
		
/*		//Sum of two numbers
		SumOfLinkedList obj=new SumOfLinkedList();
		Node sum=obj.getSum(n,n1);
		ListFunctions obj1=new ListFunctions();
		obj1.printList(sum);*/
		
		
/*		//Return the begining of the node
		CircularList obj=new CircularList();
		Node temp=obj.beginOfLoop(n);
		System.out.println(temp.data);*/
		
		//Check if list is palindrome
		Palindrome pal=new Palindrome();
		System.out.println(pal.isPal(n));
		
	}

}
