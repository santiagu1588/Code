package Arraypractise;

public class sortingAlphabetics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a [] = {'z','f','c','a','d'};
		
		int k =0;
		char temp;
		
		for(int i=0; i<a.length;i++){
			k=k+1;
			for(int j=k; j<a.length;j++){
				if(a[i]>a[j]){
				   temp = a[j];
				   a[j]=a[i];
				   a[i] = temp;
				}
			}
		}
		
		System.out.println(a[0]);
		for(int m=0; m<a.length;m++){
			System.out.print(a[m]+",");
		}
	}

}
