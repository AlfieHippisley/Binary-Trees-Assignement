
/**
 * TreeNode class for storing each nodes data
 * 
 * @author Alfie Hippisley
 * @version 03/03/2018
 */

public class TreeNode {
	
	// Initialise variables for storing student data
	private int studentNumber;
	private int examMark;
	private String studentName;
	
	// Initialise variables for next nodes/leafs
	private TreeNode left;
	private TreeNode right;
	
	/**
	 * @return the studentNumber
	 */
	
	public int getStudentNumber() {
		return studentNumber;
	}
	
	/**
	 * @param studentNumber the studentNumber to set
	 */
	
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	/**
	 * @return the examMark
	 */
	
	public int getExamMark() {
		return examMark;
	}
	
	/**
	 * @param examMark the examMark to set
	 */
	
	public void setExamMark(int examMark) {
		this.examMark = examMark;
	}
	
	/**
	 * @return the studentName
	 */
	
	public String getStudentName() {
		return studentName;
	}
	
	/**
	 * @param studentName the studentName to set
	 */
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	/**
	 * @return the left
	 */
	
	public TreeNode getLeft() {
		return left;
	}
	
	/**
	 * @param left the left to set
	 */
	
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	
	/**
	 * @return the right
	 */
	
	public TreeNode getRight() {
		return right;
	}
	
	/**
	 * @param right the right to set
	 */
	
	public void setRight(TreeNode right) {
		this.right = right;
	}

	
	
}
