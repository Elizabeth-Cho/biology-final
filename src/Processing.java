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
	
	public Processing(Signal s){
		sig = s;
	}
	
	public static boolean checkBase(Object x){
		if(PanelIndex.nameI.getText().equals("")){
			//System.out.println("checkBase");
			//GUI.counter--;
			//System.out.println(GUI.counter);
			return false;
		}
		else {
			System.out.println("true");
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
		PanelIndex.two.revalidate();
		PanelIndex.two.repaint();
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
		PanelIndex.two.revalidate();
		PanelIndex.two.repaint();
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
		PanelIndex.two.remove(PanelIndex.multResponses);
		//Remove question
		PanelIndex.two.revalidate();
		PanelIndex.two.repaint();
		PanelIndex.two.add(PanelIndex.duration);
		//Replace question
		PanelIndex.duration.setLayout(new GridLayout(5, 1));
		PanelIndex.duration.add(PanelIndex.lessWeek);
		PanelIndex.duration.add(PanelIndex.oneTwoWeek);
		PanelIndex.duration.add(PanelIndex.twoThreeWeek);
		PanelIndex.duration.add(PanelIndex.threeFourWeek);
		PanelIndex.duration.add(PanelIndex.moreThanMonth);
	}

	public static void switchToC(){
		
	}
	
	public static void switchToD(){
		
	}
	public static void pathALevelTwo(){
		
	}
	public static void pathALevelThree(){
		
	}
	public static void pathCLevelTwo(){
		
	}
	public static void pathCLevelThree(){
		
	}
	public static void pathCLevelFour(){
		
	}
	public static void pathDLevelTwo(){
		
	}
	public static void pathDLevelThree(){
		
	}
	public void transferInfo(){
		UserInfo.name = name;
		UserInfo.gender = gender;
		
	}
	
}
 
