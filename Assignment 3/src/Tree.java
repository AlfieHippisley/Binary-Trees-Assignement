
/**
 * Tree class for TreeNode class
 * 
 * @author Alfie Hippisley
 * @version 03/03/2018
 */

public class Tree {
	
	// Initialise variables
	private TreeNode root;
	
	/**
	 * Constructor for objects of class Tree
	 * Creates the root of the Tree
	 */
	
	public Tree() {
		root = null;
	}
	
	/**
	 * @return the root
	 */
	public TreeNode getRoot() {
		return root;
	}

	/**
	 * @param root the root to set
	 */
	public void setRoot(TreeNode root) {
		this.root = root;
	}

	/**
	 * 
	 * Adds Student Data to a node in the Tree
	 * 
	 * @param studentNumber
	 * @param studentMark
	 * @param studentName
	 * @return boolean containing status of placement into tree, false if not placed and true if placed
	 */
	
	
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
					previousNode.setLeft(newNode);
				}
				
				else {
					previousNode.setRight(newNode);
				}
				
				placedNode = true;
			}
		}
		// Return the status of if node has been placed or not
		return placedNode;
	}
	
	/**
	 * Checks if a student is in the tree via their ID number
	 * 
	 * @param studentNumber
	 * @return treeNode object with their data, null if not in the tree
	 */
	
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
			else{
				markerNode = markerNode.getRight();
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
	
	/**
	 * Checks if the tree is empty or not
	 * 
	 * @param none
	 * @return true if tree empty and false is not
	 */
	
	public boolean isTreeEmpty() {
		
		boolean status = false;
		
		// If the root is null then the tree must be empty
		if(root == null) {
			status = true;
		}
				
		return status;
	}
}
