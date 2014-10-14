public class Sum implements Formula {
	Formula[] operands;

	public Sum(Formula... operands) {
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

	private double cummulativeValue(double accumulator, double value) {
		return accumulator + value;
	}

	private String symbol() {
		return "+";
	}

	public double initialValue() {
		return 0;
	}

}
