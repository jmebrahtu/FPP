package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTestcase {

	@Test
	void test() {
		StringFunction ob = new StringFunction();
		String op = ob.StringJoin("Java", "program");
		String aop = ("Javaprogram");

		assertEquals(op, aop);
	}

}
