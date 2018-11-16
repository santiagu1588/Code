package OopsConcPart2;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void moneytransfer();
	
	/*property of interface or define
	 * only method declaration
	 * no method body - only method prototype
	 * In interface we can declare var - By default variables are static in nature
	 * variable values are not change
	 * No static methods are allowed
	 * no main method in inheritance
	 * We cannot create the object of interface
	 * interface is abstract in nature*/ 

}
