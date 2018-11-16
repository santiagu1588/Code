package StringConcept;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="Hello World";
     String res="";
     for(int i=s.length()-1;i>=0;i--)
     {
    	 res+=s.charAt(i);
     }
    		System.out.println(res); 
	}

}
