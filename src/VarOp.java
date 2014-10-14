public abstract class VarOp implements Formula {
	private Formula[] operands;

	public VarOp(Formula... operands) {
		this.operands = operands;
	}

	public double asValue() {
		double accumulator = initialValue();
		for (int i = 0; i < operands.length; i++) {
			accumulator = cummulativeValue(accumulator, operands[i].asValue());
		}
		return accumulator;
	}

	public String asString() {
		StringBuilder sb = new StringBuilder("(");
		for (int k = 0; k < operands.length; k++) {
			sb.append(operands[k].asString());
			if (k != operands.length - 1)
				sb.append(symbol());
		}
		sb.append(")");
		return sb.toString();
	}

	protected abstract double cummulativeValue(double accumulator, double value);

	protected abstract double initialValue();

	protected abstract String symbol();
}
