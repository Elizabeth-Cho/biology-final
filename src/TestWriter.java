import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestWriter {
	private JFrame frame;
	private JButton button;
	private JPanel panel;
	public TestWriter(){
		frame = new JFrame("Alt");
		frame.setSize(800, 600);
		frame.setVisible(true);
		button = new JButton("button");
		panel = new JPanel();
		frame.add(panel);
		panel.add(button);
		
		button.addActionListener(new Listener());
	}
	private class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object x = e.getSource();
			if(x == button) {
				FileWriter.writeFile();
			}
		}	
	}
}
