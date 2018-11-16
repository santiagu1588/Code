package AbrstractionConcept;

public class HDFCBank extends Bank{

	@Override
	public void loan() {
		System.out.println("--- abstract loan method---");
	}
	
	public void fund(){
		System.out.println("hdfc --- fund");
	}

}
