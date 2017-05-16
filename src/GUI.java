import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import index.*;

public class GUI {
	private JFrame frame;
	private ImageIcon test;
	
	public GUI() {
		//Set frames
		frame = new JFrame("Final project"); //Rename
		frame.setSize(800, 600);
		frame.setLayout(new GridLayout(1, 2));
		//Add panels
		frame.add(PanelIndex.test);
		frame.add(PanelIndex.two);
		PanelIndex.two.setLayout(new GridLayout(2, 1));
		PanelIndex.two.add(PanelIndex.st);
		PanelIndex.two.add(PanelIndex.a);
		//Add labels
		PanelIndex.test.add(PanelIndex.tests);
		PanelIndex.st.add(PanelIndex.fr);
		PanelIndex.a.add(PanelIndex.pot);
		
		//Add panels
		
		//Set visible
		frame.setVisible(true);
		
	}
	
	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object x = e.getSource();
			
			
		}
		
	}
	
}
