
/**
 * Tree class for TreeNode class
 * 
 * @author Alfie Hippisley
 * @version 03/03/2018
 */

public class Tree {
	
	// Initialise variables
	private TreeNode root;
	
	//TODO DELTE ME
	int indent;
	
	/**
	 * Constructor for objects of class Tree
	 * Creates the root of the Tree
	 */
	
	public Tree() {
		root = null;
	}
	
	public TreeNode getRoot() {
		return root;
	}
	
	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	public boolean addToTree(int studentNumber, int studentMark, String studentName) {

		// Store the student data being passed into the new node and create left and right nulls
		TreeNode newNode = new TreeNode(studentNumber, studentMark, studentName);
		
		TreeNode currentNode = root;
		TreeNode previousNode = null;
		
		boolean placedNode = false;
		
		// If the root is null then the tree must be empty
		if(root == null) {
			root = newNode;
			placedNode = true;
		}
		
		else {
			
			// If this node already is in the tree return false
			if(findInTree(studentNumber) != null) {
				return false;
			}
			
			// We now know its not already in the tree and the tree is not empty
			else {
			
				while(currentNode != null) {
					
					previousNode = currentNode;
					
					
					if(newNode.getStudentNumber() < currentNode.getStudentNumber()) {
						currentNode = currentNode.getLeft();
					}
						
					else {
						currentNode = currentNode.getRight();
					}
				}		
				
				if(newNode.getStudentNumber() < previousNode.getStudentNumber()) {
					newNode = previousNode.getLeft();
				}
				
				else {
					newNode = previousNode.getRight();
				}
				
				placedNode = true;
			}
		}
		// Return the status of if node has been placed or not
		return placedNode;
	}
	
	public TreeNode findInTree(int studentNumber) {
		
		// Store if node has been found
		boolean foundNode = false;

		// Marker node
		TreeNode markerNode = new TreeNode();
		
		// Start at root of tree
		markerNode = root;
		
		// While their are still nodes to check,
		while(markerNode != null && foundNode == false) {
			
			// Does the current node match the node we are looking for?
			if(markerNode.getStudentNumber() == studentNumber){
				foundNode = true;
			}
			
			// If the current nodes studentNumber is greater than what we want, go down left
			else if(markerNode.getStudentNumber() > studentNumber) {
				markerNode = markerNode.getLeft();
			}
			
			// We then assume the current nodes studentNumber is greater than what we want so we go down right
			else if(markerNode.getStudentNumber() < studentNumber) {
				markerNode = markerNode.getRight();
			}
			
			else {
				System.out.println("help");
			}
		}
		
		// If we found the node then return what we have stored
		if(foundNode == true) {
			return markerNode;
		}
		
		// If we did not find the node then return nothing
		else {
			return null;
		}
	}
	
	public void printTree() {
		
	}
	
	public void traverseTree(TreeNode upto) {
		
		// Start at the root
		TreeNode markerNode = root;
		
		// Traverse left sub tree
		markerNode = root.getLeft();
		
		// Consider the root of the subtree
	}
	
	public void deleteFromTree() {
		
	}
	
	public void isTreeEmpty() {
		
	}
}
