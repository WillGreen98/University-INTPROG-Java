package practical.StockManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;

import practical.mailSystem.MailItem;

public class StockManager {
	private ArrayList<Product> products; // = new ArrayList<Product>();
	
	public StockManager() {
		products = new ArrayList<Product>();
	}
	
	public Product findProduct(int product_ID) {
		int index = 0;
		boolean found = false;
		Product currentStock;
		int stock_ID;
		
		while(index < products.size() && !found) {
			currentStock = products.get(index);
			stock_ID = currentStock.getProduct_ID();
			
			if(stock_ID == product_ID) {
				currentStock.printInfo();
				found = true;
				return currentStock;
			} else {
				index++;
			}
		}
		
		if(!found) {
			System.out.println("Product not found");
		}
		
		return null;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	} 

	public void sellProduct(int product_ID, int quantity) {
		Product stock = findProduct(product_ID);
		stock.setQuantity(stock.getQuantity() - quantity);
	}
	
	public int stockCheck(int product_ID) {
		int stockCheck = 0;
		Iterator<Product> prod_Iterator = products.iterator();
		
		while(prod_Iterator.hasNext()) {
			Product stock = (Product)prod_Iterator.next();
			if(products.equals(product_ID)) {
				stockCheck++;
				return stockCheck;
			}
		}

		return 0;
	}
	
	public void delivery(int product_ID, int quantity) {
		Product stock = findProduct(product_ID);
		stock.setQuantity(stock.getQuantity() + quantity);
	}
	
	public void printInfo() {
		System.out.println();
	} 
}