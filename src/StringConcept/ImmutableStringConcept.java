package StringConcept;

public class ImmutableStringConcept {
	
	/*In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
	Once string object is created its data or state can't be changed but a new string object is created.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello";
		s.concat("world"); // concat string method is used to append at the end . 
		System.out.println(s); // will print the hello since string are immutable
		
		s= s.concat("world"); // here the concat will work
		System.out.println(s);
		
		/*Why string objects are immutable in java?
		Because java uses the concept of string literal.Suppose there are 5 reference variables,
		all referes to one object "sachin".If one reference variable changes the value of the object, 
		it will be affected to all the reference variables. That is why string objects are immutable in java.*/

	}

}
