//public abstract class VarOp {
//	Formula[] operands;
//
//	public String asString() {
//		StringBuilder sb = new StringBuilder("(");
//		for (int k = 0; k < operands.length; k++) {
//			sb.append(operands[k].asString());
//			if (k != operands.length - 1)
//				sb.append(symbol());
//		}
//		sb.append(")");
//		return sb.toString();
//	}
//
//	public double asValue() {
//		double value1 = operand1.asValue();
//		double value2 = operand2.asValue();
//
//		return cumulativeValue(); // TODO WTF
//	}
//
//	public VarOp(Formula... operands) {
//		this.operands = operands;
//	}
//
//	public abstract String symbol();
//	public abstract double initialValue();
//	public abstract double cumulativeValue();
// }
