package index;

import java.net.URL;

import javax.swing.*;

public class ImageIndex {
	//test and screwing around
	public static ImageIcon frog = createImageIcon("/images/frog.jpg");
	public static ImageIcon fire = createImageIcon("/images/lit.jpg");
	public static ImageIcon potate = createImageIcon("/images/potato.jpg");
	//progress
	
	//questions
	
	//responses and buttons
	
	private static ImageIcon createImageIcon(String path) {
		URL resource = Icon.class.getResource("/images/" + path);
		if (resource == null) {
			return null;
		}
		return new ImageIcon(resource);
	}
	
	/*public static ImageIcon createImageIcon(String path, String description)
	{
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null)
		{
			return new ImageIcon(imgURL, description);
		}
		else
		{
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}*/
}
