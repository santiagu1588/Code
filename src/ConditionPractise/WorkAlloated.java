package ConditionPractise;

import java.util.Scanner;

public class WorkAlloated {

	/*
	 * Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then
	 * using following rules print their place of service. if employee is
	 * female, then she will work only in urban areas.
	 * 
	 * if employee is a male and age is in between 20 to 40 then he may work in
	 * anywhere
	 * 
	 * if employee is male and age is in between 40 t0 60 then he will work in
	 * urban areas only.
	 * 
	 * And any other input of age should print "ERROR".
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the age");
		int age = s.nextInt();
		
		System.out.println("Enter the Marittal Status");
		String ms = s.next();
		
		if(ms.equals("Y")|| ms.equals("N")){
			System.out.println("MarritalStatus is " + ms);
		
		
		System.out.println("Enter the sex");
		String sex = s.next();
			
		
		if(sex.equals("M")) {
			
			System.out.println("Sex is " + sex);
			
			     if(age>20&&age<=40){
			    	 
			    	 System.out.println("Male Employee can work anywhere if the age is inbetween 20 and 40");
			    	 
			     }else if(age>40&&age<60) {
			    	 System.out.println("Male employee should work only in urban areas if the age is inbetween 40 and 60");
			    	 
			     }else{
			    	 
			    	 System.out.println("Not eligible");
			     }
		
				
			}else if((sex.equals("F"))) {
				System.out.println("Sex is "+ sex);
				
				System.out.println("Female Employee should work only in urban areas");
			}else{	
				System.out.println("Please enter the M or F");

			}
			
		}else{
			System.out.println("Please enter the Marrital Status Y or N");
		}

		

	}

}
