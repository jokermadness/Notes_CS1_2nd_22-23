package notes;

/*
 * Data Types and Operators
 * 
 * Data Types
 * 	
 * 	 int = integer (32 bit)
 * 		whole numbers from - to + 2.14billion
 * 		Remember: Integer Division drops decimals
 * 		(long = 64 bit)
 * 
 * 	 double = decimal (64 bit)
 * 		15 numbers with the decimal that
 *            floats wherever it's needed
 * 
 * Operators
 * 	 + add
 * 	 - subtract
 *   * multiply
 *   / divide
 *   % modulus (divide, but takes the remainder)
 * 
 * 
 */

public class Notes04_DataTypes_and_Operators {

	public static void main(String[] args) {
		
		// declaring ints and doubles
		int num1 = 65;
		double num2 = 5.216;
		
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 + "\n");
		
		
		num1 = num1 * 2;
		num2 = num2 / 4;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 + "\n");
		
		
		int num3 = num1 % 50;
		num1 = num1 / 50;   //Integer Division!!!
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3 + "\n");
		
		
	}

}
