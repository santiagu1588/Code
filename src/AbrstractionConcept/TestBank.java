package AbrstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFCBank hb = new HDFCBank();
		hb.loan();
		hb.credit();
		hb.debit();
		hb.fund();
		
		System.out.println("-------------");
		
		Bank b = new HDFCBank();
		b.credit();
		b.debit();
		b.loan();
		

	}

}
