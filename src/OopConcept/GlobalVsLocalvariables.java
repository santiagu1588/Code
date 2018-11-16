package OopConcept;

public class GlobalVsLocalvariables {

	// Global or class variable
	
	String name = "Hello World";
	int num =25;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =10; // local variable of main method
		System.out.println(i);
		
		GlobalVsLocalvariables obj = new GlobalVsLocalvariables();
		
		System.out.println(obj.name);
		System.out.println(obj.num);
		obj.sum();
	}
	
	public void sum(){ 
		int i=15;  // local variable of sum method
		int j= 10;
		System.out.println(i);
		System.out.println(j);
	}

}
