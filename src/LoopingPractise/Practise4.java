package LoopingPractise;

import java.util.Scanner;

public class Practise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i=5; i>=n;i--){
			
			   for(int j=5; j>=i; j--){
				   System.out.print(j + " ");
			   }
			   
			   System.out.println();
		}
		
	}

}
