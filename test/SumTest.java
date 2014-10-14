import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

	@Test
	public void testSimpleSum() {
		Variable x = new Variable("x", 2.5);
		Variable y = new Variable("y", 4);
		Formula formula = new Sum(x, y);
		assertEquals("(x+y)", formula.asString());
		assertTrue(formula.asValue() == 6.5);
	}

	@Test
	public void testCumulativeSum() {
		Variable x = new Variable("x", 2);
		Variable y = new Variable("y", 4);
		Variable z = new Variable("z", 10);
		Formula formula = new Sum(x, y, z);
		assertEquals("(x+y+z)", formula.asString());
		assertTrue(formula.asValue() == 16);
	}
}
