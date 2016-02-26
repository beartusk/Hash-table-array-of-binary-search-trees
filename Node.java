// Lab 2 submitted for credit for CSCI-232
// An implementation of Hash table code
// Authors: Jason Armstrong, Anthony Fopp, Kenneth Beartusk
// Instructor: Dr. Qing Yang
//

class Node {
	public int iData; // data item (key)
	public Node leftChild; // this node's left child
	public Node rightChild; // this node's right child
	

	public void displayNode() { // display ourself
		System.out.print('{');
		System.out.print(iData);
		System.out.print("} ");
	}
} // end class Node
