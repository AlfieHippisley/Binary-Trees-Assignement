
/**
 * Tester class for Assignment 3
 * 
 * @author Alfie Hippisley
 * @version 03/03/2018
 */

public class Tester {
	
	Tree treeOne = new Tree();

	public void addToTree() {
		// Add names to tree
		treeOne.addToTree(1527, 50, "Susan Lee");
		treeOne.addToTree(2647, 50, "Sarah Green");
		treeOne.addToTree(3896, 50, "Dave White");
		treeOne.addToTree(4343, 56, "John Smith");
		treeOne.addToTree(5471, 52, "Pete Jones");
		treeOne.addToTree(6210, 67, "Alan Day");
		treeOne.addToTree(7841, 71, "Penny Kay");
	}
	
	public void findInTree() {
		TreeNode student = treeOne.findInTree(1234);
		
		if(student != null) {
			System.out.println("Student has been found");
		}
		
		else {
			System.out.println("Student has not been found");
		}
	}

	private void traverseTreeTest() {
		// Test Traverse Feature
		treeOne.printTree();
		
	}


	public static void main(String[] args) {
		// Main method
		Tester testMe = new Tester();
		
		testMe.addToTree();
		testMe.traverseTreeTest();

	}
}
