package OopConcept;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Wrapper class - data conversion from string to integer, double and
		// boolean

		// String to integer

		String x = "100";
		int i = Integer.parseInt(x);

		System.out.println(x + 20);

		System.out.println(i + 20);

		// String to double

		String y = "12.33";
		double d = Double.parseDouble(y);

		System.out.println(y + 20);

		System.out.println(d + 20);

		// We cannot convert String to character

		// String to boolean

		String z = "true";
		boolean b = Boolean.parseBoolean(z);

		System.out.println(b);

		// Integer to String

		int k = 100;
		String s1 = String.valueOf(k);

		System.out.println(s1);

		// char to String  
		char c = 'd';
		String s2 = String.valueOf(c);
		System.out.println(s2);

		// Special Case

		String n = "100A"; // It will throw an error "NumberFormatException: For
							// input string: "100A""
		int m = Integer.parseInt(n);
		System.out.println(m);

	}

}
