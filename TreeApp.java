// Lab 1 submitted for credit for CSCI-232
// And implementation of Huffman code
// Authors: Jason Armstrong, Anthony Fopp, Kenneth Beartusk
// Instructor: Dr. Qing Yang
//

import java.io.*; // for reader and other io classes

class TreeApp {
	public void main () throws IOException { //main(String[] args) throws IOException
		int value;
		Tree theTree = new Tree();
		theTree.insert(50, 'a');
		theTree.insert(25, 'b');
		theTree.insert(75, 'c');
		theTree.insert(12, 'd');
		theTree.insert(37, 'e');
		theTree.insert(43, 'f');
		theTree.insert(30, 'g');
		theTree.insert(33, 'h');
		theTree.insert(87, 'i');
		theTree.insert(93, 'j');
		theTree.insert(97, 'k');
		while(true) {
			System.out.println("Enter a command from below using the first letter. ");
			System.out.print("[i]nsert, [f]ind, [d]elete, or [t]raverse: ");
			int choice = getChar();
			switch(choice) {
			case 's': 
				theTree.displayTree();
				break;
			case 'i': // Insert
				System.out.print("Enter value to insert: ");
				value = getInt();
				theTree.insert(value, 'a');
				break;
			case 'f': // Find
				System.out.print("Enter value to find: ");
				value = getInt();
				Node found = theTree.find(value);
				if(found != null) {
					System.out.print("Found: ");
					found.displayNode();
					System.out.print(" when searching for: ");
				}
				else
					System.out.print("Could not find ");
				System.out.print(value + "\n");
				break;
			case 'd': // Delete
				System.out.print("Enter value to delete: ");
				value = getInt();
				boolean didDelete = theTree.delete(value);
				if(didDelete)
					System.out.print("Deleted " + value + "\n");
				else
					System.out.print("Could not delete ");
				System.out.print(value + "\n");
				break;
			case 't': // Traverse
				System.out.println("Enter traversal method (1, 2 or 3), ");
				System.out.print("[1]Preorder traversal, [2]In-Order traversal or [3]Post-order traversal: ");				
				value = getInt();
				theTree.traverse(value);
				break;
			default:
				System.out.print("Invalid entry: \n");
			} // end switch
		} // end while
	} // end main()

	public String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

	public int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
} // end class TreeApp
