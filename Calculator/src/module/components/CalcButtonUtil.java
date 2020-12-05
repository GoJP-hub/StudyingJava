package module.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import module.function.CalculatorModule;

public class CalcButtonUtil extends JButton implements ActionListener{
	CalculatorModule calculator = new CalculatorModule();
	private static final long serialVersionUID = 1L;

	public CalcButtonUtil(String displayKey) {
		super(displayKey);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String inputKey = this.getText();
		if(!"=".equals(inputKey)) {
			CalculatorModule.textField.setText(inputKey);
		}
		calculator.calculate(inputKey);
	}

}
