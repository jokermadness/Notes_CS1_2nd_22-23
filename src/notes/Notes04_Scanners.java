package notes;

import java.util.Scanner;

public class Notes04_Scanners {
	public static void main(String[] args) {
		/*
		 * Scanner
		 * 
		 * This is how we take input from the anything
		 * - keyboard
		 * - mouse
		 * - file
		 * 
		 * 
		 * 2 parts
		 * 		1 - create the Scanner object (only once)
		 * 		2 - use the object to scan as many times necessary
		 * 
		 * 
		 * .next() - grabs up to a space or return
		 * .nextLine() - grabs up to a return
		 */
			
		
		//ONCE ONLY!!!
		Scanner inKey = new Scanner(System.in);
		
		
		//Prompt
		System.out.print("Enter Favorite Barbie Movie: ");
		//Scan
		String favoriteMovie = inKey.nextLine();
		//Use it
		System.out.println("You really like " + favoriteMovie + 
				"?  \nI knew something was wrong with you!!");
		
		
		//DO NOT RECREATE THE SCANNER!!!
		//Unless you're in a new method
		
		
		System.out.println();
		//Prompt
		System.out.print("What did Willikins do that got him killed? ");
		//Scan
		String greatDeath = inKey.nextLine();
		//Use it
		System.out.println("He really " + greatDeath + "?");


		

	}
}
