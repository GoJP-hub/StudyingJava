package module.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import module.components.CalcButtonUtil;
import module.components.ClearButtonUtil;
import module.components.NumberButtonUtil;
import module.components.OffButtonUtil;
import module.function.CalculatorModule;

public class CalculatorUiModule {
	public void createUi() {
		//create instances for base components of UI ※components such as buttons are called in methods
		JFrame frame = new JFrame();
		JPanel basePanel = new JPanel();
		JPanel keyPad = new JPanel();

		//specify number of keyPads to deploy (like Array)
		keyPad.setLayout(new GridLayout(4, 4));

		//create buttons (like adding in specified Array)
		keyPad.add(new NumberButtonUtil("7"), 0);
		keyPad.add(new NumberButtonUtil("8"), 0);
		keyPad.add(new NumberButtonUtil("9"), 0);
		keyPad.add(new CalcButtonUtil("÷"), 0);
		keyPad.add(new NumberButtonUtil("4"), 0);
		keyPad.add(new NumberButtonUtil("5"), 0);
		keyPad.add(new NumberButtonUtil("6"), 0);
		keyPad.add(new CalcButtonUtil("×"), 0);
		keyPad.add(new NumberButtonUtil("1"), 0);
		keyPad.add(new NumberButtonUtil("2"), 0);
		keyPad.add(new NumberButtonUtil("3"), 0);
		keyPad.add(new CalcButtonUtil("－"), 0);
		keyPad.add(new OffButtonUtil(), 0);
		keyPad.add(new NumberButtonUtil("0"), 0);
		keyPad.add(new CalcButtonUtil("＝"), 0);
		keyPad.add(new CalcButtonUtil("＋"), 0);

		//calling instance to set a layout of panel
		basePanel.setLayout(new BorderLayout());
		//positions in the panel
		basePanel.add(keyPad, BorderLayout.CENTER);
		basePanel.add(CalculatorModule.textField, BorderLayout.NORTH);
		basePanel.add(new ClearButtonUtil(), BorderLayout.SOUTH);

		//setting property of frame
		frame.setSize(new Dimension(250, 300));
		frame.setTitle("計算機");
		frame.setContentPane(basePanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
