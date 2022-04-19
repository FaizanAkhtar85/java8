package com.faizan;
import java.sql.Date;

import javax.xml.crypto.Data;

public class Product implements Comparable<Product>{
	private String productName;
	private int quantity;
	private String invoiceNumber;
	private String place;
	private Date dateOfIssue;
	private String details;
	public Product() {
	}
	public Product(String productName, int quantity, String invoiceNumber, String place, Date dateOfIssue,
			String details) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.invoiceNumber = invoiceNumber;
		this.place = place;
		this.dateOfIssue = dateOfIssue;
		this.details = details;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Date getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", quantity=" + quantity + ", invoiceNumber=" + invoiceNumber
				+ ", place=" + place + ", dateOfIssue=" + dateOfIssue + ", details=" + details + "]";
	}
	@Override
	public int compareTo(Product p2) {
		return (int) ((this.productName.equals(p2.productName))?(this.quantity==p2.quantity?this.invoiceNumber==p2.invoiceNumber:1):1);
		
	}
}
