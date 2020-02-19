package lab8.pro3removemax;

import java.util.NoSuchElementException;

public class MinDoublyLinkedList {

	Node header;

	public MinDoublyLinkedList() {
		header = new Node();
	}
// add elements in sorting order
	public void add(String item) {
		// implement
		Node firstNode = header.next;
		if (firstNode == null) {
			header.next = new Node(item, null, header);
			return;
		}
		if (firstNode.value.compareTo(item) < 0) {
			Node secondNode = firstNode.next;
			Node newNode = new Node(item, secondNode, firstNode);
			firstNode.next = newNode;
			if (secondNode != null) {
				secondNode.previous = newNode;
			}
		} else {
			Node newNode = new Node(item, firstNode, header);
			header.next = newNode;
			firstNode.previous = newNode;
		}
	}

	// returns the minimum element in the linkedlist
	public String min() {
		Node curr= header.next;
		String min= curr.value;
		for(Node i=curr.next;i!=null;i=i.next) {
			if(i.value.compareTo(curr.value)<0) {
				min= i.value;
			}
		}
		return min;
	}

//	// finds the maximum element in the linkedlist and removes it.
	public String removeMaxz() {
		if (header.next==null) {
			throw new NoSuchElementException();
		}
	Node curr= header.next;
	Node max= curr;
	String maxval= max.value;
	for(Node i=curr;i!=null;i=i.next) {
		if(maxval.compareTo(i.value)>0) {
			max.value= i.value;
			max=i;
		}
	
	
	Node pre=i.previous;
	Node next= i.next;
	pre.next= next;
	pre= curr.next.previous;
	
	
	}
	return max.value;
	}
	
	

	public Node removeExtra() {
		Node curr = header;
		
		for (Node i = curr.next; i != null; i = i.next) {
			if (curr.value == i.value) {
				Node pre = i.previous;
				Node next = i.next;
				if (next != null) {
					next.previous = pre;
				}
				curr = i;
				
			}
		}
		System.out.println(curr);
		return curr;
		
	}
	public String removeDuplicate() {
		if( header.next==null) {
			throw new NoSuchElementException();
		}
		Node curr= header;
		String dep=curr.value;
		Node zex= curr.next;
		for(Node i= curr;i!=null;i=i.next) {
			for(Node j= zex;j!=null;j=j.next) {
				if(j.value.equals(i.value)) {
					dep=j.value;
					//zex.value= null;
					zex=null;
				}
			}
			Node pre= curr;
			Node next= curr.next;
			pre= next.previous;
			pre.next=next;
			
		}
		return dep;
//	}
// find the max element in the linked list and remove it
//	public String removeMax() {
//		Node curr = header.next;
//		Node max = curr;
//		String maxval = curr.value;
//		for (Node i = curr.next; i != null; i = i.next) {
//			if (maxval.compareTo(i.value) < 0) {
//				maxval = i.value;
//				max = i;
//			}
//		}
//		Node pre = max.previous;
//		Node next = max.next;
//		pre.next = next;
//		next.previous = pre;
//		return maxval;
//	}
//


	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}

		public Node(String value, Node next, Node previous) {
			this.value = value;
			this.next = next;
			this.previous = previous;
		}

		public Node() {

		}
	}

	public static void main(String[] args) {
		MinDoublyLinkedList list = new MinDoublyLinkedList();
		list.add("bob");
		System.out.println(list);
		list.add("harry");
		System.out.println(list);
		list.add("harry");
		list.add("steve");
		list.add("zerom");
		list.add("zerom");
		list.add("binam");
		//list.removeDuplicate();
		//System.out.println("The duplicate elements are:"+list.removeDuplicate());
		list.removeExtra();
		System.out.println("The element is extra:"+list.removeExtra());
//       list.removeMaxz();
//      System.out.println("the element that is max willbe deleted:"+list.removeMaxz());
//		System.out.println(list);
//		list.add("anne");
//		System.out.println(list);

			System.out.println("The min element in the link =:"+list.min());
//			System.out.println(list.removeMax());
//			System.out.println(list);
//			System.out.println(list.removeMax());
//			System.out.println(list);
//			System.out.println(list.removeMax());
//			System.out.println(list);
//			System.out.println(list.removeMax());
//			System.out.println(list);
//			System.out.println(list.removeMax());
//			System.out.println(list);
//

	}
}
