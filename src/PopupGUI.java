import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PopupGUI {
	private JFrame frame;
	private JLabel labelBlank;
	private JLabel labelFormat;
	private JLabel labelDob;
	private JLabel labelList;
	private JButton button;
	
	public PopupGUI(String key){
		frame = new JFrame();
		labelBlank = new JLabel("<html><p>Please do not leave any fields blank.</p></html>");
		labelFormat = new JLabel("<html><p>Please put the following in the proper format: </p></html>");
		labelDob = new JLabel("<html><p>Please put in a valid birthday</p></html>");
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
		frame.setSize(350, 200);
		frame.setLayout(new BorderLayout());
		if(key.equals("blank")){
			frame.add(labelBlank);
		}
		else if(key.contains("email") || key.contains("dob")){
			labelFormat.setText(labelFormat.getText() + labelList);
			frame.add(labelFormat, BorderLayout.CENTER);
		}
		else if(key.contains("vDob")){
			frame.add(labelDob, BorderLayout.CENTER);
		}
		frame.add(button, BorderLayout.PAGE_END);
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
