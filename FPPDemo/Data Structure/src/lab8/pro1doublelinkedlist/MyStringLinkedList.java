package lab8.pro1doublelinkedlist;

import java.util.NoSuchElementException;

public class MyStringLinkedList {

	Node header;

	MyStringLinkedList() {
		header = new Node(null, null, null);
	}

	public void addLast(String element) {
		// if header is null
		if (header.next == null) {
			Node n = new Node(header, element, null);// create new node 
			header.next = n;// connect the new node with header
		} else {//  if header is not null
			Node current = header.next;// 
			while (current.next != null) {// the node will go until the value will be null
				current = current.next;//  put the node that does not connect with its nnext or null
			}
			Node last = new Node(current.next, element, null);// create a new node
			current.next = last;// connect the new node with the last and the new node will be last 
		}
	}

	public void addFirst(String element) {
		if (header.next == null) {
			Node n = new Node(header, element, null);
			header.next = n;
		}
		Node curr = header.next;
		Node n = new Node(header, element, header.next);

		header.next = n;
		n.next =curr;

	}
 public String DeleteFirst(int pos) {
	 if(isEmpty()) {
		 throw new IllegalArgumentException();
	 }
	 if(size()<3) {
		 throw new IllegalArgumentException();
	 }else {
	 Node first=header;
      Node sec= first.next;
	 Node third= sec.next;
      if(first.next.next==null) {
		first= first.next.next;	
	}
      first.next.next.previous= third.next;
	 return first.next.next.value ;
 }
 }
	public String get(int index) {//I have Question on this only respond same element 
		String val="";
		if(index<0||index>size()-1) {
			return null;
		}if(index==0) {
			return header.next.value;
		}else {
			Node first= header.next;
			int count=0;
			for(Node i=first.next;i!=null;i=i.next) {
				count++;
				
				if(count==index){
					val=first.next.value;
					}
				}
		}
	return val;
	}

	public void add(int index, String element) {// revise a little bit;
		if (index == 0) {
			addFirst(element);
		} else if (index == size() - 1) {
			addLast(element);
		} else {
			Node current= header.next;
			int count = 0;
			while (current != null) {
				count++;
				if (count == index) {
					Node n = new Node(current.previous, element, current.next);
					current.next = n;
					n.previous = current;

				}
				current = current.next;
			}
		}
	}

	public boolean isEmpty() {
		if (header.next == null) {
			return true;
		}
		return false;

	}

	public String findFirst() {
		if (isEmpty()) {
			throw new NullPointerException("There is no node ");
		} else if (header.next.value != null) {
			return header.next.value;
		}
		return header.next.value;
	}

	public String findLast() {
		if (isEmpty()) {
			throw new NullPointerException("There is no node at all ");
		}
		if (header.next.next.value == null) {
			return header.next.next.value;
		}else {
		Node current = header.next;
		while (current.next != null) {
			current = current.next;
		}
		return current.next.value;
	}
	}
	public boolean find(String s) {// I must revise;
		if (isEmpty()) {
			throw new NullPointerException("There is no node at all ");
		}
		if (header.next.value.equals(s)) {
			return true;
		} else {
			Node curr = header.next;
			while (curr.next != null) {
				if (curr.value.equals(s)) {
					return true;
				}
			}
			return false;
		}
	}

	public int findIndex(String s) { // the index of the String s, if found
		Node next = header;
		if (isEmpty()) {
			return -1;
		}
		int index = 0;
		while (next.next != null) {
			index++;
			if (next.next.value.equalsIgnoreCase(s)) {
				return index;
			}
			next = next.next;
		}
		return -1;
	}

	public String removeFirst() {
		if (isEmpty()) {
			throw new NullPointerException("There is no node at all ");
		} else {
			if (header.next != null) {
				header.next.value = null;
			}
			
		}
		header.next = null;
		return header.next.value = null;
	}

	// REmove the lastNode
	public void removeLast() {
		if (isEmpty()) {
			throw new NullPointerException("There is no node at all ");
		}
		if (header.next != null && header.next.next == null) {
			header.next = null;
			header.next.value = null;
		} else {
			Node current = header.next;
			while (current.next != null) {
				current = current.next;
			}
			current.previous.next = null;
			current.previous.next.value = null;
		}
	}

	/** size = the number of non-null nodes */
	int size() {
		int count = 0;
		if (header.next == null) {
			return 0;
		} else {
			Node current = header.next;
			while (current != null) {
				count++;
				current = current.next;
			}
			return count;
		}

	}

