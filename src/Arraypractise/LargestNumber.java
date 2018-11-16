package Arraypractise;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {2,3,4,5,1};
		int temp;
		
		int k = 0;
		  for (int i =0; i<a.length;i++){
			   k = k+1;
			    for(int j=k; j<a.length;j++){
			    	if (a[i]<a[j]){
			    		temp = a[j];
			    		a[j]=a[i];
			    		a[i]=temp;
			    	}
			    }
			    
		  }
		
		  	System.out.println(a[0]);
		  	
		  	for(int m =0; m<a.length;m++){
		  		System.out.print(a[m] + ",");
		  		
		  	}
		  	System.out.println();
		  	System.out.println("The top 2 value is " + a[0] + "," +a[1]);
	}

}
