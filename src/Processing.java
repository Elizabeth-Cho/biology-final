import java.awt.*;

import index.PanelIndex;

public class Processing {
	private Signal sig;
	private static String name;
	private static String gender;
	private static String age;
	private static String pregnant;
	private static String prevVisit;
	private static String med;
	private static String hist;
	public static String category;
	private String[] ynA = {"yesA", "noA"};
	private String[] ynB = {"yesB", "noB"};
	
	
	public Processing(Signal s){
		sig = s;
	}
	
	public static boolean checkBase(Object x){
		if(PanelIndex.nameI.getText().equals("") ||
				PanelIndex.age.getText().equals("")){
			//System.out.println("checkBase");
			//GUI.counter--;
			//System.out.println(GUI.counter);
			return false;
		}
		else {
			System.out.println(PanelIndex.ynA.getSelection().getActionCommand());
			//System.out.println("true");
			return true;
		}	
	}
	
	public static void gatherBase(Object x){
		name = PanelIndex.nameI.getText();
		//age = Integer.parseInt(PanelIndex.age.getText());
		
	
		
	}
	public static void switchToCat(){
		PanelIndex.two.remove(PanelIndex.baseInfo);
		PanelIndex.two.remove(PanelIndex.recentInfo);
		resetPanels();
		PanelIndex.two.add(PanelIndex.question);
		PanelIndex.two.add(PanelIndex.multResponses);
		PanelIndex.multResponses.setLayout(new GridLayout(4, 1));
		PanelIndex.question.add(PanelIndex.catTemp);
		PanelIndex.multResponses.add(PanelIndex.pathA);
		PanelIndex.multResponses.add(PanelIndex.pathB);
		PanelIndex.multResponses.add(PanelIndex.pathC);
		PanelIndex.multResponses.add(PanelIndex.pathD);
	}
	
	public static void getCat(){
		
	}
	
	public static void switchToA(){
		PanelIndex.two.remove(PanelIndex.multResponses);
		//Remove question
		resetPanels();
		PanelIndex.two.add(PanelIndex.duration);
		//Replace question
		PanelIndex.duration.setLayout(new GridLayout(5, 1));
		PanelIndex.duration.add(PanelIndex.lessWeek);
		PanelIndex.duration.add(PanelIndex.oneTwoWeek);
		PanelIndex.duration.add(PanelIndex.twoThreeWeek);
		PanelIndex.duration.add(PanelIndex.threeFourWeek);
		PanelIndex.duration.add(PanelIndex.moreThanMonth);
	}
	
	public static void switchToB(){
		switchCat();
		//Remove question
		resetPanels();
		PanelIndex.two.add(PanelIndex.duration);
		PanelIndex.question.add(PanelIndex.timeL);
		//Replace question
		PanelIndex.duration.setLayout(new GridLayout(5, 1));
		PanelIndex.duration.add(PanelIndex.lessWeek);
		PanelIndex.duration.add(PanelIndex.oneTwoWeek);
		PanelIndex.duration.add(PanelIndex.twoThreeWeek);
		PanelIndex.duration.add(PanelIndex.threeFourWeek);
		PanelIndex.duration.add(PanelIndex.moreThanMonth);
	}

	public static void switchToC(){
		switchCat();
		resetPanels();
		PanelIndex.question.add(PanelIndex.reasonL);
		//Add accident type
		//Add responses	
	}
	
	public static void switchToD(){
		switchCat();
		resetPanels();
		PanelIndex.two.add(PanelIndex.wotDoL);
		//Add question about incident
		//Add responses
	}
	public static void pathALevelTwo(){
		PanelIndex.question.remove(PanelIndex.timeL);	//remove time question
		PanelIndex.two.remove(PanelIndex.duration);
		resetPanels();
		//Add where pain is located
		//Add responses
	}
	public static void pathALevelThree(){
		//Remove question
		//Remove responses
		resetPanels();
		//Add scale of 1-10
		//Add new responses
	}
	public static void pathBLevelTwo(){
		resetPanels();
		//Ask where symptoms are located
	}
	public static void pathCLevelTwo(){
		resetPanels();
		//Where injuries are located
	}
	public static void pathCLevelThree(){
		resetPanels();
		//Scale of 1-10
	}
	public static void pathDLevelTwo(){
		resetPanels();
		//Man what did you do
	}
	public static void pathDLevelThree(){
		resetPanels();
		//Duration
	}
	public void transferInfo(){
		UserInfo.name = name;
		UserInfo.gender = gender;
		
	}
	public static void resetPanels() {
		PanelIndex.two.revalidate();
		PanelIndex.two.repaint();
	}
	
	public static void switchCat(){
		PanelIndex.question.remove(PanelIndex.catTemp);
		PanelIndex.two.remove(PanelIndex.multResponses);
	}
	public static void confirmInfo(){
		
	}
	public static void loopThrough(){
		
	}
}
 
