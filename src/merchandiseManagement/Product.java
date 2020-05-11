package merchandiseManagement;

public class Product {

	private String productName;
	private int price;
	int proNum = 0;
	
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
	
	
	public void print() {
		
		++proNum;

		System.out.printf("%d. 상품명 : %s,가격 : %d\n",proNum,productName,price);
			
	}
	
	
	public Product (String productName, int price) {
		addProduct(productName, price);
		
	}

	public Product() {
		
	}
	
	public void addProduct (String productName, int price) {
		
		this.productName = productName;
		this.price = price;
	}
	
	
}
