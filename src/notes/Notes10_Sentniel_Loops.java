package notes;

import java.util.Scanner;

/*
 * Sentinel Controlled Loops
 * And Counters
 * 
 * Loops that are NOT a specific number of iterations.
 * They are stopped either at random or by a user.
 * 
 */

public class Notes10_Sentniel_Loops {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		
		
		
		/*
		 * add user inputs till they enter a 0
		 * and count the number of inputs (including the 0)
		 */
		int input = -1;
		int sum = 0;
		
		while (input != 0) {
			System.out.print("Enter an integer: ");
			input = inKey.nextInt();
			sum = input + sum;  //sum += input;
		}
		System.out.println("Total Entered = " + sum + "\n");
		
		
		/*
		 * Print random numbers from 1 to 50 until you get 25
		 * 
		 * And...
		 * Count the number of numbers generated
		 */
		int randNum = 0;
		boolean keepGoing = true;
		int count = 0;  //keeps track of iterations
		
		//to track max and min
		int max = 0;
		int min = 100;
		
		
		while (keepGoing) {
			//create random number
			randNum = (int) (Math.random() * 50) + 1;
			System.out.println(randNum);
			
			//track max and min
			max = Math.max(randNum, max);
			min = Math.min(randNum, min);
			
			//check if it's 25
			if (randNum == 25) {
				keepGoing = false;
			}
			count++;
		}
		System.out.println("Count = " + count);
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
		
		System.out.println("\nfin...");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
