package lab9.pro1stackandQueue;

import java.util.EmptyStackException;

public class NodeStack1 {
	
		private Node top;

		/** Pushes input onto the stack */
		public void push(String ob) {
			Node first= new Node(ob,top);
			first.data=ob;
			top = first;
                }
//			And for push, you will create a new Node and set it as the new topNode.

	

		/** Pops the input from the stack */
		public String pop()  { // throws EmptyStackException {
			if(isEmpty()) {
			throw new EmptyStackException();
			}
			Node first= top;
			  String p= first.data;
			  first= first.next;

			//		To implement pop, you must replace topNode with the next Node in the stack,
//			and return the value contained in the original topNode.
            
            
             
			return p;
		}

		/** Returns (but does not remove) the value at the top of the stack */
		public String peek() { // throws EmptyStackException {
			if(isEmpty()) {
				throw new EmptyStackException();
			}
		   Node first= top;
//			For peek, you must return the value stored in topNode, but you will not remove it.
			return first.data;
		}

		/** Returns a string representation of this stack. The string
		 *  consists of all data values of the nodes in the stack, separated by spaces.
		 */
		@Override
		public String toString() {//Note that
			//implement
			String result= "";
			if(top == null) return "[]";

			for (Node x = top; x != null; x = x.next)
			    result += x.data + " ,";

			return result;
		}

		/** Returns the number of elements in the stack */
		public int size() {
			//implement
			int size = 0;
			for (Node x = top; x != null; x = x.next){
				size++;
			}
			return size;
		}

		/** Returns true if there are no elements in the stack, false otherwise */
		public boolean isEmpty() {
			//implement
			return top == null;
		}

		private class Node {
			private String data;
			private Node next;

			Node(String data, Node next) {
				   this.data = data;
				   this.next = next;
			}

		}

		/* You may use this method to test your stack */
		public static void main(String[] args) {
			try {
				NodeStack1 ns = new NodeStack1();
				ns.push("Bob");
				System.out.println(ns.size() +": "+ ns);
				ns.push("Harry");
				System.out.println(ns.size() +": "+ ns);
				ns.push("Steve");
				System.out.println(ns.size() +": "+ ns);

				ns.pop();
				System.out.println(ns.size() +": "+ ns);

				ns.push("Bill");
				System.out.println(ns.size() +": "+ ns);

				System.out.println("peeking..." + ns.peek());
				System.out.println(ns.size());
				System.out.println(ns.pop());
				System.out.println(ns.pop());
				System.out.println(ns.pop());
				System.out.println("isEmpty..." + ns.isEmpty());
				ns.pop();
			} catch(Exception e) {
				System.out.println("Exception thrown of type " + e.getClass().getSimpleName());
			}

		}
	}

