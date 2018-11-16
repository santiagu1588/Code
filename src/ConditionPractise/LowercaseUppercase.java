package ConditionPractise;

import java.util.Scanner;

public class LowercaseUppercase {

	//Identify the character is lowercase or uppercase
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the character");
		// Scanner doesn't allow to get the character. so we were using string to get the value at run time
		
		String s1 = s.next();
		
		char c;
		//changing string to character
		c = s1.charAt(0);
		
		if(Character.isLowerCase(c)){
			System.out.println("its an Lowercase");
			
		}else if(Character.isUpperCase(c)){
		
			System.out.println("its an uppercase");
			
		}else{
			System.out.println("Its not character");
			
		}

	}

}
