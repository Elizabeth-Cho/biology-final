import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import index.*;

public class GUI {
	private JFrame frame;
	private int counter;
	
	public GUI() {
		//Set frames
		frame = new JFrame("Final project"); //Rename
		frame.setSize(800, 600);
		frame.setLayout(new GridLayout(1, 2));
		//Add panels
		//frame.add(PanelIndex.test);
		frame.add(PanelIndex.progress);
		frame.add(PanelIndex.two);
		PanelIndex.two.setLayout(new GridLayout(2, 1));
		PanelIndex.two.add(PanelIndex.question);
		PanelIndex.two.add(PanelIndex.baseInfo);
		//PanelIndex.two.add(PanelIndex.st);
		//PanelIndex.two.add(PanelIndex.a);
		//Add labels and buttons and such
		PanelIndex.test.add(PanelIndex.tests);
		PanelIndex.st.add(PanelIndex.fr);
		PanelIndex.a.add(PanelIndex.levelA);
		//PanelIndex.a.add(PanelIndex.pot);
		
		//Add listeners
		PanelIndex.levelA.addActionListener(new Listener());
		PanelIndex.levelB.addActionListener(new Listener());
		//Set visible
		frame.setVisible(true);
		
	}
	
	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object x = e.getSource();
			String result = "";
			if (x == PanelIndex.levelA) {
				System.out.println("Hello");
				PanelIndex.a.remove(PanelIndex.levelA);
				PanelIndex.a.revalidate();
				PanelIndex.a.repaint();
				PanelIndex.a.add(PanelIndex.levelB);
			}
			if (x == PanelIndex.levelB) {
				System.out.println("Hi");
				PanelIndex.a.remove(PanelIndex.levelB);
				PanelIndex.a.revalidate();
				PanelIndex.a.repaint();
				PanelIndex.a.add(PanelIndex.levelA);
			}
			
		}
		
	}
	
}
