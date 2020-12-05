package module.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import module.function.CalculatorModule;

public class NumberButtonUtil extends JButton implements ActionListener{
	CalculatorModule calculator = new CalculatorModule();
	private static final long serialVersionUID = 1L;

	public NumberButtonUtil(String displayKey) {
		super(displayKey);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String inputKey = this.getText();
		CalculatorModule.textField.setText(inputKey);
		calculator.calculate(inputKey);
	}

}
