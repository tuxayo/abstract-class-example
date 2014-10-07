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
}
