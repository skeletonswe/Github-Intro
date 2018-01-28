package wtf2;

import java.util.ArrayList;


public class adad {

	public static void main(String[] args) {
		
		
			ArrayList<String> arrlist = new ArrayList<String>();
		
			arrlist.add("hej");
			
			System.out.println(arrlist);
			
			if(arrlist.contains("hej")) {
				System.out.println("Hej finns!");
				
				arrlist.remove("hej");
				System.out.println(arrlist.toString());
				
				
	
			}
		
	}
}
