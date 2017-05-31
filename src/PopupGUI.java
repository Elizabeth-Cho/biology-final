import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PopupGUI {
	private JFrame frame;
	private JLabel label;
	private JButton button;
	
	public PopupGUI(){
		frame = new JFrame();
		label = new JLabel("<html><p>Please do not leave any fields blank.</p></html>");
		button = new JButton("Okay");
		frame.setSize(200, 350);
		frame.setLayout(new GridLayout(2, 1));
		
		frame.add(label);
		frame.add(button);
		
		frame.setVisible(true);
		button.addActionListener(new Listener());
	}
	
	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
		}
		
	}
}
