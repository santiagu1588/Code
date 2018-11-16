package LoopingPractise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int j =1;
		
		for(int i=1; i<=x; i++){
			
			j=j*i;
		}
		
		System.out.println(j);

	}

}
