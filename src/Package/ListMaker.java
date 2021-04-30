package Package;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.Scanner;
//import java.util.Random;

public class ListMaker {
	
	private static ArrayList<String> X = new ArrayList<String>();
	private static Collection<String> Coll = X;

	public void AddColl(String NewPrompt) {
		Coll.add(NewPrompt);
	}
	
	public ArrayList<String> getX() {
		return X;
	}







}
