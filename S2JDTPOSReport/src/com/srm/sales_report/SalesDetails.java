package com.srm.sales_report;

public class SalesDetails implements BaseModel {
	String shopname= "BrownCony E-Mart";
	String address="No.4/11, Bunny street";
	String date="07-05-2021";
	String customerid;
	String groceryname;
	String category;
	float costperitem;
	float quantity;
	double cost;
	double total;
	double grandtotal;
	
	public SalesDetails(String customerid, String groceryname, String category, float costperitem, 
			float quantity) {
		super();
		this.customerid=customerid;
		this.groceryname=groceryname;
		this.category=category;
		this.costperitem=costperitem;
		this.quantity=quantity;
	}
	public SalesDetails() {
		
	}
	double costCalc() {
		cost=costperitem*quantity;
		return cost;
	}
	
	
		
}
