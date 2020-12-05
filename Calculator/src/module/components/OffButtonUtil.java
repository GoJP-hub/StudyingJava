package module.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class OffButtonUtil extends JButton implements ActionListener{
	private static final long serialVersionUID = 1L;

	public OffButtonUtil() {
		super("OFF");
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
