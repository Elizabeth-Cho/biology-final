package index;

import javax.swing.*;

public class PersonalPI {
	public static String[] race = {"", "American Indian", "Alaska Native",
			"Asian", "African American", "Decline", "Native Hawiian",
			"Other Pacific Islander", "White"};
	public static String[] emp = {"", "Full time", "Part time",
			"Not employed", "Retired", "Self employed", "Military",
			"Other"};
	public static String[] covType = {"", "Primary", "Secondary",
			"Tertiary"};
	public static String[] rel = {"", "Self", "Spouse", "Child",
			"Father", "Mother", "Siblings"};
	public static String[] gender = {"", "Male", "Female"};
	
	public static JComboBox raceC = new JComboBox(race);
	public static JComboBox empC = new JComboBox(emp);
	public static JComboBox covTypeC = new JComboBox(covType);
	public static JComboBox relC = new JComboBox(rel);
	
	public static JTextField fN = new JTextField();
	public static JTextField mN = new JTextField();
	public static JTextField lN = new JTextField();
	public static JTextField addr = new JTextField();
	public static JTextField dob = new JTextField();
	public static JTextField name = new JTextField();
	public static JTextField number = new JTextField();
	public static JTextField eName = new JTextField();
	public static JTextField eNumber = new JTextField();
	public static JTextField insProv = new JTextField();
	public static JTextField insID = new JTextField();
	
	public static JLabel fNL = new JLabel("First name");
	public static JLabel mNL = new JLabel("Middle name");
	public static JLabel lNL = new JLabel("Last name");
	public static JLabel addrL = new JLabel("Address");
	public static JLabel numL = new JLabel("Phone number");
	public static JLabel emailL = new JLabel("Email");
	public static JLabel birthL = new JLabel("Birthday (MM/DD/YYYY)");
	public static JLabel eNameL = new JLabel("Name of emergency contact");
	public static JLabel eNumL = new JLabel("Phone number of emergency contact");
	public static JLabel insProvL = new JLabel("Insurance Provider");
	public static JLabel insIDL = new JLabel("Member ID");
	public static JLabel raceL = new JLabel("Race");
	public static JLabel empL = new JLabel("Employer");
	public static JLabel covTypeL = new JLabel("Type of Coverage");
	public static JLabel relL = new JLabel("Relation to holder");
	
	public static JLabel nameA = new JLabel();
	public static JLabel nameB = new JLabel();
	public static JLabel conA = new JLabel();
	public static JLabel conB = new JLabel();
	public static JLabel conC = new JLabel();
	public static JLabel conD = new JLabel();
	public static JLabel conE = new JLabel();
	public static JLabel conF = new JLabel();
	public static JLabel raceA = new JLabel();
	
	public static JPanel nameP = new JPanel();		//3x3
	public static JPanel addrP = new JPanel();		//2x1
	public static JPanel contactP = new JPanel();	//2x2
	public static JPanel birthP = new JPanel();		//2x4?
	public static JPanel eConP = new JPanel();		//2x2
	public static JPanel insInputP = new JPanel();	//2x2
	public static JPanel insComboP = new JPanel();	//2x2
}
