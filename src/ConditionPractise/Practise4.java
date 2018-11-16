package ConditionPractise;

import java.util.Scanner;

public class Practise4 {

	/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
	Take following input from user
	Number of classes held
	Number of classes attended.
	And print
	percentage of class attended
	Is student is allowed to sit in exam or not.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the class held");
		int x = s.nextInt();
		System.out.println("Enter the attendance for the student");
		int y = s.nextInt();
		int st_per = y*100/x;
		
		System.out.println(st_per);
		
		if(st_per>=75){
			System.out.println("Allowed");
		}else{
			System.out.println("Not Allowed");
		}

	}

}
