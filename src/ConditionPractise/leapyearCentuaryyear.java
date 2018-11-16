package ConditionPractise;

import java.util.Scanner;

public class leapyearCentuaryyear {

	/*Write a program to check if a year is leap year or not.
	If a year is divisible by 4 then it is leap year but 
	if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the year");
		
		int year = s.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println("Its a leap year");
		}else{
			System.out.println("Its Not leap year");
		}
		
		}
		
	}


