package wtf2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Skolklass {
	
	ArrayList<String> firstNamesFirst = new ArrayList<String>();
	ArrayList<String> LastNamesFirst = new ArrayList<String>();
	
	Skolklass(){
		

		
	}
 	
	Skolklass(File file) throws FileNotFoundException{
		
		Scanner fileReader = new Scanner(file);
		
		while(fileReader.hasNextLine()) {
			
			String name = fileReader.nextLine();
			
			firstNamesFirst.add(name);
			
			int spaceIndex = name.indexOf(" ");
			String lastNames = name.substring(spaceIndex+1);
			String firstNames = name.substring(0, spaceIndex);
			name = lastNames + " " + firstNames;
			
			LastNamesFirst.add(name);
			
			
		}
		
	}

	
	public void printFirstNameFirst() {
		
		Collections.sort(firstNamesFirst);
		
		for (String namn : firstNamesFirst) {
			System.out.println(namn);
		}
	}
	
	
public void printlastNameFirst() {
		
		Collections.sort(LastNamesFirst);
		
		for (String namn : LastNamesFirst) {
			System.out.println(namn);
		}
	}
	public void randomGroups(int groupSize) {
		Collections.shuffle(LastNamesFirst);
		
		
	}
}
