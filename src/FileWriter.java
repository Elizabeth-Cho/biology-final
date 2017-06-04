import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {
	private static String fileName = UserInfo.lN + UserInfo.fN + UserInfo.mN + ".txt";
	private static File file;
	private static String path = "c:\\Users\\zergl\\workspace\\biology-final\\src\\files\\" + fileName;
	
	public static void writeFile(){
		try {
			file = new File(path);
			if(file.createNewFile()){
				System.out.println("created");
			}
			else{
				System.out.println("nope");
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
			writer.println("Reason for visit: ");
			writer.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
