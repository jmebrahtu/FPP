package lab9.pro1stackandQueue;

import java.util.EmptyStackException;

/**
 * For this problem, you will implement a stack of String, using an array in the
 * background.
 *
 */
public class ArraySTack {

	private final int INITIAL_LENGTH = 10;
	private int top;
	private String[] stackArray;

	public ArraySTack() {
		stackArray = new String[10];
		this.top = 0;//first i must intisialized it
		// implement
	}

	/** Pushes input onto the stack */
	public void push(String s) {
		if (s == null) {
		}
		stackArray[top] = s;
		top++;
		// implement

	}

	/** Pops the input from the stack */
	public String pop() { // throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			String k = stackArray[top - 1];
			top--;
		}
		return stackArray[top];
	}

	/** Returns (but does not remove) the value at the top of the stack */
	public String peek() { // throws EmptyStackException {
		// implement
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		return stackArray[top - 1];

	}

	/**
	 * Returns a string representation of this stack. The string consists of all
	 * data values of the nodes in the stack, separated by spaces.
	 */
	@Override
	public String toString() {
		StringBuilder sc = new StringBuilder("[");
		for (int i = 0; i < top; i++) {
			if (i == top - 1) {
				sc.append(stackArray[i] + "]");
			} else {
				sc.append(stackArray[i] + ",");
			}
		}
		return sc.toString();

	}

	/** Returns the number of elements in the stack */
	public int size() {
		if (isEmpty()) {
			return 0;
		} else {
			return top;
		}

	}

	/** Returns true if there are no elements in the stack, false otherwise */
	public boolean isEmpty() {
		if (top == 0) {
			return true;
		}

		return false;
	}

	/**
	 * It determines whether an String exists in the stack. If the element is found,
	 * it returns the 1-based position of the element from the top of the stack.
	 * Else, it returns -1.
	 * 
	 */
	public int search(String o) {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		int index = -1;
		for (int i = 0; i <= size(); i++) {
			if (stackArray[i].equals(o)) {
				index = i;

			}
		}
		// implement

		return index;
	}

	private int lastIndexOf(String o) {
		// implement
		int pos = -1;
		for (int i = 0; i < top; i++) {
			if (stackArray[i].equals(o)) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	/* You may use this method to test your stack */
	public static void main(String[] args) {
		try {
			ArraySTack ns = new ArraySTack();
			ns.push("Bob");
			System.out.println(ns.size() + " " + ns);
			ns.push("Harry");
			System.out.println(ns.size() + " " + ns);
			ns.push("Steve");
			System.out.println(ns.size() + " " + ns);
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println(ns.size() + " " + ns);
			ns.push("Bill");
			System.out.println(ns.size() + " " + ns);
			System.out.println("Search() Operation : " + ns.search("Bob"));

			System.out.println("Peek Operation : " + ns.peek());
			System.out.println(ns.size());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Empty stack : " + ns.isEmpty());

			System.out.println("Pop Operation : " + ns.pop());
			System.out.println("Empty stack : " + ns.isEmpty());

		} catch (Exception e) {
			System.out.println("Exception thrown of type " + e.getClass().getSimpleName());
		}

	}
}