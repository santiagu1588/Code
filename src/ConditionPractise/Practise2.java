package ConditionPractise;

import java.util.Scanner;

public class Practise2 {

	/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
	Ask user for quantity
	Suppose, one unit will cost 100.
	Judge and print total cost for user.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the unit");
		
		int x = s.nextInt();
		int a = x*100;
		
		if(a>1000){
			System.out.println((a*10/100));
			System.out.println((a-(a*10/100)));
		}
			System.out.println("No discount available");

	}

}
