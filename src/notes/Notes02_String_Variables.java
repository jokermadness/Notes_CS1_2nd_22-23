package notes;

public class Notes02_String_Variables {

	public static void main(String[] args) {
		
		/*
		 * All variables need 3 pieces of info
		 * 
		 * 1 - type (declaring)
		 * 2 - name (declaring)
		 * 3 - stargin value (initializing)
		 */
		
		//derclaring a String variable
		String address;
		String name;  
		
		//initializing (1st value)
		address = "1300 Pennsylvania Ave.";
		name = "Jack";
		
		//declare and initialize in 1 row
		String place = "New Tech High @ Coppell";
		
		System.out.println(address);
		System.out.println(name);
		System.out.println(place);
		System.out.println();
		
		name = "Willikins";
		
		System.out.println(address);
		System.out.println(name);
		System.out.println(place);
		
		System.out.println();

		
		System.out.println(name + " lives at " 
				+ place + " with the address: " 
				+ address);
		
		
		
		
	}

}
