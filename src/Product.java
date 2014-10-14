public class Product extends VarOp {
	Formula[] operands;

	public Product(Formula... operands) {
		super(operands);
	}

	protected double cummulativeValue(double accumulator, double value) {
		return accumulator * value;
	}

	protected String symbol() {
		return "*";
	}

	protected double initialValue() {
		return 1;
	}
}
