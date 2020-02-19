package Javafile;

public class MyArrayQueue {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	
	public boolean isEmpty() {
		return rear==0;
	}

	public int size() {
		if(isEmpty()) {
			return 0; 
		}
		return rear - front;
	}

	public void enqueue(int a) {
		if (front == -1) {
			front++;
		}
		if (rear == arr.length) {
			resize();
			
		}
		 arr[rear]=a;
		rear++;

	}

	private void resize() {
		int[] temp = new int[arr.length * 2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;

	}

	public int dequeue() throws QueueException {
		if (isEmpty()) {
			throw new QueueException();
		}
		int x = arr[front];
		front++;
		return x;

	}

	public int peek() throws QueueException {
		if (isEmpty()) {
			throw new QueueException();
		}
		return arr[front];
	}
  
	public static void main(String[] a) throws QueueException {

		MyArrayQueue q = new MyArrayQueue();
		// q.peek();
		for (int i = 0; i < 15; i++)
			q.enqueue(i);

		for (int i = 0; i < 14; i++)
			q.dequeue();
		System.out.println(q.size());
	}
}