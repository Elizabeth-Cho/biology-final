import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import index.*;

public class GUI {
	public static JFrame frame;
	public static int counter;
	
	public GUI() {
		counter = 0;
		//Set frames
		frame = new JFrame("Final project"); //Rename
		frame.setSize(800, 600);
		frame.setLayout(new GridLayout(1, 2, 10, 5));
		//Add panels
		//frame.add(PanelIndex.test);
		frame.add(PanelIndex.personalInfo);
		frame.add(PanelIndex.baseInfo);
		frame.setIconImage(PanelIndex.icon.getImage());
		//frame.add(PanelIndex.two);
		Processing.infoPanel();
		PanelIndex.progress.add(PanelIndex.backL);
		PanelIndex.two.setLayout(new GridLayout(2, 1));
		//PanelIndex.two.add(PanelIndex.baseInfo);
		//PanelIndex.two.add(PanelIndex.recentInfo);
		PanelIndex.baseInfo.setLayout(new GridLayout(7, 2));
		//PanelIndex.recentInfo.setLayout(new GridLayout(6, 2, 10, 5));
		PanelIndex.radioTextA.setLayout(new GridLayout(2, 1, 10, 5));
		PanelIndex.radioTextB.setLayout(new GridLayout(2, 1, 10, 5));
		PanelIndex.radioTextC.setLayout(new GridLayout(2, 1, 10, 5));
		PanelIndex.radioTextD.setLayout(new GridLayout(2, 1, 10, 5));
		PanelIndex.radioYN.setLayout(new GridLayout(1, 1, 10, 5));
		//Setting borders
		PanelIndex.radioTextA.setBorder(BorderFactory.createLineBorder(Color.black));
		PanelIndex.radioTextB.setBorder(BorderFactory.createLineBorder(Color.black));
		PanelIndex.radioTextC.setBorder(BorderFactory.createLineBorder(Color.black));
		PanelIndex.radioTextD.setBorder(BorderFactory.createLineBorder(Color.black));
		PanelIndex.pregnancyL.setBorder(BorderFactory.createLineBorder(Color.black));
		PanelIndex.al.setBorder(BorderFactory.createLineBorder(Color.black));
		PanelIndex.preexisting.setBorder(BorderFactory.createLineBorder(Color.black));
		PanelIndex.history.setBorder(BorderFactory.createLineBorder(Color.black));
		PanelIndex.med.setBorder(BorderFactory.createLineBorder(Color.black));
		PanelIndex.visit.setBorder(BorderFactory.createLineBorder(Color.black));
		//Setting colors
		frame.setBackground(Color.black);
		//BaseInfo adding stuff
		PanelIndex.baseInfo.add(PanelIndex.visit);
		PanelIndex.baseInfo.add(PanelIndex.visitC);
		PanelIndex.baseInfo.add(PanelIndex.al);
		PanelIndex.baseInfo.add(PanelIndex.radioTextD);
		PanelIndex.baseInfo.add(PanelIndex.preexisting);
		PanelIndex.baseInfo.add(PanelIndex.radioTextA);
		PanelIndex.baseInfo.add(PanelIndex.history);
		PanelIndex.baseInfo.add(PanelIndex.radioTextB);
		PanelIndex.baseInfo.add(PanelIndex.med);
		PanelIndex.baseInfo.add(PanelIndex.radioTextC);
		PanelIndex.baseInfo.add(PanelIndex.pregnancyL);
		PanelIndex.baseInfo.add(PanelIndex.radioYN);
		PanelIndex.baseInfo.add(PanelIndex.wrapperNext);
		PanelIndex.wrapperNext.add(PanelIndex.next);
		PanelIndex.wrapperNext.setMaximumSize(new Dimension(680, 20));
		PanelIndex.next.setPreferredSize(new Dimension(300, 60));
		/*PanelIndex.radioG.setBackground(PanelIndex.blueB);
		PanelIndex.radioYN.setBackground(PanelIndex.blueB);
		PanelIndex.radioTextB.setBackground(PanelIndex.blueB);
		PanelIndex.radioTextD.setBackground(PanelIndex.blueB);*/
		//RadioText adding stuff
		PanelIndex.radioTextA.add(PanelIndex.preexC);
		PanelIndex.radioTextA.add(PanelIndex.preex);
		
		PanelIndex.radioTextB.add(PanelIndex.histC);		
		PanelIndex.radioTextB.add(PanelIndex.hist);
		
		PanelIndex.radioYN.add(PanelIndex.prC);
	
		PanelIndex.radioTextC.add(PanelIndex.medC);
		PanelIndex.radioTextC.add(PanelIndex.currMed);
		PanelIndex.radioTextD.add(PanelIndex.alC);
		PanelIndex.radioTextD.add(PanelIndex.allergies);
		//PanelIndex.two.add(PanelIndex.st);
		//PanelIndex.two.add(PanelIndex.a);
		//Add labels and buttons and such
		
		/*PanelIndex.test.add(PanelIndex.tests);
		PanelIndex.st.add(PanelIndex.fr);
		PanelIndex.a.add(PanelIndex.levelA);
		PanelIndex.a.add(PanelIndex.pot);*/
		
		//Add listeners
		PanelIndex.levelA.addActionListener(new Listener());
		PanelIndex.levelB.addActionListener(new Listener());
		PanelIndex.next.addActionListener(new Listener());
		PanelIndex.pathA.addActionListener(new Listener());
		PanelIndex.pathB.addActionListener(new Listener());
		PanelIndex.pathC.addActionListener(new Listener());
		PanelIndex.pathD.addActionListener(new Listener());
		PanelIndex.lessWeek.addActionListener(new Listener());
		PanelIndex.oneTwoWeek.addActionListener(new Listener());
		PanelIndex.twoThreeWeek.addActionListener(new Listener());
		PanelIndex.threeFourWeek.addActionListener(new Listener());
		PanelIndex.moreThanMonth.addActionListener(new Listener());
		PanelIndex.head.addActionListener(new Listener());
		PanelIndex.neck.addActionListener(new Listener());
		PanelIndex.chest.addActionListener(new Listener());
		PanelIndex.stomach.addActionListener(new Listener());
		PanelIndex.arms.addActionListener(new Listener());
		PanelIndex.legs.addActionListener(new Listener());
		PanelIndex.back.addActionListener(new Listener());
		PanelIndex.joint.addActionListener(new Listener());
		PanelIndex.muscles.addActionListener(new Listener());
		PanelIndex.bones.addActionListener(new Listener());
		PanelIndex.nextB.addActionListener(new Listener());
		//Set visible
		frame.setVisible(true);
		
	}
	
	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//Remove, revalidate, repaint, add
			Object x = e.getSource();
			if(x == PanelIndex.next){
				if(Processing.checkBase(x)){
					counter++;
					Processing.gatherBase(x);
					Processing.switchToCat();
				}
				else{
					PanelIndex.baseInfo.add(PanelIndex.blankField);
					PanelIndex.baseInfo.revalidate();
					PanelIndex.baseInfo.repaint();
				}
				/*System.out.println(counter);
				PanelIndex.recentInfo.add(PanelIndex.blankField);
				PanelIndex.recentInfo.revalidate();
				PanelIndex.recentInfo.repaint();
				Processing.checkBase(x);
				System.out.println("finish");*/
			}
			else if(x == PanelIndex.pathA){
				Processing.switchToA();
				Processing.reason = "Pain";
			}
			else if(x == PanelIndex.pathB){
				Processing.switchToB();
				Processing.reason = "Illness";
			}
			else if(x == PanelIndex.pathC){
				Processing.switchToC();
				Processing.reason = "Accident";
			}
			else if(x == PanelIndex.pathD){
				Processing.switchToD();
				Processing.reason = "Other";
			}
			else if(x == PanelIndex.lessWeek || x == PanelIndex.oneTwoWeek ||
					x == PanelIndex.twoThreeWeek || x == PanelIndex.threeFourWeek ||
					x == PanelIndex.moreThanMonth){
				Processing.pathALevelTwo();
				Processing.duration = ((JButton)x).getName();
				System.out.println(((JButton)x).getName());
			}
			else if(x == PanelIndex.head || x == PanelIndex.neck ||
					x == PanelIndex.chest || x == PanelIndex.stomach ||
					x == PanelIndex.arms || x == PanelIndex.legs ||
					x == PanelIndex.back || x == PanelIndex.joint ||
					x == PanelIndex.muscles || x == PanelIndex.bones) {
				Processing.pathALevelThree();
			}
			else if(x == PanelIndex.nextB) {
				Processing.endScreen();
			}
			String result = "";
			 		
		}
		
	}
	
}