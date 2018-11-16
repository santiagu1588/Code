package ConditionPractise;

import java.util.Scanner;

public class Practise5 {

	/*Write a program to print absolute vlaue of a number entered by user. E.g.-
	INPUT: 1        OUTPUT: 1
	INPUT: -1        OUTPUT: 1*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int x = s.nextInt();
		
		if(x<0){
			System.out.println("The output is " + -1*x);
		}else if(x>=0){
			System.out.println("The output is " + x);
		}else{
			System.out.println("Indefined Number");
		}
		
		

	}

}
