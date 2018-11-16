package OopsConcPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// polymorphism - 1 to many : we are overriding many methods
		/*Static polymorphism or compile time polymorphism -- Why it is compile time poylmorphism ? Since at the time of compilation, java should*/
		
		BMW b = new BMW();
		b.start(); 
		b.stop();
		b.refuel();
		b.theft();
		b.engine();
		
		System.out.println("********");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println("*********");
		//Top Casting -- Dynamic Polymorphism
		Car c1 = new BMW();// child class object can be referred by parent class reference variable -- dynamic polymorphism or runtime polymorphism
		c1.start();         // Only common methods and parent class methods will be called in dynamic polymorphism
		c1.stop();
		c1.refuel();
		c1.engine();
		
		System.out.println("*********");
		
		/*DownCasting -- parent class referring the child class but it won't works and throws 
		 * an exception "class cast exception. let see how we initilizing below"*/
		BMW b1 = (BMW)new Car(); // what will happen, Java will get confused at the time of compliation, but at run time 
								// it will throw an error class cast exception
	}
	
	// Diff between interface and inheritance:
	
	//- child class can extend only parent class is inheritance
	//- child class can implements multiple ineritance is called interface

}
