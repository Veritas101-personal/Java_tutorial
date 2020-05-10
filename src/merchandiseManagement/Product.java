package merchandiseManagement;

public class Product {

	private String productName;
	private int price;
	private String [] merchant;
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String[] getMerchant() {
		return merchant;
	}
	
	public void setMerchant(String[] merchant) {
		this.merchant = merchant;
	}
	
	public Product (String productName, int price) {
		
	}
	
	public Product() {
		
	}
	
	public static void addProduct (Product merchant[]) {
		
	}
	
}
