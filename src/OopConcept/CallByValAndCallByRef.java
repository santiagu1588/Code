package OopConcept;

public class CallByValAndCallByRef {
		
		int u ;
		int v ;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10;
		int y = 20;
		obj.testSum(x, y);// call by value or pass by value. Copy of input parameter passing
		
		obj.u = 30;
		obj.v = 40;
		
		obj.swap(obj);
		
		System.out.println(obj.u);
		System.out.println(obj.v);
		

	}
	
	public int testSum(int a, int b){
		int c = a+b;
		return c;
	}
	
	
	// call by reference - Only for swapping we using call by reference
	public void swap(CallByValAndCallByRef t){
		int temp;
		temp = t.u;
		t.u = t.v;
		t.v = temp;
		
	}

}
