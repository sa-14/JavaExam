
public class Overriding {
	
	 
		
		void show (){
			System.out.println("Parent class");
			
		}
		

	

	public static void main(String[] args) {
		
		
		child p = new child ();
		p.show();
		
		Overriding c = new Overriding ();
		c.show();
		
		
		

	}

}
