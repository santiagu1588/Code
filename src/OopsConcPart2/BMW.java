package OopsConcPart2;

public class BMW extends Car{
	// has- a - relationship -- class to class relationship
	/*When same method is present in the parent class as well as in child class with the same name 
	 * and same arguments, is called method overriding*/
	public void start(){ // Method Overriding
		System.out.println("BMW -- start");
	}

	public void theft(){
		System.out.println("BMW--- theft");
	}
}
