
public class LinkedList {
	public class Node {
	    int val;
	    Node next;

	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	    }
	}

	
	private Node head = null;
	private Node tail = null;
	
	public String toString() {
		String str = "[";
		if(head != null) {
			Node current = head;
			while(current.next != null) {
				str+= current.val + ", ";
				current = current.next;
			}
			str += current.val;
		}
		str +="]";
		return str;
	}
	public void add(int val) { 
		Node aNode = new Node(val);
		if(head == null) {
			head = aNode;
			tail = aNode;
		}else {
			tail.next = aNode;
			tail = aNode;
			}
		}
	public void remove(int a) {
		if(head == null) {
			return;
		}
		while(head != null && head.val == a) {
			head = head.next;
		}
		Node current = head;
		while(current != null && current.next != null) {
			if(current.next.val == a) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
		}

	}
	public static LinkedList merge(LinkedList a, LinkedList b) {
		LinkedList mergedList = new LinkedList();
		Node current1 = a.head;
		Node current2 = b.head;
		while(current1 != null && current2 != null) {
			if(current1.val < current2.val) {
				mergedList.add(current1.val);
				current1 = current1.next;
			}else {
				mergedList.add(current2.val);
				current2 = current2.next;
			}
		}
		while(current1 != null) {
			mergedList.add(current1.val);
			current1 = current1.next;
		}
		while(current2 != null) {
			mergedList.add(current2.val);
			current2 = current2.next;
		}
		return mergedList;
	}
	
}