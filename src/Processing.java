import index.PanelIndex;

public class Processing {
	private Signal sig;
	private String name;
	private String gender;
	
	public Processing(Signal s){
		sig = s;
	}
	
	public void getName(Object x){
		if(x == PanelIndex.next) {
			name = PanelIndex.nameI.getText();
		}
	}
	
	public void getGender(Object x){

	}
	
	public void getPreHist(Object x){
	
	}
	
	public void getPrevVisit(Object x){
		
	}
	
	public void getCurrMed(Object x){
		
	}
	
	public void getPreg(Object x){
		
	}
	
	public void getAge(Object x){
		
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
 
