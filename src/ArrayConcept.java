import java.lang.reflect.Array;

public class ArrayConcept {
	
	
	public static void main(String[]args){
		
		//array: Is store similar value in a array variable
		// One Dimensional Array
		//array declaration:
		// using Integer
		int i[] = new int[4];
		
		i[0]=5;
		i[1]=4;
		i[2]=7;
		i[3]=8;
		
		System.out.println(i.length);
		System.out.println(i[2]);
		
		// print all the array value using for loop
		
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
		}
		
		//double
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 11.33;
		d[2] = 10.44;
		
		System.out.println(d.length);
		
		for(int u=0;u<d.length;u++){
			System.out.println(d[u]);
		}
		
		//char
		char c[] = new char [2];
		c[0] = 1;
		c[1] = 'a';
		
		System.out.println(c.length);
		
		System.out.println(c[1]);
		
		for(int t=0; t<c.length;t++){
			System.out.println(c[t]);
		}
		
		//Boolean
		
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		// String
		
		String s[] = new String [3];
		
		s[0] = "Allen";
		s[1] = "Santiago";
		s[2] = "Doss";
		
		System.out.println(s.length);
		System.out.println(s[0]);
		
		for(int k=0; k<s.length;k++){
			System.out.println(s[k]);
		}
		
		
		
		// DisAdvantage of one dimensional Array: 
		  /*1. Size is fixed - So we call it as static Array.To overcome this problem we use collection 
		     Array list, Hash table or Dynamic array
		  2. We can store only similar data type. To over come this problem we will use object array*/
		
		// Object Array: Object is a super class. it is predefined function in java
		// Object array is used to store different data types
		Object ob[] = new Object[6];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]=12.33;
		ob[3]="15/9/1988";
		ob[4]='M';
		ob[5]="London";
		
		System.out.println(ob[5]);
		
		System.out.println(ob.length);
		
		for(int l=0; l<ob.length;l++){
			System.out.println(ob[l]);
		}
		
		
		
		
				
		
	}

}
