package AccessModiferConcept;

public class TestAcessModifier {

	public static void main(String[] args) {
		
		AccessModifierConcept ac = new AccessModifierConcept();
		// No modofier
		int age = ac.age = 15; 
		String name = ac.name = "Tom";
		
		System.out.println("age is "+age);
		System.out.println("name is "+name);
		
		System.out.println("--------- No modifier--------");
		
		int emp_id = ac.emp_id = 12;
		String emp_name = ac.emp_name = "Jhon";
		
		System.out.println("emp_id "+ emp_id);
		System.out.println("emp_name "+ emp_name);
		
		System.out.println("public modifier-----------");
		
		ac.setClass_count(20);
		ac.setClass_name("ECE");
		System.out.println(ac.getClass_count());
		System.out.println(ac.getClass_name());
	}

}
