package Package;

import java.util.ArrayList;
import java.util.Collection;

public class Lists {
	//Creating 5 array lists
	private ArrayList<String> List1 = new ArrayList<String>();
	private ArrayList<String> List2 = new ArrayList<String>();
	private ArrayList<String> List3 = new ArrayList<String>();
	private ArrayList<String> List4 = new ArrayList<String>();
	private ArrayList<String> List5 = new ArrayList<String>(); 
	
	
	public void SetList(ArrayList<String> Prompts) {
		if(List1.isEmpty() == true) {
			List1 = Prompts;
		} else if (List2.isEmpty() == true) {
			List2 = Prompts;
		} else if (List3.isEmpty() == true) {
			List3 = Prompts;
		} else if (List4.isEmpty() == true) {
			List4 = Prompts;
		} else {
			List5 = Prompts;
		}
	}
	
	public ArrayList<String> getArray1() {
		return List1;
	}
	public ArrayList<String> getArray2() {
		return List2;
	}
	public ArrayList<String> getArray3() {
		return List3;
	}
	public ArrayList<String> getArray4() {
		return List4;
	}
	public ArrayList<String> getArray5() {
		return List5;
	}
	
}
