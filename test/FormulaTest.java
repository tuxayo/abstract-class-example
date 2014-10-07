import static org.junit.Assert.*;

import org.junit.Test;

public class FormulaTest {

	@Test
	public void testFormula() {
		Variable x = new Variable("x", 2.5);
		Variable y = new Variable("y", 4);
		Formula formula = new Sum(x, new Product(y, new Sum(x, y)));
		assertEquals("(x+(y*(x+y)))", formula.asString());
		assertEquals(28.5, formula.asValue(), 0.001);

		x.set(5);
		assertEquals(41.0, formula.asValue(), 0.001);
	}
}
