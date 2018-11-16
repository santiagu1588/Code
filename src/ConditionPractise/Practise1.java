package ConditionPractise;

import java.util.Scanner;

public class Practise1 {

	 /*program to check the it is square or rectangle. Take the length and breadth of the input at the run time*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length");
		int x = s.nextInt();
		System.out.println("Enter the Breadth");
		int y = s.nextInt();
		if(x==y){
			System.out.println("it is a square");
		}else{
				System.out.println("it is rectangle");
			}
		}

	}

