package notes;

import java.util.Scanner;

/*
 * Notes Accumulation
 * 
 * Define:
 *    Gather a set of information into a single 
 *    variable using loops.  These can be numerical
 *    or text accumulations.
 *    
 *    
 *    
 *    
 *    
 */


public class Notes09_Accumulation {

	public static void main(String[] args) {
		
		/*
		 * The sum of all integers less than 10
		 */
		
		
		int sum = 0;  //a variable to collect data into
		int i = 9; //iterating variable
		
		while (i >= 0) {
			sum += i; //sum = sum + i;
			i--;
		}
		System.out.println("Sum of ints < 10 = " + sum + "\n");
		
		
		
		
		/*
		 * Add inputs till user enters 10
		 */
		Scanner inKey = new Scanner(System.in);
		sum = 0;
		int input = 0;
		
		while (input != 10) {
			System.out.print("Enter a number: ");
			input = inKey.nextInt();
			
			sum += input;
		}
		
		
		System.out.println("Input total = " + sum + "\n");
		
		
		
		
	}

}
