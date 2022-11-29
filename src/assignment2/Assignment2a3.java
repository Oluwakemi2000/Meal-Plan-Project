package assignment2;
import java.util.Scanner;

//Author: Oluwakemi Temitope Olayinka
//September 09, 2021
public class Assignment2a3 {

	public static void main(String[] args) {
		double hourlyRate = 25.50;//Declaring variables
		double overtimeRate = 38.25;//Declaring variables
		double incometaxpercent = 0.15;//Declaring variables
		double retirementBenefitPercent = 0.05;//Declaring variables
		double healthBenefitPercent = 0.05;//Declaring variables
		double grossPay;//Declaring variables
		double netPay;//Declaring variables
		double incomeTaxDeductions;//Declaring variables
		double retirementBenefitDeductions;//Declaring variables
		double healthBenefitDeductions;//Declaring variables
		
		
		System.out.print("Please enter your regular hours:");//printing regular hours
		Scanner userInput = new Scanner(System.in);//prompting user for input
		double regularHours = userInput.nextDouble();//prompting user for input
		System.out.print("Please enter your overtime hours: ");//printing overtime hours
		double overtimeHours = userInput.nextDouble();//prompting user for input
		
		
		
		grossPay = (regularHours * hourlyRate) + (overtimeHours * overtimeRate);//calculating gross pay
		System.out.println("Gross Pay is				$"+String.format("%.2f", grossPay));//printing the gross pay
		
		healthBenefitDeductions = healthBenefitPercent * grossPay;//calculating health benefit deductions
		System.out.println("Health benefit deductions is		$"+String.format("%.2f",healthBenefitDeductions));//printing the health benefit deductions
		
		retirementBenefitDeductions = retirementBenefitPercent * grossPay;//calculating retirement benefit deductions
		System.out.println("Retirement benefit deductions is	$"+String.format("%.2f",retirementBenefitDeductions));//printing the retirement deductions
		
		incomeTaxDeductions = incometaxpercent * grossPay;//calculating income tax deductions
		System.out.println("Income tax deductions is		$"+String.format("%.2f" , incomeTaxDeductions));//printing the income tax deductions
		
		netPay = grossPay - incomeTaxDeductions - healthBenefitDeductions - retirementBenefitDeductions;//calculating net pay
		System.out.println("Net Pay is				$"+String.format("%.2f",netPay));//printing the net pay
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
