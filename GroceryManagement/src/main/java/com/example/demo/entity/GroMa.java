package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class GroMa {
	@Id
	private int productId;
	private String productName;
	private int productAmount;
	private String manufacturedDate;
	private String ExpiryDate;
	private int quantity;
	public GroMa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GroMa(int productId, String productName, int productAmount, String manufacturedDate, String expiryDate,
			int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productAmount = productAmount;
		this.manufacturedDate = manufacturedDate;
		ExpiryDate = expiryDate;
		this.quantity = quantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}
	public String getManufacturedDate() {
		return manufacturedDate;
	}
	public void setManufacturedDate(String manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	public String getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}