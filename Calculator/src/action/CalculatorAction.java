package action;

import java.util.ArrayList;

import module.CalculationModule;

public class CalculatorAction {
	public static void main(String[] args) {
		CalculationModule calc = new CalculationModule();
		//branch feature/./3
		//calling normal ArrayList and inserting value
		ArrayList<String> list = new ArrayList<String>();
		list = calc.addValue(list, "10", "+");
		System.out.println(list.get(0));
		System.out.println(list.get(1));

		//branch feature/./2
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
