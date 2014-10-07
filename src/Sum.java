public class Sum implements Formula {
	Formula[] operands;

	public Sum(Formula... operands) {
		this.operands = operands;
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

	private String symbol() {
		return "+";
	}

	public double asValue() {
		double acc = initialValue();
		for (int i = 0; i < operands.length; i++) {
			acc = cummulativeValue(acc, operands[i].asValue());
		}
		return acc;
	}

	private double cummulativeValue(double acc, double val) {
		return acc + val;
	}

	public double initialValue() {
		return 0;
	}

}
