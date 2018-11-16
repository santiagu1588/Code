package LoopingPractise;

import java.util.Scanner;

public class Practise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		int z =1;
		System.out.println("Enter the value of m");
		int m = s.nextInt();
		
		for(int i=m; i>=n; i--){
			
			for(int j=m;j>=i;j--){
				
				System.out.print(" ");
			}
			
			for(int k=z;k<=i;k++){
				System.out.print("*");
			}
			z=z+1;
			System.out.println();
			
		}

	}

}
