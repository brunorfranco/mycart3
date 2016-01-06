package com.bruno.mycart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	private CartService cartService;
	
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	@RequestMapping("/home")
	public ModelMap doHome() {
		ModelMap model = new ModelMap();
		model.addAttribute("shoppingCart", cartService.getShoppingCart());
		model.addAttribute("products", cartService.getProducts());
		return model;
	}
}
