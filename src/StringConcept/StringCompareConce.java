package StringConcept;

public class StringCompareConce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Java String compare
		java string comparison
		We can compare string in java on the basis of content and reference.

		It is used in authentication (by equals() method), 
		sorting (by compareTo() method), reference matching (by == operator) etc.

		There are three ways to compare string in java:

		By equals() method
		By = = operator
		By compareTo() method
		
		***************************************************************************
		1) String compare by equals() method
		The String equals() method compares the original content of the string. It compares values of string for equality. String class provides two methods:

		public boolean equals(Object another) compares this string to the specified object.
		public boolean equalsIgnoreCase(String another) compares this String to another string, ignoring case.*/
		
		//*********equals(Object another). It will throws an boolean output
		
		String s = "hello";
		String s1 = "HELLO";
		String s2 = new String("hello");
		String s3 = new String ("world");
		
		System.out.println("Exact equal");
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		
		// *************** equal ignore case*******
		
		System.out.println("we can ignore case sensitive");
		
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.equalsIgnoreCase(s3));
		
		/*2) String compare by == operator
				The = = operator compares references not values.*/
		
		System.out.println("== operator");
		
		String s4 = "Tom";
		String s5 = "Tom";
		String s6 = new String("Tom");
		System.out.println(s4==s5); // true - since both are refers to the same instance
		System.out.println(s4==s6); // false - since s6 refers to instance created in non-pool
		
		
		/*3) String compare by compareTo() method
		The String compareTo() method compares values lexicographically 
		and returns an integer value that describes if first string is less than, 
		equal to or greater than second string.

		Suppose s1 and s2 are two string variables. If:

		s1 == s2 :0
		s1 > s2   :positive value
		s1 < s2   :negative value*/
		
		String s7 = "Sachin";
		String s8 = new String("Ratan");
		
		System.out.println("compare to");
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareTo(s4));
		System.out.println(s.compareToIgnoreCase(s1));
		System.out.println(s8.compareTo(s7));
		

	}

}
