package OopsConstructorConcept;

public class ConstructorConcept {

	// its class entity to define the class variable. It look like function. 
	//no need of write the return tyoe inside the constructor
	// we can overload the constructor
	String name;
	int age;
	
	
	// To Initilize the class variable into the constructor. we should use this keyword
	
	public ConstructorConcept(){
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i){
		System.out.println("single parameter Constructor");
		System.out.println("the value of i "+ i);
	}
	
	public ConstructorConcept(int i, int j){
		System.out.println("single parameter Constructor");
		System.out.println("the value of i "+ i);
		System.out.println("the value of j "+ j);
	}
	
	public ConstructorConcept(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorConcept obj = new ConstructorConcept("Tom",30);

	}

}
