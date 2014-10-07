public class Product implements Formula {
	Formula operand1, operand2;

	public Product(Formula operand1, Formula operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	public double asValue() {
		double value1 = operand1.asValue();
		double value2 = operand2.asValue();

		return value1 * value2;
	}

	public String asString() {
		StringBuilder sb = new StringBuilder("(");
		sb.append(operand1.asString());
		sb.append(symbol());
		sb.append(operand2.asString());
		sb.append(")");
		return sb.toString();
	}

	public String asStringConcat() {
		String string1 = operand1.asString();
		String string2 = operand2.asString();
		return "(" + string1 + symbol() + string2 + ")";
	}

	public String symbol() {
		return "*";
	}
}
