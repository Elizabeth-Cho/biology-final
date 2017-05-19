import index.PanelIndex;

public class Processing {
	private Signal sig;
	private static String name;
	private static String gender;
	private static int age;
	private static String pregnant;
	private static String prevVisit;
	private static String med;
	private static String hist;
	
	public Processing(Signal s){
		sig = s;
	}
	
	public static boolean checkBase(Object x){
		if(PanelIndex.nameI.getText() == ""|| PanelIndex.age.getText() == "" ||
				PanelIndex.g.getSelectedItem().toString() == ""){
			System.out.println("checkBase");
			//GUI.counter--;
			//System.out.println(GUI.counter);
			PanelIndex.recentInfo.add(PanelIndex.blankField);
			PanelIndex.recentInfo.revalidate();
			PanelIndex.recentInfo.repaint();
			return false;
		}
		else {
			return true;
		}	
	}
	
	public static void gatherBase(Object x){
		name = PanelIndex.nameI.getText();
		gender = PanelIndex.g.getSelectedItem().toString();
		age = Integer.parseInt(PanelIndex.age.getText());
	
		
	}
	public static void switchToCat(){
		PanelIndex.two.remove(PanelIndex.baseInfo);
		PanelIndex.two.remove(PanelIndex.recentInfo);
		PanelIndex.two.revalidate();
		PanelIndex.two.repaint();
	}
	
	public void getCat(Object x){
		
	}
	public void branchA1(Object x){
		if(x == PanelIndex.levelA) {
			
		}
	}
	
	public void transferInfo(){
		UserInfo.name = name;
		UserInfo.gender = gender;
		
	}
	}
 
