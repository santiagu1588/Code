package OopConcept;

public class FunctionInJava {

	
	// Main Method is starting point of execution
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//We can call Non static method into static method by using Object.
		//In the below, fun --> reference variable, referring to the object
		
		//interview Q: why main method is void? -- Since it never return a value
		
		
		
		FunctionInJava fun = new FunctionInJava();
		fun.test();
		int l = fun.pqr();
		System.out.println(l);
		String s1 = fun.qa();
		System.out.println(s1);
		
		int divis = fun.divide(20, 10);
		System.out.println(divis);

	}
	
	//non static methods
	
	/*Three type of methods
	no input no output
	no input some output
	some input some output*/
	
	// void - Doesn't return any value
	
	// No input No output
	public void test(){
		System.out.println("test method");
	}

	// No input some output
	public int pqr(){  // return type integer 
		System.out.println("PQR Method");
		int a=10;
		int b=20;
		int c =a+b;
		
		return c;
	}
	
	//No input some putput
	public String qa(){  //return type integer
		System.out.println("QA Method");
		String s = "Hello World";
		return s;
	}
	
	//some input some output
	public int divide(int x, int y){  // return type integer
		int d = x/y;
		return d;
	}
}
