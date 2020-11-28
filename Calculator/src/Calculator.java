
public class Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println(calc.add(4, 4));
		System.out.println(calc.subtract(4, 4));
		System.out.println(calc.multiply(4, 4));
		System.out.println(calc.divide(4, 4));
	}

	public int add(int i1, int i2) {
		return i1 + i2;
	}

	public int subtract(int i1, int i2) {
		return i1 - i2;
	}

	public int multiply(int i1, int i2) {
		return i1 * i2;
	}

	public int divide(int i1, int i2) {
		return i1 / i2;
	}

}
