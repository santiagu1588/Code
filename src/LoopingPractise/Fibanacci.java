package LoopingPractise;

import java.util.Scanner;

public class Fibanacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the value of n and the output should be 0+1+1+2+3+");
		
		int n = s.nextInt();
		
		int a = 0;
		int b=1;
		int c;
		
		for(int i=1;i<=n;i++){
			System.out.print(a + "+");
			
			c= a+b;
			a=b;
			b=c;
			
			
		}

	}

}
