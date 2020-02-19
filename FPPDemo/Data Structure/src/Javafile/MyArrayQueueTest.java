package Javafile;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyArrayQueueTest {

	@Test
	void testisEmpty() throws QueueException {
		MyArrayQueue q = new MyArrayQueue();
		assertTrue(q.isEmpty());
		q.enqueue(8);
		assertFalse(q.isEmpty());
		//q.dequeue();
//		try {
//			q.peek();
//		} catch (QueueException e) {
//		
	}
	
	
//
//	@Test
//	public void testSize() {
//		MyArrayQueue q = new MyArrayQueue ();
//		assertEquals(q.size(), 0);
//		q.enqueue(2);
//		
//		assertEquals(q.size(), 2 );
//	}
//	
//	@Test
//	public void testPeek() throws QueueException {
//		MyArrayQueue q =  new MyArrayQueue();
//		q.enqueue(6);
//		assertEquals(q.peek(), 6);
////		try{
////			q.peek();
////			fail("Peek: The queue is empty but no exception is thrown!");
//		}
//		catch(QueueException e){
//		
//		}	
//		
	//}
	
	@Test
	public void testEnqueue() throws QueueException {
		MyArrayQueue q = new MyArrayQueue();
		q.enqueue(20);
		assertEquals(q.size(), 1);
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		assertEquals(q.size(), 16);
	}
//	
//	@Test
//	public void testDequeue() throws QueueException {
//		MyArrayQueue q = new MyArrayQueue ();
//		try{
//			q.dequeue();
//			fail("Dequeue: The queue is empty but no exception is thrown!");
//		}
//		catch(QueueException e){
//		
//		}	
//		q.enqueue(20);
//		q.enqueue(10);
//		assertEquals(q.dequeue(), 20);
	}

	