	public boolean remove(int index) { // the index of the element to be removed
		if (isEmpty()) {
			throw new NullPointerException("There is no node at all ");
		}
		Node current = header;
		int count = 0;
		if (index == 0) {
			removeFirst();
			return true;
		} else if (index == size() - 1) {
			removeLast();
			return true;
		} else {
			while (current.next != null) {
				count++;
				if (count == index) {
					Node pre = current.previous;
					Node next = current.next;
					pre.next = next;// connect the two link
					next.previous = pre;
					return true;
				}
				current = current.next;
			}
			return false;
		}

	}
	public String RemoveMax() {
		Node curr=header.next;
		String maxval= curr.value;
		for(Node i= curr.next;i!=null;i=i.next) {
			if(maxval.compareTo(i.value)<0) {
				curr=i;
				maxval=i.value;
			}
		}
		Node pre= curr;
		Node next= curr.next;
		pre.next=next;
		if(next!=null) {
			next.previous= pre;
		}
		return maxval;
	}

	public boolean remove(String element) {// element to be removed from this list, if present}
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		int pos = findIndex(element);
		if (pos == -1)
			return false;
		return remove(pos);

	}
//public String removeduplicate() {
//	  if (header.next==null) {
//		  return null;
//	  }
//	  Node curr= header.next;
//	  Node sec= curr.next;
//	  String z= sec.next.value;
//	  for(Node i= sec;i!=null;i=i.next) {
//		  for(Node j=sec.next;i!=null;i=i.next) {
//			  if(i.value.equals(j.value)) {
//				  j.value=null;
//			  }
//		  }
//		  curr.next= sec;
//		  
	 // }
		  
	  
//	  while(curr!=null) {
//		  if(curr.value.equals(curr.next)) {
//			  curr.value=null;
//		  }
//	  }
//}
	// Ex: 3
	public String findMin() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}

		Node first = header.next;
		String min = first.value;
		for (Node i = first.next; i != null; i = i.next) {
			if (min.compareTo(i.value) > 0) {
				min = i.value;
			}
		}
		return min;
	}

	public String findMax() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		Node first = header.next;
		String max = header.next.value;
		for (Node i = first.next; i != null; i = i.next) {
			if (max.compareTo(i.value) < 1) {
				max = i.value;
              
			}
		}
		
		return max;
	}

	public void swap(Node n1, Node n2) {
		String temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;
	}

	public Node findMinNode(Node next) {
		String min = next.value;
		Node minNode = next;
		for (Node i = next.next; i != null; i = i.next) {
			if (min.compareTo(i.value) > 0) {
				min = i.value;
				minNode = i;
			}
			next = next.next;
		}
		return minNode;
	}
	

	public void sort() {
		for (Node i = header.next; i != null; i = i.next) {
			Node temp = findMinNode(i);
			swap(i, temp);
		}

	}

	// Ex: 4
//		public String recurMax();
//           
//}

	public int CountElement(String s) {
		int count = 0;
		if (s == null) {
         return -1;
		}
     Node current = header;
		int i = -1;
		while (current.next != null) {
			++i;
			current = current.next;
			if (s.equals(current.value)) {
				count++;
			}
              }
		return count;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node curr = header.next;
		while (curr != null) {
			sb.append(curr.value + "-> ");
			curr = curr.next;
		}
		return sb.toString();
	}

	public Node findMins(Node next) {
		String min = next.value;
		Node minNode = next;
		for (Node i = next.next; i != null; i = i.next) {
			if (min.compareTo(i.value) > 0) {
				min = i.value;
				minNode = i;
			}
			next = next.next;
		}
		return minNode;
	}

	class Node {
		Node previous;
		String value;
		Node next;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();
		list.addLast("Bob");
		list.addLast("Bob");
		list.addLast("Steve");
		list.addLast("BOb");
		list.addLast("Winta");
		list.addLast("Kiros");
//		// System.out.println(list);
//		list.addFirst(("Steve"));
//		list.addFirst(("Mike"));
//		list.addFirst(("Robiel"));
//		list.addFirst(("Yafiet"));
//		list.addFirst(("Jirom"));
		list.addFirst(("tom"));
		list.addFirst(("bill"));
		list.addFirst(("bob"));
		System.out.println(list);
		System.out.println(list.RemoveMax());
		//list.DeleteFirst(1);
       // list.findLast();
       // System.out.println(list.findLast());
		//list.sort();
		//System.out.println("The sorted is:"+ list.sort());
       
		// list.findFirst();
		// list.add(2, "jerry");
       // System.out.println(list.find("Daniel"));
		 //list.find("Daniel");
		//list.findMin();
		// list.findMax();
		//System.out.println(list.get(2));
		//System.out.println(list.get(4));
		//System.out.println(list.get(5));
		//System.out.println(list);
		// System.out.println(list.size() + ": " + list);
		// list.removeFirst("Jirom");
		// System.out.println(list);
	}

//	private String size() {
//		// TODO Auto-generated method stub
//		return null;
}
