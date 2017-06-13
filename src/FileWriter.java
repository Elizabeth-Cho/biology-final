import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import index.ArrayListIndex;

public class FileWriter {
	private static String fileName = UserInfo.lN + UserInfo.fN + UserInfo.mN + ".txt";
	private static File file;
	private static String path = "c:\\Users\\zergl\\workspace\\biology-final\\src\\files\\";
	static int rate = 0;
	static String duration = "";
	static String location = "";
	static int rank = 0;
	static String symptoms = "";
	
	public static void setInfo(){
		if(UserInfo.reason.equals("Pain")){
			rate = Integer.parseInt(UserInfo.rateA);
			duration = UserInfo.durationA;
			location = UserInfo.locationA;
		}
		else if(UserInfo.reason.equals("Illness")){
			rate = Integer.parseInt(UserInfo.rateB);
			duration = UserInfo.durationB;
			location = UserInfo.locationB;
		}
		else if(UserInfo.reason.equals("Accident")){
			rate = Integer.parseInt(UserInfo.rateC);
			location = UserInfo.locationC;
		}
	}
	public static void sortRate(){
		System.out.println("FileWriter: Rate");
		if(rate >= 8) {rank+=4;}
		else if(rate >=6 && rate < 8) {rank+=3;}
		else if(rate >=4 && rate < 6) {rank+=2;}
		else{rank+=1;}
	}
	public static void sortFile(){
		sortRate();
		sortDuration();
		System.out.println(rank);
		System.out.println("FileWriter: Sorting");
		if(rank > 13){
			path += "Level 2 [Emergency]\\" + fileName;
		}
		else if(rank <= 13 && rank >8 ){
			path += "Level 3 [Urgent]\\" + fileName;
		}
		else if(rank <=8 && rank <5){
			path += "Level 4 [Semi-urgent]\\" + fileName;
		}
		else if(rank <=5){
			path += "Level 5 [Non-urgent]\\" + fileName;
		}
		
	}
		/*if(UserInfo.reason.equals("Pain")){
			int rate = Integer.parseInt(UserInfo.rateA);
			if(rate >= 8){
				path += "Level 2 [Emergency]\\" + fileName;
				//8, 9, 10
			}
			else if(rate >= 6 && rate < 8){
				path += "Level 3 [Urgent]\\" + fileName;
				//6, 7
			}
			else if(rate >= 4 && rate < 6){
				path += "Level 4 [Semi-urgent]\\" + fileName;
				//4, 5
			}
			else if(rate >= 1 && rate < 4){
				path += "Level 5 [Non-urgent]\\" + fileName;
				//1, 2, 3
			}
		}
		else if(UserInfo.reason.equals("Illness")){
			int rate = Integer.parseInt(UserInfo.rateB);
			if(rate >= 8){
				path += "Level 2 [Emergency]\\" + fileName;
				//8, 9, 10
			}
			else if(rate >= 6 && rate < 8){
				path += "Level 3 [Urgent]\\" + fileName;
				//6, 7
			}
			else if(rate >= 4 && rate < 6){
				path += "Level 4 [Semi-urgent]\\" + fileName;
				//4, 5
			}
			else if(rate >= 1 && rate < 4){
				path += "Level 5 [Non-urgent]\\" + fileName;
				//1, 2, 3
			}
		}
		else if(UserInfo.reason.equals("Accident")){
			int rate = Integer.parseInt(UserInfo.rateC);
			if(rate >= 8){
				path += "Level 2 [Emergency]\\" + fileName;
				//8, 9, 10
			}
			else if(rate >= 6 && rate < 8){
				path += "Level 3 [Urgent]\\" + fileName;
				//6, 7
			}
			else if(rate >= 4 && rate < 6){
				path += "Level 4 [Semi-urgent]\\" + fileName;
				//4, 5
			}
			else if(rate >= 1 && rate < 4){
				path += "Level 5 [Non-urgent]\\" + fileName;
				//1, 2, 3
			}
		}
		else if(UserInfo.reason.equals("Other")){
			
		}
	}*/
	public static void sortDuration(){
		System.out.println("FileWriter: Duration");
		if(duration.equals("More than a month")||duration.equals("More than a week")) 
			{rank+=10;}
		else if(duration.equals("Three to four weeks")||duration.equals("Six to seven days"))
			{rank+=8;}
		else if(duration.equals("Two to three weeks")||duration.equals("Four to five days"))
			{rank+=6;}
		else if(duration.equals("One to two weeks")||duration.equals("Two to three days"))
			{rank+=4;}
		else if(duration.equals("Less than a week")||duration.equals("Less than a day"))
			{rank+=2;}
	}
	public static void writeFile(){
		try {
			file = new File(path);
			if(file.createNewFile()){
				System.out.println("FileWriter: created");
			}
			else{
				System.out.println("FileWriter: nope");
			}
			PrintWriter writer= new PrintWriter(path, "UTF-8");
			writer.println("Basic Information");
			writer.println("----------");
			writer.println("Name: "+ UserInfo.lN + ", " + UserInfo.fN + " " +UserInfo.mN);
			writer.println("Birthdate: " + UserInfo.birth);
			writer.println("Gender: " + UserInfo.gender);
			writer.println("Race: " + UserInfo.race);
			writer.println();
			writer.println("Contact Information");
			writer.println("----------");
			writer.println("Address: " + UserInfo.addr);
			writer.println("Email: " + UserInfo.email);
			writer.println("Phone number: " + UserInfo.num);
			writer.println();
			writer.println("Emergency Contact Information");
			writer.println("----------");
			writer.println("Name: " + UserInfo.eName);
			writer.println("Phone number: " + UserInfo.eNum);
			writer.println("Relation to patient: " + UserInfo.eRel);
			writer.println();
			writer.println("Insurance Information");
			writer.println("----------");
			writer.println("Insurance provider: " + UserInfo.insP);
			writer.println("Insurance holder: " + UserInfo.insH);
			writer.println("ID number: " + UserInfo.insID);
			writer.println("Coverage type: " + UserInfo.covC);
			writer.println("Relation to insurance holder: " + UserInfo.relC);
			writer.println();
			writer.println("Employment Information");
			writer.println("----------");
			writer.println("Occupation: " + UserInfo.occ);
			writer.println("Employer: " + UserInfo.emp);
			writer.println("Address: " + UserInfo.empAddr);
			writer.println("Phone Number: " + UserInfo.empNum);
			writer.println();
			writer.println("Primary Care Information");
			writer.println("----------");
			writer.println("Primary care physician: " + UserInfo.pcName);
			writer.println("Address: " + UserInfo.pcAddr);
			writer.println("Phone Number: " + UserInfo.pcNum);
			writer.println();
			writer.println("Medical profile");
			writer.println("----------");
			if(UserInfo.alYN.equals("Yes")){
				writer.println("Allergies: Yes, " + UserInfo.allergies);			
			}
			else{
				writer.println("Allergies: None");
			}
			if(UserInfo.medYN.equals("Yes")){
				writer.println("Current medications: " + UserInfo.meds);
			}
			else{
				writer.println("Current medications: None");
			}
			if(UserInfo.preexYN.equals("Yes")){
				writer.println("Preexisting conditions: " + UserInfo.preex);
			}
			else{
				writer.println("Preexisting conditions: None");
			}
			if(UserInfo.histYN.equals("Yes")){
				writer.println("Family history: " + UserInfo.hist);
			}
			else{
				writer.println("Family history: None");
			}
			writer.println("Pregnant: " + UserInfo.prYN);
			writer.println();
			writer.println("Visit Details");
			writer.println("----------");
			writer.println("Reason for visit: " + UserInfo.reason);
			if(UserInfo.reason.equals("Pain")){
				writer.println("Duration: " + UserInfo.durationA);
				writer.println("Location: " + UserInfo.locationA);
				writer.println("Level of pain: " + UserInfo.rateA);
			}
			else if(UserInfo.reason.equals("Illness")){
				setSympt(UserInfo.symptoms);
				writer.println("Duration: " + UserInfo.durationB);
				writer.println("Location: " + UserInfo.locationB);
				writer.println("Symptoms: " + symptoms);
				/*for(int i = 1; i < UserInfo.symptoms.size() - 1; i++){
					String symp = UserInfo.symptoms.get(i);
					writer.print(symp + ", ");
				}*/
				writer.println("Symptoms: " + symptoms);
				writer.print(UserInfo.symptoms.get(UserInfo.symptoms.size()-1));
				writer.println("Level of pain: " + UserInfo.rateB);
			}
			else if(UserInfo.reason.equals("Accident")){
				setSympt(UserInfo.symptLoc);
				writer.println("Location: " + UserInfo.locationC);
				writer.println("Level of pain: " + UserInfo.rateC);
			}
			else if(UserInfo.reason.equals("Other")){
				writer.println("Nature of incident: " + UserInfo.incidentD);
				writer.println("Duration: " + UserInfo.durationD);
			}
			writer.println();
			writer.println("Reccommended procedures and specialists: None applicable");
			writer.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void setSympt(ArrayList<String> al){
		for(int i = 1; i < al.size() - 1; i++){
			String symp = al.get(i);
			symptoms += symp + ", ";
		}
	}
}
