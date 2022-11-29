package assignment2;
//Author: Oluwakemi Temitope Olayinka
//September 09, 2021

import java.util.Scanner; //Importing scanner
public class Assignment2a1 {


	public static void main(String[] args) {
	System.out.print("Welcome to the Trojan Cafe Meal Plan Options: Select one option" + "\n" + "\n" + "\n" + " 1. CARTE UNLIMITED PLUS + $75 EXPRESS DOLLARS – $1925 per semester" + "\n" + " 2. 224 BLOCK + $500 EXPRESS DOLLARS – $1730 per semester" + "\n" + " 3. 128 BLOCK + $500 TROJAN EXPRESS DOLLARS – $1445 per semester" + "\n" + "\n");//Welcoming the User and Selection of meal plan
	
	Scanner keyboard = new Scanner (System.in);//Adding an input device
	int selection;//Adding integer to get information
	String lastName;//Adding string to get information
	String emailAddress;//Adding string to get information
	
	System.out.print("Enter your selection (1, 2, 3) >>>:"); System.out.print("\n");//Printing necessary information for selection
	selection = keyboard.nextInt();//Adding an required information for selection
	Scanner keyboard2 = new Scanner (System.in);//Adding an input device
	
	System.out.print("Enter your Last name >>>:"); System.out.print("\n");//Printing necessary information for last name
	lastName = keyboard2.nextLine();//Adding required information for lastName
	
	System.out.print("Enter your Email address >>>:"); System.out.print("\n");//Printing necessary information for email address
	emailAddress = keyboard2.nextLine();//Adding required information for emailAddress
	
	System.out.print("\n");//Print a new line
	System.out.print("Meal Plan Option : "+ selection + "\n" +"Last Name : "+ lastName + "\n" + "Email : "+ emailAddress );//Prompting selection
	
	
		// TODO Auto-generated method stu 

	}

}
