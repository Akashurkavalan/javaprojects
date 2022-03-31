import java.util.Scanner;

public class EmailApp extends Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.err.println("******************[EMAIL APPLICATION]******************");
		
		Scanner myObj = new Scanner(System.in); // used to get user input
		System.out.println("Enter firstName: ");
		String fName = myObj.nextLine();
		
		System.out.println("Enter lastName: ");
		String lName = myObj.nextLine();
		
		System.out.println("Enter alternatemail: ");
		String alternateEmail = myObj.nextLine();
		System.out.println("......please enter a department code to set an employee email.....");
		
		Email em1 = new Email();
		em1.Email1(fName, lName, alternateEmail);
		System.out.println(em1.showInfo());
		
		String user;
		
		System.out.println("Enter the userName: ");
		 user = myObj.nextLine();
		 
		 System.out.println("Enter your password: ");
		String pass = myObj.nextLine();
		
		
		Email a=new Email();
	    if(user.equals(fName + lName) && pass.equals(em1.getPassword()) ) {
			System.out.println("Welcome To Email Application");
		}
		else {
			System.out.println("Invalid Username/Invalid Password.");
		} 
		
		System.err.println("                  [THANK YOU]                  ");
		

	}

}