// Lab 2 submitted for credit for CSCI-232
// An implementation of Hash Table code
// Authors: Jason Armstrong, Anthony Fopp, Kenneth Beartusk
// Instructor: Dr. Qing Yang
//

import java.io.*; // for reader and other io classes

public class HashTableApp { // demonstrates hash tables using separate chaining of binary trees
	public static void main(String[] args) throws IOException {
	
		int[] longTestArray = {99, 1, 25, 4, 48, 52, 62, 55, 53, 91, 44, 12, 92, 88, 19, 68, 21, 
				9, 31, 64, 8, 61, 73, 42, 6, 38, 23, 84, 58, 5, 89, 85, 93, 45, 11, 97, 18, 14, 
				80, 47, 74, 87, 40, 28, 94, 20, 98, 46, 65, 3, 90, 34, 60, 83, 27, 50, 43, 69, 
				32, 33, 77, 35, 72, 51, 96, 39, 75, 54, 78, 57, 71, 37, 100, 10, 63, 30, 76, 
				24, 59, 17, 36, 29, 70, 26, 15, 13, 67, 95, 82, 41, 86, 56, 79, 49, 2, 81, 
				66, 7, 22, 16}; // random values 1 - 100 without repetition
		
//		int[] longTestArray2 = {73, 41, 82, 17, 35, 47, 65, 85, 19, 22, 55, 58, 29, 59, 98, 81, 
//				80, 56, 1, 84, 10, 88, 67, 14, 77, 36, 7, 93, 23, 69, 42, 62, 95, 30, 96, 45, 
//				70, 97, 92, 15, 32, 91, 46, 4, 48, 25, 37, 26, 2, 39, 8, 99, 71, 89, 100, 86, 
//				74, 60, 87, 79, 63, 72, 50, 24, 33, 18, 51, 68, 5, 20, 57, 53, 49, 78, 43, 44, 
//				21, 34, 12, 66, 76, 31, 6, 52, 11, 90, 16, 94, 40, 54, 27, 83, 28, 64, 3, 75, 
//				61, 9, 38, 13}; // another set of values for testing
		
//		int[] longTestArray3 = {32, 90, 41, 18, 16, 64, 34, 67, 73, 85, 12, 23, 93, 1, 80, 91, 
//				10, 37, 8, 63, 3, 44, 20, 42, 69, 56, 86, 57, 4, 27, 36, 17, 33, 54, 2, 81, 39, 
//				38, 50, 78, 47, 58, 62, 15, 74, 75, 24, 70, 51, 21, 68, 52, 59, 5, 82, 98, 55, 
//				19, 77, 66, 43, 92, 29, 97, 88, 71, 6, 72, 96, 79, 87, 11, 53, 22, 46, 89, 76, 
//				40, 31, 7, 30, 95, 9, 65, 94, 35, 26, 83, 49, 48, 99, 28, 100, 60, 13, 84, 45, 
//				25, 14, 61};  // another set of values for testing
		
		int value;
		
		while(true) {
			System.out.print("Enter size of hash table (1-100): ");
			int size = Integer.parseInt(getString());
			System.out.println("Size="+size); //debugging output
			HashTable hashT = new HashTable(size);	
			hashT.show(); // debugging output
			
			for (int i=0; i < size; i++) {
				System.out.println("For loop, i=" + i + ", longTestArray=" + longTestArray[i]); // debugging output
				hashT.insert(longTestArray[i]);
			}
			
			System.out.print("[s]how, [i]nsert, or [f]ind: ");
			int choice = getChar();
			switch(choice) {
			case 's': // Show
				hashT.show();
				break;
			case 'i': // Insert
				System.out.print("Enter value to insert: ");
				value = getInt();
				hashT.insert(value);
				break;
			case 'f': // Find
				System.out.print("Enter value to find: ");
				value = getInt();
				if(hashT.find(value) == true) {
					System.out.println("Found: " + value);
				}
				else
					System.out.println("Could not find " + value);
				break;
			case 'd': // Delete
				System.out.print("Enter value to delete: ");
				value = getInt();
				hashT.delete(value);
				break;
			default:
				System.out.print("Invalid entry: \n");
			} // end switch
		} // end while
	} // end main()
	
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
	
} // end class hashTable

