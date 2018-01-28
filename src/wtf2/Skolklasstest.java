package wtf2;

import java.io.File;
import java.io.FileNotFoundException;

public class Skolklasstest {
	
	public static void main(String []args) throws FileNotFoundException {
		
		Skolklass  te16c = new Skolklass(new File("namelist.txt"));
		
		te16c.firstNamesFirst.add("");
		te16c.printFirstNameFirst();
		
	}

}
