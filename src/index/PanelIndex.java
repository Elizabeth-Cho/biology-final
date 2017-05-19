package index;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.*;
import images.*;

public class PanelIndex {
	//Image
	public static ImageIcon back = createImageIcon("blueLights");
	//Label
	public static JLabel backL = new JLabel(back);
	public static JLabel blankA = new JLabel();
	public static JLabel blankB = new JLabel();
	public static JLabel blankC = new JLabel();
	public static JLabel place = new JLabel("pictures are supposed to be here");
	public static JLabel nameL = new JLabel("Name: ");
	public static JLabel genderL = new JLabel("Biological gender: ");
	public static JLabel ageL = new JLabel("Age: ");
	public static JLabel pregnancyL = new JLabel("Are you currently pregnant: ");
	public static JLabel visit = 
			new JLabel("<html><p>Have you been here in the past week?</p></html>");
	public static JLabel med = 
			new JLabel("<html><p>Are you currently taking any medications?</p></html>");
	public static JLabel preexisting = 
			new JLabel("<html><p>Do you have any preexisting conditions?</p></html>");
	public static JLabel history =
			new JLabel("<html><p>Do you have any family history of conditions?</p></html>");
	public static JLabel blankField = 
			new JLabel("<html><p>Please do not leave any fields empty</p></html>");
	public static JLabel NAN = 
			new JLabel("<html><p>Please input a valid number</p></html>");
	//Others
	public static ButtonGroup ynA = new ButtonGroup();
	public static ButtonGroup ynB = new ButtonGroup();
	public static ButtonGroup ynP = new ButtonGroup();
	public static ButtonGroup genderB = new ButtonGroup();
	public static JTextField nameI = new JTextField();
	public static JTextField preex = new JTextField();
	public static JTextField hist = new JTextField();
	public static JTextField currMed = new JTextField();
	public static JTextField age = new JTextField(3);
	public static JRadioButton yesA = new JRadioButton("Yes");
	public static JRadioButton noA = new JRadioButton("No");
	public static JRadioButton yesB = new JRadioButton("Yes");
	public static JRadioButton noB = new JRadioButton("No");
	public static JRadioButton yesP = new JRadioButton("Yes");
	public static JRadioButton noP = new JRadioButton("No");
	public static JRadioButton idk = new JRadioButton("Not sure");
	public static JRadioButton male = new JRadioButton("Male");
	public static JRadioButton female = new JRadioButton("Female");
	//Panel
	public static JPanel spaceA = new JPanel();
	public static JPanel spaceB = new JPanel();
	public static JPanel main = new JPanel();
	public static JPanel two = new JPanel();
	public static JPanel baseInfo = new JPanel();
	public static JPanel recentInfo = new JPanel();
	public static JPanel categories = new JPanel();
	public static JPanel pathAQ = new JPanel();
	public static JPanel pathBQ = new JPanel();
	public static JPanel pathCQ = new JPanel();
	public static JPanel pathDQ = new JPanel();
	public static JPanel progress = new JPanel();
	public static JPanel question = new JPanel();
	public static JPanel multResponses = new JPanel();
	public static JPanel checkResponses = new JPanel();
	public static JPanel radioTextA = new JPanel();
	public static JPanel radioTextB = new JPanel();
	public static JPanel radioYN = new JPanel();
	public static JPanel radioG = new JPanel();
	//Buttons
	public static JButton pathA = new JButton();	//Pain
	public static JButton pathB = new JButton();	//Illness
	public static JButton pathC = new JButton();	//Accidents
	public static JButton pathD = new JButton();	//Other
	public static JButton next = new JButton("Next");	//For base info
	//Checkboxes, generic symptoms for all related questions
	public static JCheckBox symptomA = new JCheckBox();
	public static JCheckBox symptomB = new JCheckBox();
	public static JCheckBox symptomC = new JCheckBox();
	public static JCheckBox symptomD = new JCheckBox();
	public static JCheckBox symptomE = new JCheckBox();
	public static JCheckBox symptomF = new JCheckBox();
	public static JCheckBox symptomG = new JCheckBox();
	public static JCheckBox symptomH = new JCheckBox();
	public static JCheckBox symptomI = new JCheckBox();
	public static JCheckBox symptomJ = new JCheckBox();
	//Testing purposes
	public static ImageIcon frog = createImageIcon("frog.jpg");
	public static ImageIcon potato = createImageIcon("potato.jpg");
	public static ImageIcon fire = createImageIcon("lit.jpg");
	public static JLabel tests = new JLabel(frog);
	public static JLabel fr = new JLabel(fire);
	public static JLabel pot = new JLabel(potato);
	public static JPanel st = new JPanel();
	public static JPanel a = new JPanel();
	public static JPanel test = new JPanel();
	public static JButton levelA = new JButton("le button");
	public static JButton levelB = new JButton("other button");
	//ArrayLists
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