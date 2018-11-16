package Arraypractise;

public class DuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {2,1,2,4,5,1};
		int k =0;
		for(int i =0; i< a.length; i++){
			    k = k +1;
			   for(int j=k; j<a.length; j++){
				    
				        if(a[i]!=a[j]){
				    	   System.out.println();
				        }else{
				    	System.out.println("Duplicate Value is " + a[i]);
				        }
			   }
			    
		}
		

	}

}
