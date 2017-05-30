import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {
	private static String fileName = UserInfo.name + ".txt";
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
			writer.println("Hello");
			writer.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
