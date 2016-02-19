// Lab 1 submitted for credit for CSCI-232
// And implementation of Huffman code
// Authors: Jason Armstrong, Anthony Fopp, Kenneth Beartusk
// Instructor: Dr. Qing Yang
//

class Node {
	public int iData; // data item (key)
	public char dData; // data item
	public Node leftChild; // this node's left child
	public Node rightChild; // this node's right child
	

	public void displayNode() { // display ourself
		System.out.print('{');
		System.out.print(iData);
		System.out.print(", ");
		System.out.print(dData);
		System.out.print("} ");
	}
} // end class Node