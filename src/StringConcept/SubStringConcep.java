package StringConcept;

public class SubStringConcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Substring in Java
		A part of string is called substring. In other words, substring is a subset of another string. 
		In case of substring startIndex is inclusive and endIndex is exclusive.

		Note: Index starts from 0.
		You can get substring from the given string object by one of the two methods:

		public String substring(int startIndex): This method returns new String object containing the substring of the given string from specified startIndex (inclusive).
		public String substring(int startIndex, int endIndex): This method returns new String object containing the substring of the given string from specified startIndex to endIndex.
		In case of string:

		startIndex: inclusive
		endIndex: exclusive
		Let's understand the startIndex and endIndex by the code given below.

		String s="hello";  
		System.out.println(s.substring(0,2));//he  
		In the above substring, 0 points to h but 2 points to e (because end index is exclusive).
*/
		
		String s = "helloworld";
		System.out.println(s.substring(5)); // world
		System.out.println(s.substring(2, 5)); //low
	}

}
