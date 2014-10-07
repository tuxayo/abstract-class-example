public class Maximum implements Formula {
	Formula[] operands;

	public Maximum(Formula... operands) { // méthode variatique
		this.operands = operands;
	}

	public double asValue() {
		if (operands.length == 0)
			return 0;

		double result = operands[0].asValue();
		for (int k = 1; k < operands.length; k++) {
			double value = operands[k].asValue();
			if (value > result)
				result = value;
		}
		return result;
	}

	public String asString() {
		StringBuilder sb = new StringBuilder("max(");
		for (int k = 0; k < operands.length; k++) {
			sb.append(operands[k].asString());
			if (k < operands.length - 1)
				sb.append(",");
		}
		sb.append("");
		return sb.toString();
	}
}