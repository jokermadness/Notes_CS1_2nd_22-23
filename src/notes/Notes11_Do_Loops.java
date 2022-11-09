package notes;

import java.util.Scanner;

/*
 *  Notes: Do Loops
 * 
 *  It's a while loop that always 
 *  runs at least once
 *  
 *  
 */

public class Notes11_Do_Loops {

	public static void main(String[] args) {
		
		int x = 5;
		
		do {
			
			System.out.println("It's Still Printing Once!!");
			
		} while (x == 7);
		
		System.out.println("\n\n");
		
		/*
		 * Loop until user says "hi" (not case sensitive)
		 */
		
		String input = "hi";
		Scanner inKey = new Scanner(System.in);
		
		do {
			
			System.out.print("Hey there!!! ");
			input = inKey.nextLine();
			
		} while (!input.equalsIgnoreCase("hi"));
		
		
		System.out.println("\n\nFin...\n\n");
		
		/*
		 * Same but with a while loop
		 */
		
		System.out.print("Hey there!!! ");
		input = inKey.nextLine();
		
		while (!input.equalsIgnoreCase("hi")) {
			
			System.out.print("Hey there!!! ");
			input = inKey.nextLine();
			
		} 
		
		
		System.out.println("\n\nFin...");
		
	}
	
	
	
	
	
}
