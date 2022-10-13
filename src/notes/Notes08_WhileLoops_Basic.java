package notes;

import java.util.Scanner;

/*
 * Notes While Loops
 * 
 * Basically, the code block loops while
 * the condition is true.
 * 
 * 
 * Parts:
 * 
 *    while (<condition>) {  // NO SEMICOLON!!!
 *    
 *    	 //code block
 *    	 //include an update for 
 *       //the condition variable(s)
 *    	 
 *    }
 * 
 * 
 * Numerically controlled
 * 
 * 	 int i = 0	
 * 
 *   while (i < 10){
 *   	//code block
 *   	
 *   	i++;  //update condition variable
 *   }
 * 
 * Boolean controlled
 * 
 * 	 boolean isDone = false
 * 
 * 	 while (!isDone){
 * 		if (<condition>){
 * 			isDone = true;
 * 		}
 * 	 }
 * 
 * 
 */


public class Notes08_WhileLoops_Basic {

	public static void main(String[] args) {
		
		
		int i = 0;
		
		while (i <= 10) {
			
			System.out.print(i + " ");
			
			i++; //increace i by 1
		}
		
		System.out.println("\n");
		
		
		//count by 2s
		i = 0;
		while (i <= 10) {
			
			System.out.print(i + " ");
			
			i += 2; //increace i by 2
		}
		System.out.println("\n");
		
		
		
		
		// count by 5s from 50 to -50 inclusive
		i = 50;
		while (i >= -50) {

			System.out.print(i + " ");

			i -= 5; // decrease i by 5
		}
		System.out.println("\n");
		
		
		
		
		// count by 5s from 50 to 0 inclusive
		i = 1000;
		while (i > 0) {

			System.out.print(i + " ");

			i /= 2; // decrease i by 5
		}
		System.out.println("0\n");

		
		
		
		/*
		 * Boolean Controlled
		 */
		Scanner inKey = new Scanner(System.in);
		
		boolean saidYes = false;
		System.out.println("Willikins is heartbroken...");
		while (!saidYes) {
			System.out.print("Will you marry him? ");
			String input = inKey.next();
			
			if (input.equalsIgnoreCase("yes")
					|| input.equalsIgnoreCase("yes!")
					|| input.equalsIgnoreCase("fine")) {
				saidYes = true;
			}
			
		}
		
		System.out.println("YAAAAAAAYYYYYYY!!!!!");
		
		
	}

	
	
	
}
