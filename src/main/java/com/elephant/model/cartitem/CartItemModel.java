package com.elephant.model.cartitem;



import com.elephant.domain.uploadproduct.ProductDomain;
import com.elephant.model.customer.CustomerModel;
//import com.elephant.model.cart.CartModel;
import com.elephant.model.uploadproduct.ProductModel;

public class CartItemModel {

	
	private String Sku;
	private int quantity;
	private ProductDomain product;
	
	public String getSku() {
		return Sku;
	}
	public void setSku(String sku) {
		Sku = sku;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ProductDomain getProduct() {
		return product;
	}
	public void setProduct(ProductDomain product) {
		this.product = product;
	}
	
	
}
