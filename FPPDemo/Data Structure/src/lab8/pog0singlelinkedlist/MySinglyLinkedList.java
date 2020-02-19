package lab8.pog0singlelinkedlist;

import java.nio.file.NoSuchFileException;

public class MySinglyLinkedList {
	Node header = null; // contains no data, cannot be removed

	public MySinglyLinkedList() {
		// header should never be null
		header = new Node();
	}

	boolean search(String s) {// can we say throw in this if it is empty
		if (s == null) {
			return false;
		}
		if (isEmpty()) {
			return false;
		} else {
			Node current = header;
			while (current.next != null) {
				current = current.next;
				if (current.data.equals(s)) {
					return true;
				}
			}
			return false;
		}

	}

	void printNodes() {
		System.out.println(header.next.toString());
		// System.out.println();
	}

	void addFirst(String s) {
		if (header.next == null) {
			Node newNode = new Node();
			newNode.data = s;
			header.next = newNode;
		} else {

			Node current = header.next;
			Node newNode = new Node();
			newNode.data = s;
			newNode.next = current;// NB focus on that trict the first one goes the second ....
			header.next = newNode;
		}
	}

	void addLast(String s) {
		if (header.next == null) {
			Node n = new Node(s, header.next);
			header.next = n;
			header.next.data = s;
		}
		Node current = header;
		while (current.next != null) {
			current = current.next;
		}
		Node last = new Node(s, current.next);
		current.next = last;// connect or update the link
		current.next.data = s;

	}

	void insert(String s, int pos) {

		if (pos == 0) {
			addFirst(s);
		}
		if (pos == size()) {
			addLast(s);
		} else {
			int count = 0;
			Node current = header;
			for (Node i = current.next; i != null; i = i.next) {
				count++;
				if (count == pos) {// by count the index i can only know at which pos while be insert;
					Node n = new Node();
					n.data = s;
					n.next = current.next;// connect
					current.next = n;

					break;
				}
				current = current.next;
			}

		}
	}

//	
//		Node current = header;
//		int count = 0;
//
//		if(pos==0) {
//			addFirst(s);
//			}else
//				if(pos==size()) {
//					addLast(s);
//			} else {
//		while (current.next != null) {
//			count++;
//			if (count == pos) {
//				Node n = new Node();
//				n.data = s;
//				n.next = current.next;
//				current.next = n;
//				break;
//			}
//		current = current.next;		}	}
//
//}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node current = header;
		while (current.next != null) {
			current = current.next;
			sb.append(current.toString() + "->");

		}
		return sb.toString();
	}

	/** size = the number of non-null nodes */
	int size() {
		int count = 0;
		if (header.next == null) {
			return 0;
		} else {
			Node current = header.next;
			while (current != null) {
				current = current.next;
				count++;

			}
			return count;
		}

	}

	void remove(String s) {// NB take cre of this question
		if (isEmpty()) {
			return;
		}
		Node current = header.next;
		if (current != null) {
			if (current.data.equals(s)) {
				current = null;
				current.data = null;

			}
			Node pre = current;
			Node next = current.next;
			while (next != null) {
				if (s.equals(next.data)) {
					next.data = null;
					pre.next = next.next;

				}
				pre = next;
				next = next.next;
			}
		}

	}

	private boolean isEmpty() {
		if (header == null) {
			return true;
		}
		return false;
	}

	/** Implement as inner class */
	private class Node {
		String data;
		Node next;

		Node() {

		}

		Node(String data, Node next) {
			this.data = data;
			this.next = next;
		}

		public String toString() {

			return data;
		}

	}

	public static void main(String[] args) {

		MySinglyLinkedList listLast = new MySinglyLinkedList();
		// listLast.addLast("Bob");
		listLast.addLast("Harry");
		listLast.addLast("Steve");
		listLast.addLast("Duke");
		listLast.addLast("Kiros");
		listLast.addLast("Bizen");
		listLast.addLast("Haylab");
		listLast.addLast("tesfay");
		System.out.println(listLast.size() + ": " + listLast);

		MySinglyLinkedList listFirst = new MySinglyLinkedList();
		listFirst.addFirst("Bob");
		listFirst.addFirst("Harry");
		listFirst.addFirst("Steve");
		listFirst.addFirst("Duke");
		listFirst.addFirst("Jonni");
		listFirst.addFirst("TSega");
		listFirst.addFirst("Menges");
		System.out.println("The size of listfirst=" + listFirst.size());
		System.out.println(listFirst.size() + ": " + listFirst);
		System.out.println("IS Merry occur:+" + listFirst.search("Merry"));

		listFirst.remove("Bob");
		listFirst.insert("John", 5);
		System.out.println(listFirst.size() + ": " + listFirst);

	}
}
