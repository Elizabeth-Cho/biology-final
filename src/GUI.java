import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import index.*;

public class GUI {
	private JFrame frame;
	public static int counter;
	
	public GUI() {
		counter = 0;
		//Set frames
		frame = new JFrame("Final project"); //Rename
		frame.setSize(800, 600);
		frame.setLayout(new GridLayout(1, 2, 10, 5));
		//Add panels
		//frame.add(PanelIndex.test);
		frame.add(PanelIndex.progress);
		frame.add(PanelIndex.two);
		PanelIndex.two.setLayout(new GridLayout(2, 1));
		PanelIndex.two.add(PanelIndex.baseInfo);
		PanelIndex.two.add(PanelIndex.recentInfo);
		PanelIndex.baseInfo.setLayout(new GridLayout(4, 2, 10, 5));
		PanelIndex.recentInfo.setLayout(new GridLayout(6, 2, 10, 5));
		PanelIndex.radioTextA.setLayout(new GridLayout(3, 1, 10, 5));
		PanelIndex.radioTextB.setLayout(new GridLayout(3, 1, 10, 5));
		PanelIndex.radioTextC.setLayout(new GridLayout(3, 1, 10, 5));
		PanelIndex.radioYN.setLayout(new GridLayout(3, 1, 10, 5));
		PanelIndex.radioG.setLayout(new GridLayout(2, 1, 10, 5));
		//BaseInfo adding stuff
		PanelIndex.baseInfo.add(PanelIndex.nameL);
		PanelIndex.baseInfo.add(PanelIndex.nameI);
		PanelIndex.baseInfo.add(PanelIndex.genderL);
		PanelIndex.baseInfo.add(PanelIndex.radioG);
		PanelIndex.baseInfo.add(PanelIndex.ageL);
		PanelIndex.baseInfo.add(PanelIndex.age);
		PanelIndex.baseInfo.add(PanelIndex.pregnancyL);
		PanelIndex.baseInfo.add(PanelIndex.radioYN);
		//RecentInfo adding stuff
		PanelIndex.recentInfo.add(PanelIndex.preexisting);
		PanelIndex.recentInfo.add(PanelIndex.radioTextA);
		PanelIndex.recentInfo.add(PanelIndex.history);
		PanelIndex.recentInfo.add(PanelIndex.radioTextB);
		PanelIndex.recentInfo.add(PanelIndex.med);
		PanelIndex.recentInfo.add(PanelIndex.currMed);
		PanelIndex.recentInfo.add(PanelIndex.radioTextC);
		PanelIndex.recentInfo.add(PanelIndex.next);
		//RadioText adding stuff
		PanelIndex.radioTextA.add(PanelIndex.yesA);
		PanelIndex.radioTextA.add(PanelIndex.noA);
		PanelIndex.ynA.add(PanelIndex.yesA);
		PanelIndex.ynA.add(PanelIndex.noA);
		PanelIndex.radioTextA.add(PanelIndex.currMed);
		PanelIndex.radioTextB.add(PanelIndex.yesB);
		PanelIndex.radioTextB.add(PanelIndex.noB);
		PanelIndex.ynB.add(PanelIndex.yesB);
		PanelIndex.ynB.add(PanelIndex.noB);
		PanelIndex.radioTextB.add(PanelIndex.hist);
		PanelIndex.radioYN.add(PanelIndex.yesP);
		PanelIndex.radioYN.add(PanelIndex.noP);
		PanelIndex.radioYN.add(PanelIndex.idk);
		PanelIndex.ynP.add(PanelIndex.yesP);
		PanelIndex.ynP.add(PanelIndex.noP);
		PanelIndex.ynP.add(PanelIndex.idk);
		PanelIndex.radioG.add(PanelIndex.male);
		PanelIndex.radioG.add(PanelIndex.female);
		PanelIndex.genderB.add(PanelIndex.male);
		PanelIndex.genderB.add(PanelIndex.female);
		PanelIndex.radioTextC.add(PanelIndex.yesC);
		PanelIndex.radioTextC.add(PanelIndex.noC);
		PanelIndex.radioTextC.add(PanelIndex.currMed);
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
					PanelIndex.recentInfo.add(PanelIndex.blankField);
					PanelIndex.recentInfo.revalidate();
					PanelIndex.recentInfo.repaint();
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
			}
			else if(x == PanelIndex.pathB){
				Processing.switchToB();
			}
			else if(x == PanelIndex.pathC){
				Processing.switchToC();
			}
			else if(x == PanelIndex.pathD){
				Processing.switchToD();
			}
			else if(x == PanelIndex.lessWeek || x == PanelIndex.oneTwoWeek ||
					x == PanelIndex.twoThreeWeek || x == PanelIndex.threeFourWeek ||
					x == PanelIndex.moreThanMonth){
				
			}
			String result = "";
			 
			
		}
		
	}
	
}
