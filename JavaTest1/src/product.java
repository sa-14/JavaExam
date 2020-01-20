
public interface product {
	
	public static final String productName = "";
	public static final int qunatity = 0;
	
	public default String addStock (String productName, int quantity) {
		
		return (productName + quantity);
		
		
	}

	
	public static void main(String[] args) {
		
		
		product pr = new product ();
		
		System.out.println(pr.productName "Brand");
		System.out.println(pr.qunatity);
		
	}
}
