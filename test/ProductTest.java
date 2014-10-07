import static org.junit.Assert.*;

import org.junit.Test;


public class ProductTest {

	@Test
	public void testSimpleProduct() {
		Variable x = new Variable("x", 2.5);
		Variable y = new Variable("y", 4);
		Formula formula = new Product(x, y);
		assertEquals("(x*y)", formula.asString());
		assertTrue(formula.asValue() == 10);
	}

}
