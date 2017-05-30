package index;

import java.util.ArrayList;

import javax.swing.*;

public class RateIndex {
	//Rate path A
	public static JRadioButton a = new JRadioButton("1");
	public static JRadioButton b = new JRadioButton("2");
	public static JRadioButton c = new JRadioButton("3");
	public static JRadioButton d = new JRadioButton("4");
	public static JRadioButton e = new JRadioButton("5");
	public static JRadioButton f = new JRadioButton("6");
	public static JRadioButton g = new JRadioButton("7");
	public static JRadioButton h = new JRadioButton("8");
	public static JRadioButton i = new JRadioButton("9");
	public static JRadioButton j = new JRadioButton("10");
	//Rate path B
	public static JRadioButton ab = new JRadioButton("1");
	public static JRadioButton bb = new JRadioButton("2");
	public static JRadioButton cb = new JRadioButton("3");
	public static JRadioButton db = new JRadioButton("4");
	public static JRadioButton eb = new JRadioButton("5");
	public static JRadioButton fb = new JRadioButton("6");
	public static JRadioButton gb = new JRadioButton("7");
	public static JRadioButton hb = new JRadioButton("8");
	public static JRadioButton ib = new JRadioButton("9");
	public static JRadioButton jb = new JRadioButton("10");
	//Rate path C
	public static JRadioButton ac = new JRadioButton("1");
	public static JRadioButton bc = new JRadioButton("2");
	public static JRadioButton cc = new JRadioButton("3");
	public static JRadioButton dc = new JRadioButton("4");
	public static JRadioButton ec = new JRadioButton("5");
	public static JRadioButton fc = new JRadioButton("6");
	public static JRadioButton gc = new JRadioButton("7");
	public static JRadioButton hc = new JRadioButton("8");
	public static JRadioButton ic = new JRadioButton("9");
	public static JRadioButton jc = new JRadioButton("10");
	
	public static void fillA(ArrayList<JRadioButton> list){
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		list.add(g);
		list.add(h);
		list.add(i);
		list.add(j);
	}
	
	public static void fillB(ArrayList<JRadioButton> list){
		list.add(ab);
		list.add(bb);
		list.add(cb);
		list.add(db);
		list.add(eb);
		list.add(fb);
		list.add(gb);
		list.add(hb);
		list.add(ib);
		list.add(jb);
	}
	
	public static void fillC(ArrayList<JRadioButton> list){
		list.add(ac);
		list.add(bc);
		list.add(cc);
		list.add(dc);
		list.add(ec);
		list.add(fc);
		list.add(gc);
		list.add(hc);
		list.add(ic);
		list.add(jc);
	}
	
}
