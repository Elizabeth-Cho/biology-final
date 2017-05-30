package index;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.*;
import images.*;

public class PanelIndex {
	//Image
	public static ImageIcon backI = createImageIcon("blueLights.jpg");
	public static ImageIcon time = createImageIcon("questions/duration.jpg");
	public static ImageIcon wotDo = createImageIcon("questions/wotDo.jpg");
	public static ImageIcon reasonI = createImageIcon("questions/reason.jpg");
	public static ImageIcon rateI = createImageIcon("questions/rate.jpg");
	public static ImageIcon locationI = createImageIcon("questions/location.jpg");
	public static ImageIcon endI = createImageIcon("questions/endScreen.jpg");
	//Label for images
	public static JLabel timeL = new JLabel(time);
	public static JLabel backL = new JLabel(backI);
	public static JLabel wotDoL = new JLabel(wotDo);
	public static JLabel reasonL = new JLabel(reasonI);
	public static JLabel rateL = new JLabel(rateI);
	public static JLabel locationL = new JLabel(locationI);
	public static JLabel endL = new JLabel(endI);
	//Just images
	public static JLabel blankA = new JLabel();
	public static JLabel blankB = new JLabel();
	public static JLabel blankC = new JLabel();
	public static JLabel place = new JLabel("pictures are supposed to be here");
	public static JLabel nameL = new JLabel("Name: (Last name, first name)");
	public static JLabel genderL = new JLabel("Biological gender: ");
	public static JLabel ageL = new JLabel("Date of birth: (MM/DD/YYYY) ");
	public static JLabel pregnancyL = new JLabel("Are you currently pregnant?");
	public static JLabel visit = 
			new JLabel("<html><p>Have you been here in the past week?</p></html>");
	public static JLabel med = 
			new JLabel("<html><p>Are you currently taking any medications? (If yes, please list)</p></html>");
	public static JLabel preexisting = 
			new JLabel("<html><p>Do you have any preexisting conditions? (If yes, please list)</p></html>");
	public static JLabel history =
			new JLabel("<html><p>Do you have any family history of conditions? (If yes, please list)</p></html>");
	public static JLabel blankField = 
			new JLabel("<html><p>Please do not leave any fields empty</p></html>");
	public static JLabel NAN = 
			new JLabel("<html><p>Please input a valid number</p></html>");
	public static JLabel al = 
			new JLabel("<html><p>Do you have any allergies? (If yes, please list)</p></html>");
	//Others
	public static JFormattedTextField ageF = new JFormattedTextField();
	public static ButtonGroup ynA = new ButtonGroup();
	public static ButtonGroup ynB = new ButtonGroup();
	public static ButtonGroup ynP = new ButtonGroup();
	public static ButtonGroup genderB = new ButtonGroup();
	public static ButtonGroup ynAl = new ButtonGroup();
	public static ButtonGroup oneToTenA = new ButtonGroup();	//Baymax
	public static ButtonGroup oneToTenB = new ButtonGroup();
	public static ButtonGroup oneToTenC = new ButtonGroup();
	public static JTextField nameI = new JTextField();
	public static JTextField preex = new JTextField();
	public static JTextField hist = new JTextField();
	public static JTextField currMed = new JTextField();
	public static JTextField age = new JTextField(3);
	public static JTextField allergies = new JTextField();
	public static JRadioButton yesA = new JRadioButton("Yes");
	public static JRadioButton noA = new JRadioButton("No");
	public static JRadioButton yesB = new JRadioButton("Yes");
	public static JRadioButton noB = new JRadioButton("No");
	public static JRadioButton yesP = new JRadioButton("Yes");
	public static JRadioButton noP = new JRadioButton("No");
	public static JRadioButton idk = new JRadioButton("Not sure");
	public static JRadioButton male = new JRadioButton("Male");
	public static JRadioButton female = new JRadioButton("Female");
	public static JRadioButton yesC = new JRadioButton("Yes");
	public static JRadioButton noC = new JRadioButton("No");
	public static JRadioButton yesAl = new JRadioButton("Yes");
	public static JRadioButton noAl = new JRadioButton("No");
	public static Color blueA = new Color(147, 218, 236);
	public static Color blueB = new Color(97, 218, 236);
	//Panel
	public static JPanel startInfo = new JPanel();
	public static JPanel spaceA = new JPanel();
	public static JPanel spaceB = new JPanel();
	public static JPanel main = new JPanel();
	public static JPanel two = new JPanel();
	public static JPanel baseInfo = new JPanel();
	public static JPanel recentInfo = new JPanel();
	public static JPanel personalInfo = new JPanel();
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
	public static JPanel radioTextC = new JPanel();
	public static JPanel radioTextD = new JPanel();
	public static JPanel radioYN = new JPanel();
	public static JPanel radioG = new JPanel();
	public static JPanel duration = new JPanel();
	public static JPanel rate = new JPanel();
	public static JPanel rateP = new JPanel();
	public static JPanel locationP = new JPanel();
	public static JPanel endTwo = new JPanel();
	public static JPanel endP = new JPanel();
	//Wrapping panels
	public static JPanel wrapperMed = new JPanel();
	public static JPanel wrapperHist = new JPanel();
	public static JPanel wrapperAl = new JPanel();
	public static JPanel wrapperNext = new JPanel();
	public static JPanel wrapperName = new JPanel();
	public static JPanel wrapperAge = new JPanel();
	public static JPanel wrapperP = new JPanel();
	public static JPanel wrapperG = new JPanel();
	//Buttons
	public static JButton pathA = new JButton("Pain");		//Pain
	public static JButton pathB = new JButton("Illness");	//Illness
	public static JButton pathC = new JButton("Accident");	//Accidents
	public static JButton pathD = new JButton("Other");		//Other
	public static JButton next = new JButton("Next");	//For base info
	public static JButton nextB = new JButton("Next");	//For rate 1-10
	public static JButton lessWeek = new JButton("Less than a week");
	public static JButton oneTwoWeek = new JButton("One to two weeks");
	public static JButton twoThreeWeek = new JButton("Two to three weeks");
	public static JButton threeFourWeek = new JButton("Three to four weeks");
	public static JButton moreThanMonth = new JButton("More than a month");
	public static JButton head = new JButton("Head");
	public static JButton neck = new JButton("Neck");
	public static JButton chest = new JButton("Chest");
	public static JButton stomach = new JButton("Stomach");
	public static JButton arms = new JButton("Arms");
	public static JButton legs = new JButton("Legs");
	public static JButton back = new JButton("Back");
	public static JButton joint = new JButton("Joints");
	public static JButton muscles = new JButton("Muscles");
	public static JButton bones = new JButton("Bones");
	public static JButton accident = new JButton("Accident");
	public static JButton pregnancy = new JButton("Pregnancy");
	public static JButton cuts = new JButton("Cuts");
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
	//Temporary labels
	public static JLabel catTemp = 
			new JLabel("<html><p>What is your reason for your visit?</p></html>");
	
	private static ImageIcon createImageIcon(String path) {
		URL resource = Icon.class.getResource("/images/" + path);
		if (resource == null) {
			return null;
		}
		return new ImageIcon(resource);
	}
}