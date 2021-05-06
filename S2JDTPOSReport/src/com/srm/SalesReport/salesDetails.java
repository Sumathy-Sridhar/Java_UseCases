package com.srm.SalesReport;

public class salesDetails extends BaseModel {
	String ShopName= "BrownCony E-Mart";
	String Address="No.4/11, Bunny street";
	String Date="07-05-2021";
	String CustomerId;
	String GroceryName;
	String Category;
	float CostPerItem;
	float Quantity;
	double Cost;
	double Total;
	double GrandTotal;
	
	public salesDetails(String CustomerId, String GroceryName, String Category, float CostPerItem, float Quantity) {
		super();
		this.CustomerId=CustomerId;
		this.GroceryName=GroceryName;
		this.Category=Category;
		this.CostPerItem=CostPerItem;
		this.Quantity=Quantity;
	}
	public salesDetails() {
		
	}
	double costCalc() {
		Cost=CostPerItem*Quantity;
		return Cost;
	}
	
	
	/*@Override
	public String toString() {
		return "salesDetails"
				+ " [CustomerId= "+CustomerId+"GroceryName= "+ GroceryName+ "Grocery DEscription= "+ GroceryDescription
				+"CostPerItem = "+ CostPerItem+ "Quantity= "+ Quantity+ "Total= "+ CostPerItem*Quantity+"GrandTotal= "+ Total/0.12+"]";	
	}*/
	
	
}
