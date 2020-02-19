//package lab8.pro3Mindoublelinked;
//
//import java.util.NoSuchElementException;
//
//public class MinDoublyLinkedList {
//
//	Node header;
//
//	public MinDoublyLinkedList() {
//		header = new Node();
//	}
//
//	public void add(String item) {
//		// implement
//		Node firstNode = header.next;
//		if (firstNode == null) {
//			header.next = new Node(item, null, header);
//			return;
//		}
//		if (firstNode.value.compareTo(item) < 0) {
//			Node secondNode = firstNode.next;
//			Node newNode = new Node(item, secondNode, firstNode);
//			firstNode.next = newNode;
//			if (secondNode != null) {
//				secondNode.previous = newNode;
//			}
//		} else {
//			Node newNode = new Node(item, firstNode, header);
//			header.next = newNode;
//			firstNode.previous = newNode;
//		}
//	}
//
//	// returns the minimum element in the linkedlist
//	public String min() {
//		if (isEmpty()) {
//			throw new NoSuchElementException();
//		}
//		Node first = header.next;
//		String min = first.value;
//		for (Node i = first.next; i != null; i = i.next)
//			if (min.compareTo(first.value) > 0) {
//				min = first.value;
//			}
//		System.out.println(min);
//		return min;
//	}
//
//	private boolean isEmpty() {
//		if (header.next == null) {
//			return true;
//		}
//		return false;
//	}
//
//	// finds the maximum element in the linkedlist and removes it.
////
////	public String removeMax() {
////		
////		if (header == null || header.next == null) {
////			return null;
////		}
////		Node temp = header;
////		Node current;
////		Node previous;
////		while (temp.next != null) {
////			previous = temp.next;
////			if (previous.next != null) {
////				current = previous.next;
////				if (current.value.equals(previous.value)) {
////					// remove Duplicates
////					if (current.next != null) {
////						current.previous.next = current.next;
////						current.next.previous = current.previous;
////						current = null;
////					} else {
////						previous.next = null;
////						current = null;
////					}
////
////				}
////			}
////			
////		}
////		//return temp = temp.next;
////		//return  temp.next.value;
////	}
//
//	@Override
//	public String toString() {
//
//		StringBuilder sb = new StringBuilder();
//		toString(sb, header);
//		return sb.toString();
//
//	}
//
//	private void toString(StringBuilder sb, Node n) {
//		if (n == null)
//			return;
//		if (n.value != null)
//			sb.append(" " + n.value);
//		toString(sb, n.next);
//	}
//
//	class Node {
//		String value;
//		Node next;
//		Node previous;
//
//		public String toString() {
//			return value == null ? "null" : value;
//		}
//
//		public Node(String value, Node next, Node previous) {
//			this.value = value;
//			this.next = next;
//			this.previous = previous;
//		}
//
//		public Node() {
//
//		}
//	}
//
//	public static void main(String[] args) {
//		MinDoublyLinkedList list = new MinDoublyLinkedList();
//		list.add("bob");
//		System.out.println(list);
//		 list.add("harry");
//		 list.add("harry");
//		 list.add("harry");
//		 list.add("harry");
//		System.out.println(list);
//		list.add("steve");
//		System.out.println(list);
//		 list.add("anne");
//		 System.out.println(list);
//
//		System.out.println(list.min());
//		System.out.println(list.removeMax());
//		System.out.println(list);
//		System.out.println(list.removeMax());
//		System.out.println(list);
//		System.out.println(list.removeMax());
//		System.out.println(list);
//		System.out.println(list.removeMax());
//		System.out.println(list);
//		System.out.println(list.removeMax());
//		System.out.println(list);
//
//	}
//}
