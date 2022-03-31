
import java.util.Scanner;

public class Email {

		private String firstName;
		private String lastName;
		private String password;
		private String department;
		private String email;
		private int mailboxCapacity=500;
		private int defaultPasswordlength = 8;
		private String alternateEmail;
		private String changepassword;
		private String companySuffix = "Edubridgecompany.com";
		private char first;
		
		//constructor to receive the first name and last name
		public int Email1(String firstName, String lastName, String email1) {
			this.firstName =  firstName;
			this.lastName =  lastName;
			this.first = firstName.charAt(0);
			//System.out.println("New Worker : " + this.firstName + " " + this.lastName);
			
			//call a method asking for the department - return the department
			this.department = setDepartment();
			//System.out.println("Department: " + this.department);
			
			//call a method that returns password
			this.password = randomPassword(defaultPasswordlength);
			System.out.println("Your password is: " +this.password);
			setAlternateEmail(email1);
			
			//combining elements to generate email
			email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department +"." + companySuffix;
			//System.out.println("Your email is: " + email);
			return defaultPasswordlength;
		}
		
		// Ask for the department
		private String setDepartment() {
			System.err.println("**DEPARTMENT CODES**\n1 for Sales\n2 for HR\n3 for Developement\n4 for Finance\n"
					+ "Enter the Department No: ");
			 Scanner s = new Scanner(System.in);
			 int depChoice = s.nextInt();
			 if(depChoice == 1) { return "sales";}
			 else if(depChoice == 2) { return "HR";}
			 else if(depChoice == 3) { return "Developement";}
			 else if(depChoice == 4) { return "Finance";}
			 else { return "";}
			
		}
		
		//Generate a password
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%"; 
		    char[] password = new char[length];
			for(int i=0; i<length; i++) {
				int rand = (int)(Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
			}
			
			return new String(password);
		}
			//set the mailbox capacity
		public void setMailboxCapacity(int capacity) {
			this.mailboxCapacity = capacity;
		}
		 // set the alternate email
		public void setAlternateEmail(String alternateEmail) {
			this.alternateEmail = alternateEmail;
		}
		//Change the password
//		public void changePassword(String password) {
//			this.password = password;
//		}
		
		public int getMailboxCapacity() { return mailboxCapacity; }
		public String getAlternateEmail() { return alternateEmail; }
		public String getPassword() { return password; }
		
		public String showInfo() {
			return "New Employee: " + firstName + " " + lastName +
					"\nCompany Mail: " + email +
					"\nAlternateEmail: " + alternateEmail + 
					"\nMailbox Capacity: " +mailboxCapacity +"mb";
		
		}
		

	}