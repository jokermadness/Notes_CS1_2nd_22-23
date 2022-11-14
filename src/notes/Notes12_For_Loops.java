package notes;

/*
 * Notes: For Loops
 * 
 * 
 * for (<starting point>; <condition>; <update>){
 * 
 * 		//code block
 * 
 * }
 * 
 * 
 * 
 */


public class Notes12_For_Loops {

	public static void main(String[] args) {
		
		
		//print 0-10 with spaces
		
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		
		
		//print 50 to 0 by 5s
		
		for (int i = 50; i >= 0; i -= 5) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		
		
		
		/*
		 * create 20 random numbers, but only
		 * print the odds
		 */
		
		int num = 0;
		int count = 0;
		//loops 20 times
		for (int i = 0; i < 20; i++) {
			//random num from 1 to 87
			num =  (int) (Math.random() * 87) + 1; 
			
			//check if it's odd
			if (num % 2 != 0) {
				System.out.print(num + " ");
				count++;
			}
			
		}
		System.out.println("\nWe got " + count + " odd numbers.\n");
		
		
		
		
		/*
		 * Turn this while loop into a for loop
		 */
		int j = 1000;
		while (j > 0) {
			System.out.print(j + " ");
			j /= 2;
		}
		System.out.println("");
		
		//as a for loop
		for (int i = 1000; i > 0; i /= 2) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("..fin...");
		
		
		
		
		
	}

}
