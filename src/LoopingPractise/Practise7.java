package LoopingPractise;

import java.util.Scanner;

public class Practise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		   int n = s.nextInt();
		   
		  /*int  k = 2*n-2;
		   for(int i = 1; i<=n; i++){
			   
			   		for(int j=0;j<=k;j++){
			   			System.out.print(" ");
			   		}
			   
			   k= k-1;
			   for(int j=1;j<=i;j++){
				   System.out.print(j+" ");
			   }
			   System.out.println();
			   
			   
		   }*/
		   
		   for(int i=1; i<=n;i++){
			   
			   for(int j=n;j>i;j--){
				   System.out.print(" ");
			   }
			   
			   for(int k=1;k<=i;k++){
				   System.out.print("*" + " ");
			   }
			   System.out.println();
		   }

	}

}
