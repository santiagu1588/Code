package OopsConcPart2;

public class HSBCBank implements USBank,BrazilBank{
	
	//Is -a - relationship
	
	/*if a class is implementing any interface, then its mandatory to 
	 * define/override all the methods of interface*/

	
	// overide/implement from US bANK
	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
		System.out.println("HSBC -- credit");
		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("HSBC -- debit");
		
	}

	@Override
	public void moneytransfer() {
		// TODO Auto-generated method stub
		
		System.out.println("HSBC -- transfermoney");
		
	}
	
	// hsbc BANK methods
	public void educationloan(){
		System.out.println("education -- loan");
	}
	
	public void carloan(){
		System.out.println("car--loan");
	}

	//brazilbank
	public void mutualfund() {
		System.out.println("HSBC-- MutualFund");
		
	}

}
