package OopConcept;

import OopsConcPart2.Vehicle;

public class Car {
	
	int mod;
	String color;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// new Car() --> Object of the class
		// a,b,c --> reference variable
		// new keyword is used to create the object
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.color = "Grey";
		b.mod = 2014;
		b.color = "Grey";
		c.mod = 2014;
		c.color = "White";
		
		System.out.println("Before shifting the reference");
		
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		System.out.println(a.color);
		System.out.println(b.color);
		System.out.println(c.color);
		
		System.out.println("after shifting the reference");
		
		a=b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod);
		c.mod = 20;
		System.out.println(a.mod);
		System.out.println(c.mod);

	}

}
