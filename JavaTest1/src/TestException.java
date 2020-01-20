
public class TestException {

	public static void main(String[] args) {
		
		
		
		int num1, num2;
		
		try {
			num1 = 0;
			num2 = 5 / num1;
			
		}
		
		catch (ArithmeticException a){
			System.out.println("Can't divide by 0");
			
			
		}
		
		finally {
			
			System.out.println("Try again");
		}

	}

}
