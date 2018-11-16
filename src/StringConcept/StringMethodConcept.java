package StringConcept;

public class StringMethodConcept {
	
	/*The java.lang.String class provides a lot of methods to work on string. 
	 * By the help of these methods, we can perform operations on string such as trimming, 
	 * concatenating, converting, comparing, replacing strings etc.

	Java String is a powerful concept because everything is treated as a string 
	if you submit any form in window based, web based or mobile application.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ***** changing the case sensitive
		
		System.out.println("Uppercase");
		
		String s = "HelloWorld";
		System.out.println(s.toUpperCase());
		
		System.out.println("LowerCase");
		
		System.out.println(s.toLowerCase());
		
		// ******* trim********
		
		System.out.println("trim the value");
		
		String s1 = " Hello World ";
		String s2 = new String (" Tom ");
		System.out.println(s1.trim());
		System.out.println(s2.trim());
	
		
		// Starts with and end with -  it will throw an boolean output
		
		System.out.println("Starts with and end with");
		
		String s3 = "lan vat";
		System.out.println(s3.startsWith("la"));
		System.out.println(s3.endsWith("at"));
		System.out.println(s3.endsWith("ay"));
		
		// string CharAt method
		
		System.out.println(s3.charAt(3));
		System.out.println(s3.charAt(0));
		System.out.println(s3.charAt(4));
		
		// legth of the string
		
		System.out.println(s3.length());
		System.out.println(s1.length());
		
		/*Java String intern() method
		A pool of strings, initially empty, is maintained privately by the class String.

		When the intern method is invoked, if the pool already contains a string equal 
		to this String object as determined by the equals(Object) method, 
		then the string from the pool is returned. 
		Otherwise, this String object is added to the pool and a reference to this String object is returned.
		*/

		String s5 = new String("Tom");
		String s6 = s5.intern();
		System.out.println(s5);
		System.out.println(s6);
		
		/*Java String valueOf() method
		The string valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into string.
		*/
		
		int a = 20;
		String s7 = String.valueOf(a);
		System.out.println(s7 + 50);
		
		// replace the string
		
		String s8 = "hello world";
		System.out.println(s8.replace("l", "n"));
	}

}
