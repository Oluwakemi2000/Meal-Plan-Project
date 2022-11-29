package assignment2;
//Author: Oluwakemi Temitope Olayinka
//September 09, 2021

import javax.swing.JOptionPane;
public class Assignment2a2 {

	public static void main(String[] args) {
		String selection;//Adding declaration to variables
		String lastName;//Adding declaration to variables
		String emailAddress;//Adding declaration to variables
		selection = JOptionPane.showInputDialog(null, "Welcome to the Trojan Cafe Meal Plan Options: Select One Option" + "\n" + "\n" + "1. CARTE UNLIMITED PLUS + $75 EXPRESS DOLLARS – $1925 per semester" + "\n" + "2. 224 BLOCK + $500 EXPRESS DOLLARS – $1730 per semester" + "\n" + "3. 128 BLOCK + $500 TROJAN EXPRESS DOLLARS – $1445 per semester" + "\n" + "\n" + "Enter your selection (1, 2, 3) >>>>");//prompting the user with a question and meal plan option
		
		JOptionPane.showMessageDialog(null, " My selection is " + selection);//Adding a literal string in order to get a result
		
		lastName = JOptionPane.showInputDialog(null, "Enter Last Name >>>");//Asking user to enter last name
		JOptionPane.showMessageDialog(null, " My last name is " + lastName);//Adding a literal string in order to get a result
		
		emailAddress = JOptionPane.showInputDialog(null, "Enter Email Address >>>");//Asking user to enter Email address
		JOptionPane.showMessageDialog(null, " My email address is " + emailAddress);//Adding a literal string in order to get a result
		
		
		JOptionPane.showMessageDialog(null ," Meal Plan Option : "+ selection +"\n" + " Last Name : "+ lastName +"\n" + " Email : "+ emailAddress);//Retrieving necessary information
	
		
		// TODO Auto-generated method stub

	}

}
