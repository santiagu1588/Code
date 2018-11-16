package OopConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);;
		obj.sum(10, 2);

	}
	
	public static void main(int i) {
	}
	
	/*Interview Q: What is method overloading? 
	when the method name is same with different arguments or different input parameters with different datatype within the same class*/
	
	
	
	/*Some important points:
		-- you cannot create method inside method
		-- duplicate method - same method with same number of argument with same data type are not allowed
		-- same method name with same number of argument with different data type are allowed*/
		
	
	public void sum(){
		System.out.println("Sum Method --> Zero Parameter or zero input arguments");
	}
	
	public void sum(double d){
		System.out.println("Sum Method --> Zero Parameter or zero input arguments");
	}
	
	public void sum(int i){
		System.out.println("Sum Method --> 1 Parameter or 1 input arguments");
	}
	
	public void sum(int i, int k){
		System.out.println("Sum Method --> 2 Parameter or 2 input arguments");
		System.out.println(k+i);
	}

}
