package index;

import javax.swing.*;

public class PersonalPI {
	public static String[] race = {"", "Alaska Native","Asian", 
			"African American", "Caucasian", "Hispanic",
			"Native American", "Other Pacific Islander"};
	public static String[] emp = {"", "Full time", "Part time",
			"Not employed", "Retired", "Self employed", "Military",
			"Other"};
	public static String[] covType = {"", "Primary", "Secondary",
			"Tertiary", "Not Applicable"};
	public static String[] rel = {"", "Self", "Spouse", "Child",
			"Father", "Mother", "Siblings", "Not Applicable"};
	public static String[] gender = {"", "Male", "Female"};
	
	public static JComboBox raceC = new JComboBox(race);
	public static JComboBox empC = new JComboBox(emp);
	public static JComboBox covTypeC = new JComboBox(covType);
	public static JComboBox relC = new JComboBox(rel);
	public static JComboBox genC = new JComboBox(gender);
	
	public static JTextField fN = new JTextField();
	public static JTextField mN = new JTextField();
	public static JTextField lN = new JTextField();
	public static JTextField addr = new JTextField();
	public static JTextField dob = new JTextField();
	public static JTextField name = new JTextField();
	public static JTextField number = new JTextField();
	public static JTextField email = new JTextField();
	public static JTextField eName = new JTextField();
	public static JTextField eNumber = new JTextField();
	public static JTextField eRel = new JTextField();
	public static JTextField insProv = new JTextField();
	public static JTextField insID = new JTextField();
	public static JTextField insHold = new JTextField();
	public static JTextField pcName = new JTextField();
	public static JTextField pcNum = new JTextField();
	public static JTextField pcAddr = new JTextField();
	public static JTextField employer = new JTextField();
	public static JTextField occupation = new JTextField();
	public static JTextField empAdd = new JTextField();
	public static JTextField empNum = new JTextField();
	
	public static JLabel fNL = new JLabel("First name");
	public static JLabel mNL = new JLabel("Middle name");
	public static JLabel lNL = new JLabel("Last name");
	public static JLabel addrL = new JLabel("Address");
	public static JLabel numL = new JLabel("Phone number");
	public static JLabel emailL = new JLabel("Email");
	public static JLabel birthL = new JLabel("Birthday (MM/DD/YYYY)");
	public static JLabel eNameL = new JLabel("Name of emergency contact");
	public static JLabel eNumL = new JLabel("Phone number of emergency contact");
	public static JLabel eRelL = new JLabel("Relation to patient");
	public static JLabel insProvL = new JLabel("Insurance Provider");
	public static JLabel insIDL = new JLabel("Member ID");
	public static JLabel raceL = new JLabel("Race");
	public static JLabel empL = new JLabel("Employer");
	public static JLabel occL = new JLabel("Occupation");
	public static JLabel empAddL = new JLabel("Employer address");
	public static JLabel empNumL = new JLabel("Employer phone number");
	public static JLabel covTypeL = new JLabel("Type of Coverage");
	public static JLabel relL = new JLabel("Relation to holder");
	public static JLabel genL = new JLabel("Gender");
	public static JLabel insHoldL = new JLabel("Insurance holder");
	public static JLabel pcNameL = new JLabel("Primary care physican");
	public static JLabel pcNumL = new JLabel("Phone number");
	public static JLabel pcAddrL = new JLabel("Address");

	public static JLabel alA = new JLabel();
	public static JLabel medA = new JLabel();
	public static JLabel preexA = new JLabel();
	public static JLabel histA = new JLabel();
	
	public static JPanel nameP = new JPanel();		//3x3
	public static JPanel addrP = new JPanel();		//2x1
	public static JPanel contactP = new JPanel();	//2x2
	public static JPanel birthP = new JPanel();		//2x4?
	public static JPanel eConP = new JPanel();		//2x2
	public static JPanel insInputP = new JPanel();	//2x2
	public static JPanel insComboP = new JPanel();	//2x2
	public static JPanel primCarePA = new JPanel();	//2x2
	public static JPanel primCarePB = new JPanel();	//2x1
	//Info panels
	public static JPanel alP = new JPanel();
	public static JPanel medP = new JPanel();
	public static JPanel preexP = new JPanel();
	public static JPanel histP = new JPanel();
	public static JPanel prP = new JPanel();
	public static JPanel empPA = new JPanel();
	public static JPanel empPB = new JPanel();
}
