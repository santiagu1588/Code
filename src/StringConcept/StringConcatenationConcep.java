package StringConcept;

public class StringConcatenationConcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String Concatenation in Java
		In java, string concatenation forms a new string that 
		is the combination of multiple strings. There are two ways to concat string in java:

		  -By + (string concatenation) operator
		 -By concat() method
		 
		 
		1) String Concatenation by + (string concatenation) operator
		Java string concatenation operator (+) is used to add strings.
*/
		// *** using +
		
		System.out.println("using + operator");
		
		String s = "hello";
		String s1 = "world";
		System.out.println(s + s1);
		
		String s2 = 10+20+s+s1+40;
		System.out.println(s2);
		
		/*The Java compiler transforms above code to this:

			String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();  
*/		
		/*2) String Concatenation by concat() method
		The String concat() method concatenates the specified string to the end of current string. Syntax:

		public String concat(String another)*/  
		
		System.out.println("using concat method");
		
		System.out.println(s.concat(s1));
		
		
		
	}

}
