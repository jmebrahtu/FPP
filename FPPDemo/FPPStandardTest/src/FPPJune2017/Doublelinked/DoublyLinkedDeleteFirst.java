package FPPJune2017.Doublelinked;



public class DoublyLinkedDeleteFirst {
	
	Node header;

	public DoublyLinkedDeleteFirst() {
		header = new Node();
	}
	
	//removes the node at position 1 and returns
	//the string contained in that node
	public String deleteFirst() throws Exception {
		if( isEmpty()) {
			throw new Exception();
		}
			Node zero=header.next;
			String t= zero.next.value;
			 Node first= zero.next;
			Node sec= first.next;
			sec.previous=zero;
			zero.next=sec;
			//first.previous=first.next;
			return t;
		}
		
		
	
	
	public boolean isEmpty() {
		if( header.next==null) {
			return true;
		}
		return false;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node next = header;
		while (next.next != null) {
			next = next.next;
		}
		Node n = new Node();
		n.value = item;
		next.next = n;
		n.previous = next;

	}
	
	

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

		Node(){
			
		}
		Node(Node previous,String value,Node next){
			 previous.previous= previous;
			this.value= value;
		this.next=next;
		}
		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) throws Exception {
		DoublyLinkedDeleteFirst list = new DoublyLinkedDeleteFirst();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		String deleted = list.deleteFirst();
		System.out.println("This item was deleted: " + deleted);
		System.out.println(list);

	}
}
