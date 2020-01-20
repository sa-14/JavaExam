
public class Overloading {
	
	public int sum (int a,int b) {
	
		
		
		return (a + b);
	}
	 
	public int sum (int a, int b, int c) {
		
		return (a + b + c);
	}

	public static void main(String[] args) {
		
		Overloading O = new Overloading ();
		
		System.out.println(O.sum(5, 10));
		System.out.println(O.sum(5, 10, 15));
		
		
		
		
		

	}

}
