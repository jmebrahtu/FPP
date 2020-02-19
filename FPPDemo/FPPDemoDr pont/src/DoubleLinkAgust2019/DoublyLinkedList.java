package DoubleLinkAgust2019;


public class DoublyLinkedList {

	Node header;

	public DoublyLinkedList() {
		header = new Node(null, null, null);
	}
////// how you add elements in sorted way from march 2018 Std
//	public void add(String item) {
//		// implement
//		Node current = header;
//		Node n = new Node();// have like that constractor ->(value.next,previous);
//		n.value = item;
//
//		String nextNodeValue = "";
//		if (current.next != null) {
//			nextNodeValue = current.next.value;
//
//			if (item.compareTo(nextNodeValue) < 1) {
//				n.previous = current;
//				n.next = current.next;
//					current.next.previous = n;
//				current.next = n;
//			} else {
//				current = current.next;
//				n.previous = current;
//				n.next = current.next;
//				if (current.next != null)
//					current.next.previous = n;
//				current.next = n;
//			}
//		} else {
//			n.previous = current;
//			n.next = current.next; //current.next is null & n.next is null also
//			current.next = n;
//		}

	//}
	//add to the end of the linkedlist
	public void add(String item) {

		Node previous = header;
		Node current = header.next;
		while (current != null) {
			previous = current;
			current = current.next;
		}
		Node newNode = new Node(null, previous, item);
		previous.next = newNode;

	}

	public void removeExtra(){

		//IMPLEMENT
		if (header==null || header.next==null) return;
		
		Node temp=header;
		Node current;
		Node previous;
		while(temp.next!=null) {
			previous=temp.next;
			if (previous.next!=null) {
				current=previous.next;
				if (current.value.equals(previous.value)) {
					//remove Duplicates
					if (current.next!=null) {
						current.previous.next=current.next;
						current.next.previous=current.previous;
						current=null;
					}else
					{
						previous.next=null;
						current=null;
					}
					
				}
			}
			temp=temp.next;
		}
		
	}



	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		if(sb.toString().length() >=2)
			return sb.toString().substring(1);
		else return null;

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

		Node(Node next, Node previous, String value) {
			this.next = next;
			this.previous = previous;
			this.value = value;
		}

		public String toString() {
			return value == null ? "null" : value;
		}
	}
	
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add("Bob"); list.add("Tom"); list.add("Steve");
		System.out.println(list);
		
		test1();
		test2();
		test3();

	}
	
	//expected output:  Bob Tom Steve Harold
	public static void test1() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add("Bob"); list.add("Tom"); list.add("Steve"); list.add("Steve"); list.add("Harold");
		list.removeExtra();
		System.out.println(list);
	}
	//expected output:  Bob Tom Steve Harold Steve Harold
	public static void test2() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add("Bob"); list.add("Tom"); list.add("Steve"); list.add("Harold");list.add("Steve"); list.add("Harold");
		list.removeExtra();
		System.out.println(list);
	}
	
	// expected output: Bob Tom Steve Harold Steve
	public static void test3() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add("Bob");
		list.add("Tom");
		list.add("Steve");
		list.add("Harold");
		list.add("Steve");
		list.add("Steve");
		list.removeExtra();
		System.out.println(list);
	}

}
