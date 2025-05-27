package com.product;

import com.manufacturer.Manufacturer;

public class Product {
	private String productName;
	private String category;
	private double price;
	private Manufacturer manufacturer;
	private Product (String productName,String category, double price, Manufacturer manufacturer ) {
		this.productName=productName;
		this.category=category;
		this.price=price;
		this.manufacturer=manufacturer;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price<0 ) {
			this.price=0;
		}
		else 
		this.price = price;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setProduct(Manufacturer manufacturer) {
		if (manufacturer==null) {
			this.manufacturer=null;
		}
		else 
		this.manufacturer = manufacturer;
	}
	
		@Override
	public String toString() {
		return "Product [productName=" + productName + ", category=" + category + ", price=" + price + ", Manufacturer="
				+ manufacturer + "]";
	}
		public static Product getProductObject(String productName, String category,double price, Manufacturer manufacturer) {
		return new Product(productName, category, price,manufacturer);
	}
		
}
