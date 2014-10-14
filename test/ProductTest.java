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
	
	@Test
	public void testProduct() throws Exception {
		Variable x = new Variable("x", 2);
		Variable y = new Variable("y", 4);
		Variable z = new Variable("z", 10);
		Formula formula = new Product(x, y, z);
		assertEquals("(x*y*z)", formula.asString());
		assertTrue(formula.asValue() == 80);
	}

}
