package notes;

/*
 * Notes printf() = print format
 * 
 * printf(<String>, args...)
 *    <String> = The string you want to print with specifier
 *    args = the variable(s) you want to print in the String
 *    
 * 
 * Specifier
 *    %[flags][width][.precision]conversion-character
 * 
 * 	  - Bracketed items are optional
 * 
 * Flags
 *    - : left-justify the variable (default is to right-justify)
 *    + : adds a plus (+) or minus (-) to the numerical value (all negatives get a minus)
 *    0 : forces all values to be zero-padded (add zeros to left of number) (default is blanks)
 *    , : adds commas to large numbers (numbers >= 1,000)
 *      : space will display a minus sign if negative or space if positive
 * 	
 * Width = Specifies how many characters to use.
 * 
 * .precesion = what to round to
 * 
 * 
 * Conversion Characters
 *    What kind of variable are you printing?
 *    d : decimal integer (int, long)
 *    f : floating-point number (float, double)
 *    c : char – Capital C will uppercase the letter
 *    s : string – Capital S will uppercase all letters in the string
 *    h : hashcode – prints the memory reference for the variable
 *    n : newline – printf() specific newline character- use %n instead of \n
 *    %% : Use this to print a percent (or \% works as well). Otherwise it expects a variable.
 * 
 * 
 * 
 */

public class Notes05_printf {
	
	public static void main(String[] args) {
		
		String first = "Fred", last = "Jones";
		int x = 5, y = 15, z = 123345678;
		double a = 10.5, b = 2.57392857292, c = 2435.95709234;
		
		//Basic printf
		System.out.printf("%s is %dft tall.\n", first, x);
		//what about a decimal?
		System.out.printf("%s is %.1fft tall.\n", last, b);
		
		//Can you do math in them?
		System.out.printf("b * c = %.3f%n", b * c);
		
		
		/*
		 * Containing the width of something
		 */
		System.out.printf("%-8s  %-8s  %-8s  \n", "Line 1", "Line2", "Line 3");
		System.out.printf("%-10d%-10.3f%-10d\n", z, c, x);
		System.out.printf("%-10.3f%-10d%-10d\n", c, x, z);
		System.out.printf("%-10d%-10d%-10.3f\n", x, z, c);
		
	}
}
