// Lab 2 submitted for credit for CSCI-232
// An implementation of Hash Table code
// Authors: Jason Armstrong, Anthony Fopp, Kenneth Beartusk
// Instructor: Dr. Qing Yang
//
public class HashTable { // demonstrates hash tables using separate chaining of binary trees
	private Tree[] treeArray;
	private int size;
	
	// -------------------------------------------------------------
	public HashTable(int sizeIn) { // constructor
		size = sizeIn;
		treeArray = new Tree[size];
	}
	//-------------------------------------------------------------

	public void show() {
		for (int i = 0; i < size; i++) {
			System.out.println(i+". ");
			treeArray[i].displayTree();
		}
	} // end method: insert

	public void insert(int value) {
		System.out.println("inserting: value="+value+", treeArray.length="+treeArray.length+", value % treeArray.length="+(value % treeArray.length)); // debugging output
		int index = value % treeArray.length;
		System.out.println("remainder checks out"); // debugging output
		treeArray[index].insert(value);
		System.out.println("insert function passed"); // debugging output		
	} // end method: insert

	public boolean find(int value) {
		int index = value % treeArray.length;
		if (treeArray[index].find(value) == null) {
			return false;
		} else return true;
	} // end method: search

	public void delete(int value) { // for extra credit, if there is time (although it's a point to FINAL grade!
  
	} // end method: delete
  
} // end class hashTable

