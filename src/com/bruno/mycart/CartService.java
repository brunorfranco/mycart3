package com.bruno.mycart;

import java.util.List;

public interface CartService {
	
	ShoppingCart getShoppingCart();
	
	List<Product> getProducts();
	
	List<Product> getRecommendations();
	
	Product getProduct(long productId);
	
	List<String> getShippingOptions();
	
	void submitOrderForPayment();
}
