package notes;

/*
 * Notes If Statements
 * 
 * 
 * Operators Discussed
 *    && - and
 *         Returns true if BOTH left and right sides are true
 *    || - or
 * 		   Returns true if EITHER left or right side is true
 * 
 * 
 * Precedence (Order of Operation)
 *    () are always first
 *    && is before ||
 *    
 * 
 * 
 * Evaluating Ranges (see last problems in program)
 * 
 *    x is between 10 and 15 
 *         x > 10 && x < 15
 * 
 *    x is outside of 10 and 15
 *         x < 10 || x > 15
 */

public class Notes07_Ifs_MoreComplex {

	public static void main(String[] args) {
		
		int a = 1, b = 5, c = 25;
		
		
		/*
		 * And Statements  &&
		 *   Both sides must be true
		 */
		
		//#1
		if (a == 1 && b == 10) {
			//false because right side is false
			System.out.println("#1: a");
		}
		else if (a == 1 && b == 5) {
			//true because BOTH sides are true
			System.out.println("#1: b");
		}
		else {
			//doesn't run because previous if was true
			System.out.println("#1: c");
		}
		System.out.println();
		
		
		//#2
		//&& chains
		//ALL must be true
		if (a == b && b == 5 && c == 25) {
			//false because a != b
			System.out.println("#2: a");
		}
		else if (a == 1 && b == 3 && c == 25) {
			//false because b != 3
			System.out.println("#2: b");
		}
		else if (a == 1 && b == 5 && c == 20) {
			//false because c != 20
			System.out.println("#2: c");
		}
		else if (a == 1 && b == 5 && c == 25) {
			//true because ALL THREE are true 
			System.out.println("#2: d");
		}
		else {
			//doesn't run because previous if was true
			System.out.println("#2: e");
		}
		System.out.println();
		
		
		
		/*
		 * Or Statements  ||
		 *   Only 1 side needs to be true
		 */
		
		//#3
		if (a == b || b == 15) {
			//false because BOTH are false
			System.out.println("#3: a");
		}
		else if (a == 1 || b == 15) {
			//true because the left side is true
			System.out.println("#3: b");
		}
		else if (a == 10 || b == 5) {
			//true, because right side is true
			//but it doesn't run because previous if was true
			System.out.println("#3: c");
		}
		else if (a == 1 || b == 5) {
			//true, because both sides are true
			//but it doesn't run because previous if was true
			System.out.println("#3: d");
		}
		else {
			//doesn't run because previous if was true
			System.out.println("#3: e");
		}
		System.out.println();
		
		
		
		//#4
		//|| chains
		//Only 1 must be true
		if (a == 5 || b == 7 || c == 12) {
			//false because all 3 are false
			System.out.println("#4: a");
		}
		else if (a == 5 || b == 7 || c == 25) {
			//true because c == 25
			System.out.println("#4: b");
		}
		else {
			//doesn't run because previous if was true
			System.out.println("#4: c");
		}
		System.out.println();
		
		
		
		
		
		/*
		 * Mixed Statements
		 *   && is checked before ||
		 *   
		 * Hint:
		 *   1st evaluate each small expression
		 *   2nd then the && statement(s)
		 *   3rd then the || statement(s)
		 *   
		 * && and || can be combined in a MILLION ways.
		 * These are just a few examples
		 */
		
		//#5
		if (a == 5 && b == a || c == 25 && b * 5 == c) {
			//true &&  false ||  true   &&    true
			//    false      ||        true
			//              true
			
			//this evaluates to true
			
			System.out.println("#5: true\n");
		}
		
		
		//#6
		if (a == 5 && b == a || c == 12 && b * 5 == c) {
			//true &&  false ||  false   &&    true
			//    false      ||         false
			//              false
			
			//this evaluates to false
			
			System.out.println("#6: true\n");
		}
		else { 
			System.out.println("#6: false\n"); 
		}
		
		
		//#7
		if (a == 5 && b == a || c == 12 && b * 5 == c || b < c && c >= b * 5) {
			//true &&  false ||  false   &&    true   ||  true &&   true
			//    false      ||         false         ||      true
			//                          true
			
			//this evaluates to true
			
			System.out.println("#7: true\n");
		}
		else { 
			System.out.println("#7: false\n"); 
		}
		

		//#8
		//Parenthesis are ALWAYS 1st
		if (a == 5 && (b == a || c == 12) && b * 5 == c) {
			//true && (false  ||  false ) &&    true
			//true &&         false       &&    true
			//              false
			
			//this evaluates to false
			
			System.out.println("#8: true\n");
		}
		else { 
			System.out.println("#8: false\n"); 
		}
		
		
		
		
		
		/*
		 * Evaluating Ranges
		 * 
		 * x is between 10 and 15 
		 *     use && since it MUST be both
		 * 	   x > 10 && x < 15
		 * 
		 * x is outside of 10 and 15
		 *     use || since it CAN'T be both
		 *     x < 10 || x > 15
		 */
		int d = 12;
		
		
		//#9
		//is d between 5 and 15 exclusive? (not including the ends) 
		if (d > 5 && d < 15) {
			System.out.println("#9: true\n");
		}
		else { 
			System.out.println("#9: false\n"); 
		}

		
		//#10
		//is d between 1 and 10 inclusive? (including the ends) 
		if (d >=1 && d <= 10) {
			System.out.println("#10: true\n");
		}
		else { 
			System.out.println("#10: false\n"); 
		}
		
		
		//#11
		//is d outside of 20 and 30 exclusive? (not including the ends)
		if (d < 20 || d > 30) {
			System.out.println("#11: true\n");
		}
		else { 
			System.out.println("#11: false\n"); 
		}
		
		
	}

}
