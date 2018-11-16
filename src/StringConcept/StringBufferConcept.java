package StringConcept;

public class StringBufferConcept {

	/*Java StringBuffer class is used to create mutable (modifiable) string. 
	The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*What is mutable string
		A string that can be modified or changed is known as mutable string. 
		StringBuffer and StringBuilder classes are used for creating mutable string.

		1) StringBuffer append() method
		The append() method concatenates the given argument with this string.
*/
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append("java");
		System.out.println(sb);
		StringBufferConcept sbc = new StringBufferConcept();
		sbc.stringBufferInsert();
		sbc.StringBufferReplace();
		sbc.StringBufferDelete();
		sbc.StringBufferReverse();
		sbc.StringBufferCapacity();
		
	}
	
	public void stringBufferInsert(){
		//The insert() method inserts the given string with this string at the given position.
		StringBuffer sb = new StringBuffer("hello");
		sb.insert(2, "java");
		System.out.println(sb);
	}
	
	public void StringBufferReplace(){
		//The replace() method replaces the given string from the specified beginIndex and endIndex.
		StringBuffer sb = new StringBuffer("hello");
		sb.replace(2, 4, "java");
		System.out.println(sb);
	}
	
	public void StringBufferDelete(){
		//The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex.
		StringBuffer sb = new StringBuffer("Hello");
		sb.delete(1, 3);
		System.out.println(sb);
	}
	
	
	public void StringBufferReverse(){
		//The reverse() method of StringBuilder class reverses the current string.
		StringBuffer sb = new StringBuffer("hello");
		sb.reverse();
		System.out.println(sb);
		
	}
	
	public void StringBufferCapacity(){
		/*The capacity() method of StringBuffer class returns the current capacity of the buffer. 
		The default capacity of the buffer is 16. If the number of character increases from its current capacity, 
		it increases the capacity by (oldcapacity*2)+2. 
		For example if your current capacity is 16, it will be (16*2)+2=34.*/
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		System.out.println(sb.capacity());
		sb.append("World");
		System.out.println(sb.capacity());
		sb.append("this is my first java program");
		System.out.println(sb.capacity());
	}

}
