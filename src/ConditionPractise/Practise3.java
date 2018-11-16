package ConditionPractise;

import java.util.Scanner;

public class Practise3 {

	/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
	Ask user for their salary and year of service and print the net bonus amount.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the experience of user");
		int exp = s.nextInt();
		System.out.println("Enter the user Salary");
		int salary = s.nextInt();
		
		if(exp>5){
			System.out.println("Net Bonus Amount"+ (((salary*5)/100)+salary));
		}else{
			System.out.println("Not eligible for Bonus");
		}
		
		
		

	}

}
