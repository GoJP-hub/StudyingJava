package module;

import java.util.ArrayList;

public class CalculatorModule {
	//branch feature/./5
	//externalized the actvities involved with calculator
	public void calculate() {

		//creating instances for necessary components
		InputProcessModule ip = new InputProcessModule();
		CalculationModule calc = new CalculationModule();

		//creating necessary components for processing the calculation
		int result = 0;
		String equationKey = "";

		//calling the method for input processing = console usage
		ArrayList<String> listKeys = ip.keyInput();

		//processing the console keys recognised from input processing
		for (String in : listKeys) {
			//if inserted value (in) is equation key
			switch (in) {
			case "+":
			case "-":
			case "*":
			case "/":
			case "=":
				equationKey = in;
				break;

			//if inserted value (in) is numeric
			default:
				if (!"".equals(equationKey)) {
					switch (equationKey) {
					case "+":
						result = calc.add(result, Integer.parseInt(in));
						break;
					case "-":
						result = calc.subtract(result, Integer.parseInt(in));
						break;
					case "*":
						result = calc.multiply(result, Integer.parseInt(in));
						break;
					case "/":
						result = calc.divide(result, Integer.parseInt(in));
						break;
					}
				} else {
					result = Integer.parseInt(in);
				}
			}

		}
		System.out.println("The result of calculation is:"+ result);
	}
}
