import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import index.*;

public class AltGUI {
	private JFrame frame;
	public static int counter;
	
	public AltGUI() {
		frame = new JFrame("Alt");
		frame.setSize(800, 600);
		frame.setLayout(new GridLayout(1, 2, 10, 5));
		frame.add(PanelIndex.progress);
		frame.add(PanelIndex.startInfo);
		PanelIndex.startInfo.setLayout(new GridLayout(11, 2, 10, 5));
		PanelIndex.radioTextA.setLayout(new GridLayout(3, 1, 10, 5));
		PanelIndex.radioTextB.setLayout(new GridLayout(3, 1, 10, 5));
		PanelIndex.radioTextC.setLayout(new GridLayout(3, 1, 10, 5));
		PanelIndex.radioTextD.setLayout(new GridLayout(3, 1, 10, 5));
		PanelIndex.radioYN.setLayout(new GridLayout(3, 1, 10, 5));
		PanelIndex.radioG.setLayout(new GridLayout(2, 1, 10, 5));
		//PanelIndex.startInfo.add(PanelIndex.nameL);
		PanelIndex.startInfo.add(PanelIndex.nameI);
		//PanelIndex.startInfo.add(PanelIndex.genderL);
		PanelIndex.startInfo.add(PanelIndex.radioG);
		//PanelIndex.startInfo.add(PanelIndex.ageL);
		PanelIndex.startInfo.add(PanelIndex.pregnancyL);
		PanelIndex.startInfo.add(PanelIndex.radioYN);
		PanelIndex.startInfo.add(PanelIndex.preexisting);
		PanelIndex.startInfo.add(PanelIndex.radioTextA);
		
		frame.setVisible(true);
	}
}
