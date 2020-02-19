package July2017;

public class SinglyLinked {

	private Node startNode = new Node();

	public boolean isEmpty() {
		return (startNode.value == null);
	}

	public void insertLast(String s) {
		if (isEmpty()) {
			startNode.value = s;
		} else {

			Node last = startNode;
			while (last.next != null) {
				last = last.next;
			}
			Node x = new Node(s, null);
			last.next = x;// update the link

		}

		// implement
	}

	public void removeLast() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("the is no nonode");
		}
		if (startNode.next == null) {
			startNode.value = null;
		} else {
			Node pre = null;
			Node current = startNode;
			while (current.next != null) {
				pre = current;
				current = current.next;
			}

			pre.next = null;
		}
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, startNode);
		String result = sb.toString();
		if (result.length() > 0) {
			result = result.substring(1);
		}
		return "[" + result + "]";

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	private static class Node {
		String value;
		Node next;

		Node() {

		}

		Node(String value, Node next) {

			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		testRemoveFromEmpty();
		testRemoveFromOneElement();
		testRemoveFromTwoElements();
		testLinksAfterRemove();
		testStartNodeNeverNull();

	}

	private static void testRemoveFromEmpty() {
		SinglyLinked list = new SinglyLinked();
		Exception e = null;
		try {
			list.removeLast();
		} catch (IndexOutOfBoundsException ex) {
			e = ex;
		} catch (Throwable t) {
			System.out.println("Test failed");
		}
		// Expected output: true
		System.out.println("Expecting true...." + (e != null));
	}

	private static void testRemoveFromOneElement() {
		SinglyLinked list = new SinglyLinked();
		list.startNode.value = "Tom";
		list.removeLast();
		// Expected output: []
		System.out.println("Expecting []..." + list);
	}

	private static void testRemoveFromTwoElements() {
		SinglyLinked list = new SinglyLinked();
		list.startNode.value = "Tom";
		list.startNode.next = new Node();
		list.startNode.next.value = "Bill";
		list.removeLast();
		// Expected output: [Tom]
		System.out.println("Expecting [Tom]... " + list);

	}

	private static void testLinksAfterRemove() {
		SinglyLinked list = new SinglyLinked();
		list.startNode.value = "Tom";
		list.startNode.next = new Node();
		list.startNode.next.value = "Bill";
		list.startNode.next.next = new Node();
		list.startNode.next.next.value = "Rich";
		list.removeLast();
		// next node for Bill should be null
		Node billNode = list.startNode.next;
		// expected output: true
		System.out.println("Expecting true ... " + (billNode.next == null));
	}

	private static void testStartNodeNeverNull() {
		SinglyLinked list = new SinglyLinked();
		list.startNode.value = "Tom";
		list.removeLast();
		// startNode should not be null
		// expected: true
		System.out.println("Expecting true ..." + (list.startNode != null));
	}

}
