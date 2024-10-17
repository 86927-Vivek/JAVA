package com.sunbeam.assignment3.question1;

public class Invoice {

	private String number;
	private String description;
	private int quantity;
	private double price;

	public Invoice(String number, String description, int quantity, double price) {
		super();
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int newQuantity) {

		this.quantity = newQuantity;

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double newPrice) {

		this.price = newPrice;

	}

	public double getInvoice() {
		if (this.price < 0) {
			this.price = 0.0;
		} else if (this.quantity < 0) {
			this.quantity = 0;
		}
		return this.price * this.quantity;
	}

	public static void main(String[] args) {
		Invoice invoiceOne = new Invoice("46161IiI", "this is invoice", 2, 500);
		System.out.println("Details of invoiceOne: ");
		System.out.println("Number -> " + invoiceOne.getNumber());
		System.out.println("Description -> " + invoiceOne.getDescription());
		System.out.println("Quantity ->" + invoiceOne.getQuantity());
		System.out.println("Price ->" + invoiceOne.getPrice());
		System.out.println("Amount : Quantity * Price ");
		System.out.println("Invoice : " + invoiceOne.getInvoice());
		System.out.println("-----------------------------------------------");
		System.out.println("Details of invoiceTwo: ");
		Invoice invoiceTwo = new Invoice("46161IiI", "this is invoice", -2, 500);
		System.out.println("Details of invoiceOne: ");
		System.out.println("Number -> " + invoiceTwo.getNumber());
		System.out.println("Description -> " + invoiceTwo.getDescription());
		System.out.println("Quantity ->" + invoiceTwo.getQuantity());
		System.out.println("Price ->" + invoiceTwo.getPrice());
		System.out.println("Amount : Quantity * Price ");
		System.out.println("Invoice : " + invoiceTwo.getInvoice());
		System.out.println("-----------------------------------------------");
		System.out.println("Details of invoiceTwo: ");
		Invoice invoiceThree = new Invoice("46161IiI", "this is invoice", 2, -500);
		System.out.println("Details of invoiceOne: ");
		System.out.println("Number -> " + invoiceThree.getNumber());
		System.out.println("Description -> " + invoiceThree.getDescription());
		System.out.println("Quantity ->" + invoiceThree.getQuantity());
		System.out.println("Price ->" + invoiceThree.getPrice());
		System.out.println("Amount : Quantity * Price ");
		System.out.println("Invoice : " + invoiceThree.getInvoice());
	}

}
