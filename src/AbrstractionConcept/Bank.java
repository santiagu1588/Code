package AbrstractionConcept;

public abstract class Bank {
	
	// Only method prototype are allowed - no method body
	// we can also create non abstract method in the abstract class. but obviously one abstract method must define
	// abstraction means to hide the business logic. and business logic will be defined by respective child classes
	// hiding the business logic is called as abstraction
	
	public abstract void loan();
	
	public void credit(){
		System.out.println("--- abstract --- credit");
	}
	
	public void debit(){
		System.out.println("--- abstract --- debit ");
	}

}
	