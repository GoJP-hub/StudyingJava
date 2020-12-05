package module.function;

import javax.swing.JTextField;

public class CalculatorModule {
	//calling instance for calculation
	CalculationModule calc = new CalculationModule();

	//creating necessary components for processing the calculation
	public static JTextField textField = new JTextField(""); // 計算結果を表示するテキストフィールドクラス
	int result = 0;
	String equationKey = "";

	public void clearInput() {
		result = 0;
		equationKey = "";
	}

	public void calculate(String in) {
		System.out.println(in);

		switch (in) {
		case "+":
		case "-":
		case "*":
		case "/":
			equationKey = "";
			break;
		case "=":
			textField.setText(Integer.toString(result));
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
				//When number is newly entered after "break" with previous equal sign
				case "=":
					break;
				}
				equationKey = "";
			} else {
				result = Integer.parseInt(in);
				textField.setText(Integer.toString(result));
			}
		}

	}
}