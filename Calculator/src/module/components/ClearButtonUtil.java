package module.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import module.function.CalculatorModule;

public class ClearButtonUtil extends JButton implements ActionListener{
	CalculatorModule calculator = new CalculatorModule();
	private static final long serialVersionUID = 1L;

	public ClearButtonUtil() {
		super("C");
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CalculatorModule.textField.setText("");
		calculator.clearInput();
	}

}
