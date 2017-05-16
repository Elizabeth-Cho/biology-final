package index;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.*;
import images.*;

public class PanelIndex {
	//Image
	public static ImageIcon frog = createImageIcon("frog.jpg");
	public static ImageIcon potato = createImageIcon("potato.jpg");
	public static ImageIcon fire = createImageIcon("lit.jpg");
	//Label
	public static JLabel tests = new JLabel(frog);
	public static JLabel fr = new JLabel(fire);
	public static JLabel pot = new JLabel(potato);
	//Panel
	public static JPanel st = new JPanel();
	public static JPanel two = new JPanel();
	public static JPanel a = new JPanel();
	public static JPanel test = new JPanel();
	public static JPanel blankA, blankB, blankC;
	public static JPanel progressA, progressB, progressC;
	public static JPanel question;
	public static JPanel responses;
	//Buttons
	public static JButton levelA = new JButton("le button");
	public static JButton levelB = new JButton("other button");
	ArrayList<JPanel> p = new ArrayList<JPanel>();
	ArrayList<JPanel> q= new ArrayList<JPanel>();
	ArrayList<JPanel> r = new ArrayList<JPanel>();
	
	private static ImageIcon createImageIcon(String path) {
		URL resource = Icon.class.getResource("/images/" + path);
		if (resource == null) {
			return null;
		}
		return new ImageIcon(resource);
	}
	
}
