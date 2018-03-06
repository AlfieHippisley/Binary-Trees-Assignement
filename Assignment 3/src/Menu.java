import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	/**
	 * This method displays the main menu for the user
	 * 
	 * @param none
	 * @return none
	 */
	
	Tree studentTree = new Tree();
	
	public void displayMenu() {
		
		int studentId = 0;
		int studentExamMark = 0;
		String studentName = null;
		
		// Display the title & options
		System.out.println("\nAssignment 3 - Binary Tree\n"+"---------------------------------------------------------");
		System.out.println("1 - Display Tree\n"+"2 - Add To Tree\n"+"3 - Find In Tree\n"+"4 - Delete From Tree\n" + "5 - Exit Program\n");
	
		// Take user input and process
		Scanner scanner1 = new Scanner(System.in); // Integer Input
		Scanner scanner2 = new Scanner(System.in); // String Input
		int userInput = scanner1.nextInt();
		
		switch(userInput) {
		
			// Case 1 (Display Tree)
		    case 1:
		    	studentTree.printTree();
		    break;
		    
		    // Case 2 (Add To Tree)
		    case 2:
		    	// Title
		    	System.out.println("\nAdd To Tree -  Enter Your Data\n"+"---------------------------------------------------------");
		    	
		    	// Get Student Id Number
		    	System.out.println("Please Enter The Student ID number : ");
		    	try{
		    		studentId = scanner1.nextInt();
		    		
		    		while(studentId > 9999 || studentId < 1000) {
		    			System.out.println("Invalid Input Range, must be between 1000 and 9999");
		    			System.out.println("Try Again :");
		    			studentId = scanner1.nextInt();
		    		}
		    	}
		    	catch(InputMismatchException e) {
		    		System.out.println("Invalid Input Type, Must Be A Number, returning to main menu.");
		    		return;
		    	}
		    	
		    	// Get student exam mark
		    	System.out.println("Please Enter The Student Exam Mark : ");
		    	try{
		    		studentExamMark = scanner1.nextInt();
		    		
		    		while(studentExamMark > -1 || studentExamMark < 101) {
		    			System.out.println("Invalid Input Range, must be between 0 and 100");
		    			System.out.println("Try Again :");
		    			studentExamMark = scanner1.nextInt();
		    		}
		    	}
		    	catch(InputMismatchException e) {
		    		System.out.println("Invalid Input Type, Must Be A Number, returning to main menu.");
		    		return;
		    	}
		    	
		    	// Get student name
		    	System.out.println("Please Enter The Student Name : ");
		    	try{
		    		studentName = scanner1.nextLine();
		    	}
		    	catch(InputMismatchException e) {
		    		System.out.println("Invalid Input Type, Must Be Letters, returning to main menu.");
		    		return;
		    	}
		    	
		    	// Call addToTree, passing the new data entered
		    	studentTree.addToTree(studentId, studentExamMark, studentName);
		    break;
		    
		    // Case 3 (Find In Tree)
		    case 3:
		    	// Get user data
		    	System.out.println("\nFind In Tree -  Enter Your Search\n"+"---------------------------------------------------------");
		    	System.out.println("What student ID would you like to find : ");
		    	int userEnteredId = scanner1.nextInt();
		    	
		    	TreeNode searchedNode = studentTree.findInTree(userEnteredId);
		    	
		    	if(searchedNode != null) {
					System.out.println("Student has been found\n");
					System.out.println("Student Id :" + searchedNode.getStudentNumber());
					System.out.println("Student Name : " + searchedNode.getStudentName());
					System.out.println("Student Exam Mark Is : " + searchedNode.getExamMark());
				}
				
				else {
					System.out.println("Student has not been found");
				}
		    break;
		    
		    // Case 4 (Delete From Tree)
		    case 4:
		    	
		    break;
		    
		    // Case 5 (Exit Program)
		    case 5:
		    	System.out.println("\n The program has now closed");
		    	System.exit(0);
		    break;
		    
		    default:
		    	System.out.println("Invalid Input, Returning To Menu");
		    break;
		}
	}
	
	/**
	 * Main method for program
	 * 
	 * @param args
	 * @return none
	 */
	
	public static void main(String[] args) {
		
		// Menu On/Off
		boolean showMenu = true;
		
		// Create Menu Object
		Menu menu1 = new Menu();
		
		// Loop unless showMenu is false
		while(showMenu) {
			menu1.displayMenu();
		}
	}
	
}
