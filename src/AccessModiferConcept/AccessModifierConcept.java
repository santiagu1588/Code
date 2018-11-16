package AccessModiferConcept;

public class AccessModifierConcept {

	// No modifier
	String name;
	int age;
	
	// public modifier
	public String emp_name;
	public int emp_id;
	
	//private modifier
	
	private String class_name;
	private int class_count;
	
	
	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public int getClass_count() {
		return class_count;
	}

	public void setClass_count(int class_count) {
		this.class_count = class_count;
	}

	
	
	/*Acess Modifier   class   Package  sub class   World
	Public            Y        Y        Y          Y
	Private           Y        N        N          N
	no modofier       Y        Y        N          N
	Protected         Y        Y        Y          N*/
	
	public void publicClass(){
		System.out.println("----Public -----");
		String class_name = "Allen";
	}
	
	
}
