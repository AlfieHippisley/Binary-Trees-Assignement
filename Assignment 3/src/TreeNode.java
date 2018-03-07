
/**
 * TreeNode class for storing each nodes data and handling it
 *
 * Lecture slides were used as reference while writing code
 * 
 * @author Alfie Hippisley
 * @version 03/03/2018
 */

public class TreeNode {
	
	// Initialise variables for storing student data
	private int studentNumber;
	private int studentMark;
	private String studentName;
	
	// Initialise variables for next nodes/leafs
	private TreeNode left;
	private TreeNode right;
	
	/**
	* Constructor for TreeNode with no data
	*/
	
	public TreeNode() {
	}
	
	/**
    * Constructor for TreeNode with data
    * 
    * @param studentNumber students unique id number
    * @param studentMark students mark from exam
    * @param studentName students name
    */
	
	public TreeNode(int studentNumber, int studentMark, String studentName) {
		
		// Set the data
		this.studentNumber = studentNumber;
		this.studentMark = studentMark;
		this.studentName = studentName;
		
		// Set left and right leafs to null
		this.left = null;
		this.right = null;
	}
	
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
		return studentMark;
	}
	
	/**
	 * @param examMark the examMark to set
	 */
	
	public void setExamMark(int examMark) {
		this.studentMark = examMark;
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
