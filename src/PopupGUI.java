import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PopupGUI {
	private JFrame frame;
	private JLabel labelBlank;
	private JLabel labelFormat;
	private JLabel labelList;
	private JButton button;
	
	public PopupGUI(String key){
		frame = new JFrame();
		labelBlank = new JLabel("<html><p>Please do not leave any fields blank.</p></html>");
		labelFormat = new JLabel("<html><p>Please put the following in the proper format</p></html>");
		if(key.contains("email")){
			labelList = new JLabel("Email");
		}
		else if(key.contains("dob")){
			labelList = new JLabel("Date of Birth");
		}
		else if(key.contains("email") && key.contains("dob")){
			labelList = new JLabel("Email, Date of Birth");
		}
		button = new JButton("Okay");
		frame.setSize(200, 350);
		frame.setLayout(new GridLayout(2, 1));
		if(key.equals("blank")){
			frame.add(labelBlank);
		}
		else if(key.contains("email") || key.contains("dob")){
			frame.add(labelFormat);
			frame.add(labelList);
		}
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
