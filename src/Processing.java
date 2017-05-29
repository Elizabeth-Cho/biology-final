import java.awt.*;
import javax.swing.*;

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
	private static String allergies;
	public static String category;
	public static String reason = "";
	public static String duration = "";
	private static boolean selected = false;
	private String[] ynA = {"yesA", "noA"};
	private String[] ynB = {"yesB", "noB"};
	
	
	public Processing(Signal s){
		sig = s;
	}
	
	public static boolean checkBase(Object x){
		if(PanelIndex.nameI.getText().equals("") ||
				PanelIndex.age.getText().equals("")){
			//PanelIndex.baseInfo.add(PanelIndex.blankField);
			//System.out.println("checkBase");
			//GUI.counter--;
			//System.out.println(GUI.counter);
			return false;
		}
		else {
			//System.out.println(PanelIndex.ynA.getSelection().getActionCommand());
			//System.out.println("true");
			return true;
		}	
	}
	
	public static void gatherBase(Object x){
		name = PanelIndex.nameI.getText();
		//age = Integer.parseInt(PanelIndex.age.getText());
	
		
	}
	public static void switchToCat(){
		GUI.frame.remove(PanelIndex.baseInfo);
		//PanelIndex.two.remove(PanelIndex.recentInfo);
		resetPanels();
		GUI.frame.add(PanelIndex.two);
		resetPanels();
		PanelIndex.two.add(PanelIndex.question);
		PanelIndex.two.add(PanelIndex.multResponses);
		PanelIndex.multResponses.setLayout(new GridLayout(4, 1));
		//PanelIndex.question.add(PanelIndex.reasonL);
		PanelIndex.question.add(PanelIndex.reasonL);
		PanelIndex.multResponses.add(PanelIndex.pathA);
		PanelIndex.multResponses.add(PanelIndex.pathB);
		PanelIndex.multResponses.add(PanelIndex.pathC);
		PanelIndex.multResponses.add(PanelIndex.pathD);
	}
	
	public static void switchToA(){
		switchCat();
		resetPanels();
		PanelIndex.question.add(PanelIndex.timeL);
		PanelIndex.two.add(PanelIndex.duration);
		PanelIndex.duration.setLayout(new GridLayout(5, 1));
		PanelIndex.duration.add(PanelIndex.lessWeek);
		PanelIndex.duration.add(PanelIndex.oneTwoWeek);
		PanelIndex.duration.add(PanelIndex.twoThreeWeek);
		PanelIndex.duration.add(PanelIndex.threeFourWeek);
		PanelIndex.duration.add(PanelIndex.moreThanMonth);
	}
	
	public static void pathALevelTwo(){
		PanelIndex.question.remove(PanelIndex.timeL);	//remove time question
		PanelIndex.two.remove(PanelIndex.duration);
		resetPanels();
		PanelIndex.question.add(PanelIndex.locationL);
		PanelIndex.two.add(PanelIndex.locationP);
		PanelIndex.locationP.setLayout(new GridLayout(5, 2));
		PanelIndex.locationP.add(PanelIndex.head);
		PanelIndex.locationP.add(PanelIndex.neck);
		PanelIndex.locationP.add(PanelIndex.chest);
		PanelIndex.locationP.add(PanelIndex.stomach);
		PanelIndex.locationP.add(PanelIndex.arms);
		PanelIndex.locationP.add(PanelIndex.legs);
		PanelIndex.locationP.add(PanelIndex.back);
		PanelIndex.locationP.add(PanelIndex.joint);
		PanelIndex.locationP.add(PanelIndex.muscles);
		PanelIndex.locationP.add(PanelIndex.bones);
	}
	public static void pathALevelThree(){
		PanelIndex.question.remove(PanelIndex.locationL);
		PanelIndex.two.remove(PanelIndex.locationP);
		resetPanels();
		PanelIndex.question.add(PanelIndex.rateL);
		//Add new responses
	}
	
	public static void switchToB(){
		switchCat();
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
	
	public static void pathBLevelTwo(){
		PanelIndex.question.remove(PanelIndex.timeL);
		PanelIndex.two.remove(PanelIndex.duration);
		resetPanels();
		//Ask where symptoms are located
	}

	public static void switchToC(){
		switchCat();
		resetPanels();
		PanelIndex.question.add(PanelIndex.reasonL);
		//Add accident type
		//Add responses	
	}
	
	public static void pathCLevelTwo(){
		PanelIndex.question.remove(PanelIndex.reasonL);
		resetPanels();
		//Where injuries are located
	}
	
	public static void pathCLevelThree(){
		resetPanels();
		//Swap picture
		//Add rate
		PanelIndex.rate.setLayout(new GridLayout(10, 1, 5, 10));
		for(int i = 1; i < 11; i++) {
			JButton temp = new JButton(((Integer)i).toString());
			PanelIndex.rate.add(temp);
			PanelIndex.oneToTenB.add(temp);
		}
		//Scale of 1-10
	}
	public static void switchToD(){
		switchCat();
		resetPanels();
		PanelIndex.question.add(PanelIndex.wotDoL);
		PanelIndex.two.add(PanelIndex.pathDQ);
		PanelIndex.pathDQ.setLayout(new GridLayout(2, 2));
		//Add question about incident
		//Add responses
	}
	
	
	public static void pathDLevelTwo(){
		resetPanels();
		//Man what did you do
	}
	public static void pathDLevelThree(){
		resetPanels();
		//Duration
	}
	
	public static void setRate(){
		
	}
	public void transferInfo(){
		UserInfo.name = name;
		UserInfo.gender = gender;
		
	}
	public static void resetPanels() {
		GUI.frame.revalidate();
		GUI.frame.repaint();
		PanelIndex.two.revalidate();
		PanelIndex.two.repaint();
	}
	
	public static void switchCat(){
		PanelIndex.question.remove(PanelIndex.reasonL);
		PanelIndex.two.remove(PanelIndex.multResponses);
	}
	public static void confirmInfo(){
		
	}
	public static void loopThrough(){
		while(!selected){
			
		}
	}
}
 
