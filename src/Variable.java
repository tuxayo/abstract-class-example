public class Variable implements Formula {
	String name;
	double value;

	public Variable(String name, double value) {
		this.name = name;
		this.value = value;
	}

	public void set(double value) {
		this.value = value;
	}

	public double asValue() {
		return value;
	}

	public String asString() {
		return name;
	}
}
