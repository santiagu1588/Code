package OopsConcPart2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// compile time polymorphism
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.moneytransfer();
		hs.educationloan();
		hs.carloan();
		hs.mutualfund();
		
		// dynamic polymorphism
		//child class can refered by parent interface reference var
		
		USBank us = new HSBCBank();
		us.credit();
		us.debit();
		us.moneytransfer();
		
		System.out.println(USBank.min_bal);
		//USBank.min_bal=200; 
		/*it will throw an error. since variable value which we 
		 * declaring in the interface will not be changed. Please check by taking the command line*/ 

	}

}
