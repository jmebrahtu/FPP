package March2017.doublelinkedlist;

public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node();
		}
		//adds to the end of the list
		public void addLast(String item){
			   if(header==null) {
				   Node n=new Node(null,null,null);
					   header=n;
			   }
			if(header.next==null) {
		   Node n= new Node(header.next,item,null);
		   header.next=n;// connect
			}else {
				Node current= header;
				while(current.next!=null){
					current= current.next;
				}
				Node last= new Node (current,item,null);
				
				current.next= last;
			}
				
			//implement
			
		}
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();
			
		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}
		
		class Node {
			String value;
			Node next;
			Node previous;
			Node(){
				
			}
			Node(Node previous,String value,Node next){
				this.previous= previous;
				this.value= value;
				this.next= next;
				
			}
			
			public String toString() {
				return value == null ? "null" : value;
			}
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			list.addLast("Jirom");
			list.addLast("Steve");
			list.addLast("Robiel");
			list.addLast("Selam");
			
			System.out.println(list);
		}
}
