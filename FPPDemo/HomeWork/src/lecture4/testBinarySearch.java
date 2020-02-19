package lecture4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testBinarySearch {

	@Test
	void test() {
		BinarySearch y= new BinarySearch();
		int[]x= {5,3,2,8,9};
		int z= y.binarySearch( x, 8);
		int expe= 3;
		assertEquals(z,expe);
	}

}
