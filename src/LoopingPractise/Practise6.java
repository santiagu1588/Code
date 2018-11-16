package LoopingPractise;

import java.util.Scanner;

public class Practise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i=1; i<=n;i++){
			
			for(int j=5; j>=i; j--){
				System.out.print(j);
			}
			
			System.out.println();
		}
		

	}

}
