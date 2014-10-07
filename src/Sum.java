public class Sum implements Formula {
	Formula operand1, operand2;

	public Sum(Formula operand1, Formula operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	public double asValue() {
		double value1 = operand1.asValue();
		double value2 = operand2.asValue();

		return value1 + value2;
	}

	public String asString() {
		String string1 = operand1.asString();
		String string2 = operand2.asString();
		return "(" + string1 + "+" + string2 + ")";
	}

	public String asString2() {
		StringBuilder sb = new StringBuilder("(");
		sb.append(operand1.asString());
		sb.append("+");
		sb.append(operand2.asString());
		sb.append(")");
		return sb.toString();
	}
}
