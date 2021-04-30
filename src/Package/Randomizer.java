package Package;

import java.util.ArrayList;
import java.util.Random;

public class Randomizer {
	private ArrayList<String> List;
	private Random rand = new Random();
	private int i;
	private static String Prompt1;
	private static String Prompt2;
	private static String Prompt3;
		
	public void SetList(ArrayList<String> List) {
		this.List = List;
		i = List.size();
	}
		
	public void Randomize() {
		int R1= rand.nextInt(i);
		int R2= rand.nextInt(i);
		if (R2 == R1) {
			R2= rand.nextInt(i);
		}
		int R3= rand.nextInt(i);
		if (R3 == R1 || R3 == R2) {
			R3= rand.nextInt(i);
		}
		Prompt1 = List.get(R1);
		Prompt2 = List.get(R2);
		Prompt3 = List.get(R3);
	}
	
	public String getPrompt1() {
		return Prompt1;
	}
	public String getPrompt2() {
		return Prompt2;
	}
	public String getPrompt3() {
		return Prompt3;
	}
}
