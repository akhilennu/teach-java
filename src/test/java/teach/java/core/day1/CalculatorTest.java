package teach.java.core.day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		CompleteMe obj = new CompleteMe();
		assertEquals(5, obj.add(3, 2));
		assertEquals(8, obj.add(4, 4));
	}
	
	@Test
	void testMul() {
		CompleteMe obj = new CompleteMe();
		assertEquals(6, obj.mul(3, 2));
		assertEquals(16, obj.mul(4, 4));
	}
	
	@Test
	void testSub() {
		CompleteMe obj = new CompleteMe();
		assertEquals(1, obj.substract(3, 2));
		assertEquals(0, obj.substract(4, 4));
		assertEquals(-1, obj.substract(3, 4));
	}

}
