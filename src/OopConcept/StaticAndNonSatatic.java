package OopConcept;

public class StaticAndNonSatatic {
	
	String name = "Tom";
	static int age = 25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we can call static method or variable by two way
		//1. direct calling
		sum();
		System.out.println(age);
		
		//2. calling by class name
		
		StaticAndNonSatatic.sum();
		System.out.println(StaticAndNonSatatic.age);
		
		//how to call non static method into static method?it can be call by using object refrence
		StaticAndNonSatatic obj = new StaticAndNonSatatic();
		System.out.println(obj.name);
		obj.sendMail();
	}
	
	// We can call static method and static variables directly to non-static method
	// We can call non static method and static variables directly to non-static method
	
	public void sendMail(){
		System.out.println("send mail Method");
		System.out.println(age);
		sum();
		System.out.println(name);
		sub();
	}
	
	public static void sum(){
		System.out.println("sum");
	}
	

	public static void sub(){
		System.out.println("sum");
	}
	

}
