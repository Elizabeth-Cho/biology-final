package index;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.*;
import images.*;

public class PanelIndex {
	//Arrays
	public static String[] ynPr = {"", "Yes", "No", "Not sure"};
	public static String[] ynPreex = {"", "Yes", "No"};
	public static String[] ynHist = {"", "Yes", "No"};
	public static String[] ynMed = {"", "Yes", "No"};
	public static String[] ynAlA = {"", "Yes", "No"};
	public static String[] ynVisit = {"", "Yes", "No"};
	public static ArrayList<String> sympCheck = new ArrayList<String>();
	//JComboBox
	public static JComboBox prC = new JComboBox(ynPr);
	public static JComboBox preexC = new JComboBox(ynPreex);
	public static JComboBox histC = new JComboBox(ynHist);
	public static JComboBox medC = new JComboBox(ynMed);
	public static JComboBox alC = new JComboBox(ynAlA);
	public static JComboBox visitC = new JComboBox(ynVisit);
	//Image
	public static ImageIcon backI = createImageIcon("blueLights.jpg");
	public static ImageIcon time = createImageIcon("questions/duration.jpg");
	public static ImageIcon wotDo = createImageIcon("questions/wotDo.jpg");
	public static ImageIcon reasonI = createImageIcon("questions/reason.jpg");
	public static ImageIcon rateI = createImageIcon("questions/rate.jpg");
	public static ImageIcon locationI = createImageIcon("questions/location.jpg");
	public static ImageIcon endI = createImageIcon("questions/endScreen.jpg");
	public static ImageIcon icon = createImageIcon("icon.png");
	public static ImageIcon accidentI = createImageIcon("questions/accident.jpg");
	public static ImageIcon symptomIm = createImageIcon("questions/symptoms.jpg");
	public static ImageIcon incidentI = createImageIcon("questions/incident.jpg");
	public static ImageIcon side = createImageIcon("sidepanel.png");
	public static ImageIcon baymax = createImageIcon("baymax.gif");
	//Label for images
	public static JLabel timeL = new JLabel(time);
	public static JLabel backL = new JLabel(backI);
	public static JLabel wotDoL = new JLabel(wotDo);
	public static JLabel reasonL = new JLabel(reasonI);
	public static JLabel rateL = new JLabel(rateI);
	public static JLabel locationL = new JLabel(locationI);
	public static JLabel endL = new JLabel(endI);
	public static JLabel accL = new JLabel(accidentI);
	public static JLabel sympL = new JLabel(symptomIm);
	public static JLabel incidentL = new JLabel(incidentI);
	public static JLabel sideL = new JLabel(side);
	public static JLabel baymaxL = new JLabel(baymax);
	//Just images
	public static JLabel blankA = new JLabel();
	public static JLabel blankB = new JLabel();
	public static JLabel blankC = new JLabel();
	public static JLabel place = new JLabel("pictures are supposed to be here");
	public static JLabel pregnancyL = new JLabel("Are you currently pregnant?");
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
	public static JLabel al = 
			new JLabel("<html><p>Do you have any allergies?</p></html>");
	//Others
	public static JFormattedTextField ageF = new JFormattedTextField();
	public static ButtonGroup oneToTenA = new ButtonGroup();	//Baymax
	public static ButtonGroup oneToTenB = new ButtonGroup();
	public static ButtonGroup oneToTenC = new ButtonGroup();
	public static JTextField nameI = new JTextField();
	public static JTextField preex = new JTextField();
	public static JTextField hist = new JTextField();
	public static JTextField currMed = new JTextField();
	public static JTextField age = new JTextField(3);
	public static JTextField allergies = new JTextField();
	public static Color blueA = new Color(147, 218, 236);
	public static Color blueB = new Color(97, 218, 236);
	public static Color red = new Color(178, 6, 9);
	//Panel
	public static JPanel begin = new JPanel();
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
	public static JPanel lilBaymax = new JPanel();
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
	public static JButton start = new JButton("Start");
	public static JButton rStart = new JButton("Okay");
	public static JButton pathA = new JButton("Pain");		//Pain
	public static JButton pathB = new JButton("Illness");	//Illness
	public static JButton pathC = new JButton("Accident");	//Accidents
	public static JButton pathD = new JButton("Other");		//Other
	public static JButton next = new JButton("Next");		//For base info
	public static JButton nextA = new JButton("NextA");		//For rate 1-10 (path A)
	public static JButton nextB = new JButton("NextB");		//Path B
	public static JButton nextC = new JButton("NextC");		//Path C
	public static JButton nextD = new JButton("NextD");		//Path D
	public static JButton nextSymp = new JButton("Next");	//Symptoms
	public static JButton nextSympL = new JButton("Next");	//Symptom list
	public static JButton nextSympC = new JButton("Next");
	public static JButton lessWeek = new JButton("Less than a week");
	public static JButton oneTwoWeek = new JButton("One to two weeks");
	public static JButton twoThreeWeek = new JButton("Two to three weeks");
	public static JButton threeFourWeek = new JButton("Three to four weeks");
	public static JButton moreThanMonth = new JButton("More than a month");
	public static JButton lessDay = new JButton("Less than a day");
	public static JButton twoThreeDay = new JButton("Two to three days");
	public static JButton fourFiveDay = new JButton("Four to five days");
	public static JButton sixSevenDay = new JButton("Six to seven days");
	public static JButton moreThanWeek = new JButton("More than a week");
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
	public static JCheckBox symptomA = new JCheckBox("Fever");
	public static JCheckBox symptomB = new JCheckBox("Headache");
	public static JCheckBox symptomC = new JCheckBox("Drowsiness/Lethargy");
	public static JCheckBox symptomD = new JCheckBox("Lack of appetite");
	public static JCheckBox symptomE = new JCheckBox("Stomach pain");
	public static JCheckBox symptomF = new JCheckBox("Dehydration");
	public static JCheckBox symptomG = new JCheckBox("Incoherence");
	public static JCheckBox symptomH = new JCheckBox("Fatigue");
	public static JCheckBox symptomI = new JCheckBox("Diarrhea");
	public static JCheckBox symptomJ = new JCheckBox("Vomiting");
	//More checkboxes
	public static JCheckBox locationA = new JCheckBox("Head");
	public static JCheckBox locationB = new JCheckBox("Neck");
	public static JCheckBox locationC = new JCheckBox("Chest");
	public static JCheckBox locationD = new JCheckBox("Stomach");
	public static JCheckBox locationE = new JCheckBox("Muscles");
	public static JCheckBox locationF = new JCheckBox("Bones");
	public static JCheckBox locationG = new JCheckBox("Joints");
	public static JCheckBox locationH = new JCheckBox("Back");
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