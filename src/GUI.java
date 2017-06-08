import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import index.*;

public class GUI {
	public static JFrame frame;
	//public static int counter;
	private boolean initialized;
	
	public GUI() {
		initialized = false;
		//counter = 0;
		//Set frames
		frame = new JFrame("Information Medical Data Collection (iMDC)"); //Rename
		frame.setSize(800, 600);
		GUI.frame.setLayout(new GridLayout(1, 2, 5, 5));
		GUI.frame.add(PanelIndex.personalInfo);
		GUI.frame.add(PanelIndex.baseInfo);
		Processing.infoPanel();
		Processing.basePanel();
		//Add panels
		//frame.add(PanelIndex.test);
		//frame.add(PanelIndex.begin);
		frame.setIconImage(PanelIndex.icon.getImage());
		//frame.add(PanelIndex.two);
		//Processing.startPanel();
		//Processing.infoPanel();
		//Processing.basePanel();
		PanelIndex.progress.add(PanelIndex.sideL);
		PanelIndex.two.setLayout(new GridLayout(2, 1));
		//PanelIndex.two.add(PanelIndex.baseInfo);
		//PanelIndex.two.add(PanelIndex.recentInfo);
		
		//PanelIndex.recentInfo.setLayout(new GridLayout(6, 2, 10, 5));
		
		//Setting borders
		PanelIndex.personalInfo.setBorder(BorderFactory.createLineBorder(Color.black));
		PanelIndex.baseInfo.setBorder(BorderFactory.createLineBorder(Color.black));
		//Setting colors
		frame.setBackground(Color.black);
		//BaseInfo adding stuff
		
		/*PanelIndex.baseInfo.add(PanelIndex.al);
		PanelIndex.baseInfo.add(PanelIndex.radioTextD);
		PanelIndex.baseInfo.add(PanelIndex.med);
		PanelIndex.baseInfo.add(PanelIndex.radioTextC);
		PanelIndex.baseInfo.add(PanelIndex.preexisting);
		PanelIndex.baseInfo.add(PanelIndex.radioTextA);
		PanelIndex.baseInfo.add(PanelIndex.history);
		PanelIndex.baseInfo.add(PanelIndex.radioTextB);
		PanelIndex.baseInfo.add(PanelIndex.pregnancyL);
		PanelIndex.baseInfo.add(PanelIndex.radioYN);*/
		
		/*PanelIndex.radioG.setBackground(PanelIndex.blueB);
		PanelIndex.radioYN.setBackground(PanelIndex.blueB);
		PanelIndex.radioTextB.setBackground(PanelIndex.blueB);
		PanelIndex.radioTextD.setBackground(PanelIndex.blueB);*/
		//RadioText adding stuff
		/*PanelIndex.radioTextA.add(PanelIndex.preexC);
		PanelIndex.radioTextA.add(PanelIndex.preex);
		PanelIndex.radioTextB.add(PanelIndex.histC);		
		PanelIndex.radioTextB.add(PanelIndex.hist);
		PanelIndex.radioYN.add(PanelIndex.prC);
		PanelIndex.radioTextC.add(PanelIndex.medC);
		PanelIndex.radioTextC.add(PanelIndex.currMed);
		PanelIndex.radioTextD.add(PanelIndex.alC);
		PanelIndex.radioTextD.add(PanelIndex.allergies);*/
		
		//PanelIndex.two.add(PanelIndex.st);
		//PanelIndex.two.add(PanelIndex.a);
		//Add labels and buttons and such
		
		/*PanelIndex.test.add(PanelIndex.tests);
		PanelIndex.st.add(PanelIndex.fr);
		PanelIndex.a.add(PanelIndex.levelA);
		PanelIndex.a.add(PanelIndex.pot);*/
		//PanelIndex.levelA.addActionListener(new Listener());
		//PanelIndex.levelB.addActionListener(new Listener());
		
		//Add listeners
		PanelIndex.next.addActionListener(new startListener());
		PanelIndex.pathA.addActionListener(new chooseListener());
		PanelIndex.pathB.addActionListener(new chooseListener());
		PanelIndex.pathC.addActionListener(new chooseListener());
		PanelIndex.pathD.addActionListener(new chooseListener());
		PanelIndex.lessWeek.addActionListener(new pathAListener());
		PanelIndex.oneTwoWeek.addActionListener(new pathAListener());
		PanelIndex.twoThreeWeek.addActionListener(new pathAListener());
		PanelIndex.threeFourWeek.addActionListener(new pathAListener());
		PanelIndex.moreThanMonth.addActionListener(new pathAListener());
		PanelIndex.head.addActionListener(new pathAListener());
		PanelIndex.neck.addActionListener(new pathAListener());
		PanelIndex.chest.addActionListener(new pathAListener());
		PanelIndex.stomach.addActionListener(new pathAListener());
		PanelIndex.arms.addActionListener(new pathAListener());
		PanelIndex.legs.addActionListener(new pathAListener());
		PanelIndex.back.addActionListener(new pathAListener());
		PanelIndex.joint.addActionListener(new pathAListener());
		PanelIndex.muscles.addActionListener(new pathAListener());
		PanelIndex.bones.addActionListener(new pathAListener());
		PanelIndex.nextA.addActionListener(new pathAListener());
		PanelIndex.nextB.addActionListener(new pathBListener());
		PanelIndex.nextC.addActionListener(new Listener());
		PanelIndex.nextD.addActionListener(new Listener());
		PanelIndex.nextSymp.addActionListener(new Listener());
		PanelIndex.nextSympL.addActionListener(new pathBListener());
		PanelIndex.nextSympC.addActionListener(new pathBListener());
		PanelIndex.lessDay.addActionListener(new pathBListener());
		PanelIndex.twoThreeDay.addActionListener(new pathBListener());
		PanelIndex.fourFiveDay.addActionListener(new pathBListener());
		PanelIndex.sixSevenDay.addActionListener(new pathBListener());
		PanelIndex.moreThanWeek.addActionListener(new pathBListener());
		PanelIndex.pregnancy.addActionListener(new Listener());
		PanelIndex.cuts.addActionListener(new Listener());
		PanelIndex.accident.addActionListener(new Listener());
		PanelIndex.start.addActionListener(new Listener());
		PanelIndex.rStart.addActionListener(new Listener());
		//Set visible
		frame.setVisible(true);
		
	}
	
	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//Remove, revalidate, repaint, add
			Object x = e.getSource();
			if(x == PanelIndex.next){
				System.out.println();
				if(Processing.checkBase()){
					if(Processing.checkFormat()){
						if(!initialized){
							System.out.println(initialized);
							Processing.initializeAll();
							initialized = true;
							System.out.println(initialized);
						}
						System.out.println(Processing.checkFormat());
						Processing.transferInfo();
						System.out.println(UserInfo.fN + UserInfo.mN + UserInfo.lN);
						Processing.switchToCat();
					}
					else{
						new PopupGUI(Processing.format);
					}
				}
				else{
					new PopupGUI("blank");
				}
				/*System.out.println(counter);
				PanelIndex.recentInfo.add(PanelIndex.blankField);
				PanelIndex.recentInfo.revalidate();
				PanelIndex.recentInfo.repaint();
				Processing.checkBase(x);
				System.out.println("finish");*/
			}
			/*else if(x == PanelIndex.start){
				Processing.afterStart();
			}*/
			else if(x == PanelIndex.rStart){
				Processing.resetAll(UserInfo.reason);
				Processing.returnToStart();
			}
			else if(x == PanelIndex.pathA){
				Processing.switchToA();
				UserInfo.reason = "Pain";
			}
			else if(x == PanelIndex.pathB){
				Processing.switchToB();
				UserInfo.reason = "Illness";
			}
			else if(x == PanelIndex.pathC){
				Processing.switchToC();
				UserInfo.reason = "Accident";
			}
			else if(x == PanelIndex.pathD){
				Processing.switchToD();
				UserInfo.reason = "Other";
			}
			else if(x == PanelIndex.lessWeek || x == PanelIndex.oneTwoWeek ||
					x == PanelIndex.twoThreeWeek || x == PanelIndex.threeFourWeek ||
					x == PanelIndex.moreThanMonth){
				Processing.pathALevelTwo();
				UserInfo.durationA = ((JButton)x).getText();
			}
			else if(x == PanelIndex.lessDay || x == PanelIndex.twoThreeDay ||
					x == PanelIndex.fourFiveDay || x == PanelIndex.sixSevenDay||
					x == PanelIndex.moreThanWeek){
				Processing.pathBLevelTwo();
				UserInfo.durationB = ((JButton)x).getText();
			}
			else if(x == PanelIndex.head || x == PanelIndex.neck ||
					x == PanelIndex.chest || x == PanelIndex.stomach ||
					x == PanelIndex.arms || x == PanelIndex.legs ||
					x == PanelIndex.back || x == PanelIndex.joint ||
					x == PanelIndex.muscles || x == PanelIndex.bones) {
				Processing.pathALevelThree();
				UserInfo.locationA = ((JButton)x).getText();
			}
			else if(x == PanelIndex.nextA) {
				JRadioButton selected = Processing.loopThrough(ArrayListIndex.pathARate);
				if(selected == null){
					new PopupGUI("blank");
				}
				else{
					UserInfo.rateA = selected.getText();
					Processing.endScreen(x);
					FileWriter.sortFile();
					FileWriter.writeFile();
				}
			}
			else if(x == PanelIndex.nextB){
				JRadioButton select = Processing.loopThrough(ArrayListIndex.pathBRate);
				if(select == null){
					new PopupGUI("blank");
				}
				UserInfo.rateB = select.getText();
				Processing.endScreen(x);
				FileWriter.sortFile();
				FileWriter.writeFile();
			}
			else if(x == PanelIndex.nextC){
				JRadioButton select = Processing.loopThrough(ArrayListIndex.pathCRate);
				if(select == null){
					new PopupGUI("blank");
				}
				System.out.println(select.getText());
				UserInfo.rateC = select.getText();
				FileWriter.sortFile();
				Processing.endScreen(x);
				FileWriter.writeFile();
			}
			else if(x == PanelIndex.nextSympL){
				Processing.pathBLevelThree();
			}
			else if(x == PanelIndex.nextSymp){
				Processing.pathBLevelFour();
			}
			else if(x == PanelIndex.nextSympC){
				Processing.pathCLevelThree();
			}
			else if(x == PanelIndex.accident || x == PanelIndex.cuts ||
					x == PanelIndex.pregnancy){
				Processing.pathCLevelTwo();
			}
			String result = "";
			 		
		}
		
	}
	
	private class startListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object x = e.getSource();
			if(x == PanelIndex.next){
				if(Processing.checkBase()){			//Check for missing info
					if(Processing.checkFormat()){	//Check for format of dob and email
						Processing.transferInfo();
						Processing.switchToCat();
						if(!initialized){			//Only initialize everything once
							Processing.initializeAll();	
						}
					}
				}
			}
			else{
				new PopupGUI(Processing.format);
			}
		}
		
	}
	private class chooseListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object x = e.getSource();
			if(x == PanelIndex.pathA){
				Processing.switchToA();
				UserInfo.reason = "Pain";
			}
			else if(x == PanelIndex.pathB){
				Processing.switchToB();
				UserInfo.reason = "Illness";
			}
			else if(x == PanelIndex.pathC){
				Processing.switchToC();
				UserInfo.reason = "Accident";
			}
			else if(x == PanelIndex.pathD){
				Processing.switchToD();
				UserInfo.reason = "Other";
			}
		}
		
	}
	private class pathAListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object x = e.getSource();
			if(x == PanelIndex.lessWeek || x == PanelIndex.oneTwoWeek ||
					x == PanelIndex.twoThreeWeek || x == PanelIndex.threeFourWeek ||
					x == PanelIndex.moreThanMonth){
				Processing.pathALevelTwo();
				UserInfo.durationA = ((JButton)x).getText();
			}
			else if(x == PanelIndex.head || x == PanelIndex.neck ||
					x == PanelIndex.chest || x == PanelIndex.stomach ||
					x == PanelIndex.arms || x == PanelIndex.legs ||
					x == PanelIndex.back || x == PanelIndex.joint ||
					x == PanelIndex.muscles || x == PanelIndex.bones) {
				Processing.pathALevelThree();
				UserInfo.locationA = ((JButton)x).getText();
			}
			else if(x == PanelIndex.nextA){
				JRadioButton selected = Processing.loopThrough(ArrayListIndex.pathARate);
				if(selected == null){
					new PopupGUI("blank");
				}
				else{
					UserInfo.rateA = selected.getText();
					Processing.endScreen(x);
					FileWriter.sortFile();
					FileWriter.writeFile();
				}
			}
		}
		
	}
	private class pathBListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object x = e.getSource();
			if(x == PanelIndex.lessDay || x == PanelIndex.twoThreeDay ||
					x == PanelIndex.fourFiveDay || x == PanelIndex.sixSevenDay||
					x == PanelIndex.moreThanWeek){
				Processing.pathBLevelTwo();
				UserInfo.durationB = ((JButton)x).getText();
			}
			else if(x == PanelIndex.nextSympL){		//Need to add to AL, add input option
				for(int i = 0; i < ArrayListIndex.symptLoc.size(); i++){
					JCheckBox check = ArrayListIndex.symptLoc.get(i);
					if(check.isSelected()){
						UserInfo.symptLoc.add(((JButton)x).getText());
					}
				}
				Processing.pathBLevelThree();
			}
			else if(x == PanelIndex.nextSymp){		//Need to add to AL, add input option
				for(int i = 0; i < ArrayListIndex.symptoms.size(); i++){
					JCheckBox check = ArrayListIndex.symptLoc.get(i);
					if(check.isSelected()){
						UserInfo.symptoms.add(((JButton)x).getText());
					}
				}
				Processing.pathBLevelFour();
			}
			else if(x == PanelIndex.nextB){
				JRadioButton selected = Processing.loopThrough(ArrayListIndex.pathBRate);
				if(selected == null){
					new PopupGUI("blank");
				}
				else{
					UserInfo.rateB = selected.getText();
					Processing.endScreen(x);
					FileWriter.sortFile();
					FileWriter.writeFile();
				}
			}
		}
		
	}
	private class pathCListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	private class pathDListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}