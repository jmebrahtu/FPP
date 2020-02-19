package June2017.pro1;



public class DoublyLinkedDeleteFirst {

	Node header;

	public DoublyLinkedDeleteFirst() {
		header = new Node();
	}

	// removes the node at position 1 and returns
	// the string contained in that node
	public String deleteFirst() {
		if (isEmpty()) {
			throw new IllegalStateException();
		}else {
			Node zero=header.next;
			String ret = zero.next.value;
			Node first= zero.next;
			Node sec= first.next;
			
			sec.previous=zero;
			zero.next=sec;
			
			return ret;
		}
		}
		
     public int size() {
    	 int count=0;
    	 if(header.next==null) {
    		 return 0;
    	 }else {
    	Node current= header;
    	while(current.next!=null) {
    		current= current.next;
    		count++;
    	}
    	current= current.next;
    	 }
    	 return count;
     }
	

	public boolean isEmpty() {
		if (header.next == null) {
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

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedDeleteFirst list = new DoublyLinkedDeleteFirst();
		//list.addLast("Bob");
		//list.addLast("Harry");
		//list.addLast("Steve");
		//String deleted = list.deleteFirst();
		//System.out.println("This item was deleted: " + deleted);
		System.out.println("The size is:"+list.size());
		System.out.println(list);

	}
}
