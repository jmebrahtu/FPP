package Lab3.pro4Arraylist;

import java.util.Arrays;
import java.util.Iterator;

public class MyStringList implements Iterable<String> {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

// how can i add elements in array ;
	public void add(String s) {
		if (size == strArray.length)
			resize();
		strArray[size++] = s;
	}

//how can i know the element of the given index;
	public String get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return strArray[i];
	}

//how can i know is the element is exist in the Array or not;
	public boolean find(String s) {
		for (String test : strArray) {
			if (test.equals(s))
				return true;
		}
		return false;
	}
 
	// how can i insert an element in given index or position;
	public void insert(String s, int pos) {
		if (pos > size)
			return;
		if (pos >= strArray.length || size + 1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length + 1];
		System.arraycopy(strArray, 0, temp, 0, pos);
		temp[pos] = s;

		System.arraycopy(strArray, pos, temp, pos + 1, strArray.length - pos);
		strArray = temp;
		++size;
	}

//	public void insert(String s, int pos) {
//		if (pos > size)
//			return;// which means the pos is greater than size it jumps  to the next space 
//		if (pos >= strArray.length || size + 1 > strArray.length) {
//			resize();
//		}
//		String[] temp = new String[strArray.length + 1];
//		for (int i = 0; i < pos; i++)
//			temp[i] = strArray[i];
//		temp[pos] = s;
//		for (int i = pos + 1; i < strArray.length; i++)
//			temp[i] = strArray[i - 1];
//		strArray = temp;
//		++size;
//	}
// How can I remove the element from the array if it occur;
	public boolean remove(String s) {
		if (size == 0)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (strArray[i].equals(s)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray, 0, temp, 0, index);
		System.arraycopy(strArray, index + 1, temp, index, strArray.length - (index + 1));
		strArray = temp;
		--size;
		return true;
	}

// How can i resize the array
	private void resize() {
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2 * len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray, 0, temp, 0, len);
		strArray = temp;
	}
	/*
	 * public String toString() { return Arrays.toString(strArray);// }
	 */// this is the same with the below Question only different this print the all
		// length but
		// the second print only the elements (size);

	// How can I print the elements in the array in the form of elemnt
	public String toString() {

		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(strArray[i] + ", ");
		}
		sb.append(strArray[size - 1] + "]");
		return sb.toString();

	}

	public int size() {
		if(strArray==null) {
			return 0;
		}
		int count=0;
		for(String x:strArray) {
			if(x!=null) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		// copy test code and run it
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		Iterator iterator=l.iterator();
		// for each style
		for (String str : l) {
		System.out.println(str.toString());
		}
		// using java 8 forEach method with MyStringList
		l.forEach(name -> System.out.println(name));
		
		}

	

	public Iterator iterator() {
		return new MyIterator();
	}

	private class MyIterator implements Iterator {
		private int position;

		MyIterator() {
			position = 0;
		}

		public boolean hasNext() {
			return (position < size);
		}

		public Object next() throws IndexOutOfBoundsException {
			if (!hasNext())
				throw new IndexOutOfBoundsException();
			return strArray[position++];
		}

		public void reset() {
			position = 0;
		}
	     
	}

	}


// The for eachloop ,the iterator methods, forloop ,does not work in this String list
//unless the itarable interface are implements
