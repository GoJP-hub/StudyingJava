package action;

import module.CalculationModule;

public class CalculatorAction {
	public static void main(String[] args) {
		CalculationModule calc = new CalculationModule();

		int sum = calc.add(4, 4);
		int difference = calc.subtract(4, 4);
		int product = calc.multiply(4, 4);
		int quotient = calc.divide(4, 4);

		System.out.println(sum);
		System.out.println(difference);
		System.out.println(product);
		System.out.println(quotient);
	}
}
