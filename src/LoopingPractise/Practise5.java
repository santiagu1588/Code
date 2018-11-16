package LoopingPractise;

import java.util.Scanner;

public class Practise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i =5; i>=n;i--){
			
			for(int j=1; j<=i; j++){
				System.out.print(j);
			}
			
			System.out.println();
		}
		

	}

}
