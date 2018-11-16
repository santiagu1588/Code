package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	
	
	public static <E> void main(String[] args) {
	
		int a[] = new int [3]; 
		// static array. Size is fixed. 
		//to overcome this advantage there is solution and it is dynamic array or array list.
		
		// dynamic array
		/*1. can contain duplicate values
		2. maintain insertion order
		3. Synchronized
		4. allow random access to fetch any element*/
		ArrayList ar = new ArrayList(); 
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add("Tom");
		ar.add("Tom");
		ar.add('c');
		ar.add(true);
	 /*To print all the values from array
		1. for loop
		2. Iterator*/
	for(int i=0;i<ar.size();i++){
		System.out.println(ar.get(i));
	}
	
	System.out.println(ar.size());
	System.out.println(ar.get(4)); // to get the value from the index
	
	
	// generics vs non-generics.
/*	1. generics is available from jdk 1.5
	generics: when you mouse hover previous array list object there will be warning. it is calles non-generics 
	the warning indicates that array list is rawtype. to remove this warning we have to use what kind of value.
	eg: integer, string, character, boolean, double. Please find the eg below*/
	
	ArrayList<Integer> ar1 = new ArrayList<Integer>();
	ar1.add(10);
	ar1.add(20);
	
	ArrayList<String> ar2 = new ArrayList<String>();
	ar2.add("QA");
	ar2.add("Dev");
	
	 /*if you do no what type of data type that we should add in the arraylist. so in this case, 
	please use E which states Element. but genrally we wont use this. since we know what type of datat that we used*/
	ArrayList<E> ar3 = new ArrayList<E>();
	
	// Class object
	Employee e1 = new Employee("Tom", 15, "QA");
	Employee e2 = new Employee("Peter", 25, "Dev");
	
	// creating arraylist for employee class
	ArrayList<Employee>ar4 = new ArrayList<Employee>();
	ar4.add(e1);
	ar4.add(e2);
	
	// Itreator: To traverse the value
	// we cannot use for loop for Object arraylist. In this case, there is a solution and it is called as Iterator.
	
	Iterator<Employee> it = ar4.iterator();
	while(it.hasNext()){
		Employee emp = it.next();
		System.out.println(emp.name+", "+emp.age+", "+emp.dept);
	}
	
	System.out.println("************************");
	// add all
	
	ArrayList<String>ar5 = new ArrayList<String>();
	ar5.add("Selenium");
	ar5.add("QTP");
	
	
	ArrayList<String>ar6 = new ArrayList<String>();
	ar6.add("Dev-0ps");
	ar6.add("Admin");
	
	//adding two array using add all method
	
	ar5.addAll(ar6);
	
	for(int i=0;i<ar5.size();i++){
		System.out.println(ar5.get(i));
	}
	
	System.out.println("retain***");
	
	// Retain method: To detect the duplicate value 
	
	ArrayList<String>ar7 = new ArrayList<String>();
	ar7.add("Selenium");
	ar7.add("QTP");
	
	
	ArrayList<String>ar8 = new ArrayList<String>();
	ar8.add("Dev-0ps");
	ar8.add("Admin");
	ar8.add("Selenium");
	
	ar7.retainAll(ar8);
	
	for (int i=0; i<ar7.size();i++){
		System.out.println(ar7.get(i));
	}
	
	System.out.println("**********remove********");
	ar5.removeAll(ar6);
	for (int i=0; i<ar5.size();i++){
		System.out.println(ar5.get(i));
	}
	
	
	}

}
