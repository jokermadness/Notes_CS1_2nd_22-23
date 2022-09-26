package notes;

/*
 * Notes: If Statements
 * 
 * If the condition is
 * 	  TRUE = the code block runs
 *    FALSE = the code block does not run
 * 
 * 
 * Operators
 * 	  ==  check if equals
 *    !=  Not equals
 *    >   greater than
 *    >=  greater than or equal to
 *    <   less than
 *    <=  less than or equal to
 *      
 * STRINGS!!!!
 *    .equals()  for comparing Strings
 *               <String>.equals(<String>)
 * 
 */




public class Notes06_If_Statements {

	public static void main(String[] args) {
		
		int a = 5, b = 15, c = 95;
		String name1 = "Jeremy";
		String name2 = new String("Jeremy");
		String name3 = "jeRemy"; 
		String name4 = "Willikins";
		
		//basic if statement
		//if (<condition statement>)
		if (a == 5) {
			System.out.println("a = 5\n");
		}
		
		//else?
		if (b == 14) {
			System.out.println("b = 14\n");
		}
		else {
			System.out.println("b does not = 14\n");
		}
		
		//Not Equals
		if (a != b) {
			System.out.println("a != b\n");
		}
		else {
			System.out.println("a == b\n");
		}
		
		//is b divisible by a?
		if (b % a == 0) {
			System.out.println("Yes b % a == 0\n");
		}
		else {
			System.out.println("No b % a != 0\n");
		}
		
		
		
		//check if it's even
		if (b % 2 == 0) {
			System.out.println("Yes, b is even\n");
		}
		else {
			System.out.println("No, b is not even\n");
		}
		
		
		
		
		/*
		 * Else If
		 */
		if (b == 5) {
			System.out.println("b = 5\n");
		}
		else if (b == 9) {
			System.out.println("b = 9\n");
		}
		else if (b == 15) {
			System.out.println("b = 15\n");
		}
		else if (b / a == 3) {
			System.out.println("b / a = 3\n");
		}
		
		
		/*
		 * comparing strings
		 * 
		 */
		if (name1.equals(name2)) {
			System.out.println("name1 = Jeremy\n");
		}
		else {
			System.out.println("name1 != Jeremy\n");
		}
		
		if ("Willikins".equals(name4)) {
			System.out.println("Good 'ol Willikins\n");
		}
		else {
			System.out.println("Bad 'ol Willikins\n");
		}
		
		
		
		
		
		
		
		
		System.out.println("\nFin!");
		
		
	}

}

















