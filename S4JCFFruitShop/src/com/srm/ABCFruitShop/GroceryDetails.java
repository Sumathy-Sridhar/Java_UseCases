package com.srm.ABCFruitShop;

public class GroceryDetails {
	String ProductId;
	String GroceryName;
	String GroceryType;
	String WholeSellerName;
	double GroceryWeight;
	String GroceryCategory;
	String GroceryExpiryDate;
	double PacketSize;
	double CostPerPacket;
	double TotalCost;
	
	public GroceryDetails(String ProductId, String GroceryName, String GroceryType, String WholeSellerName, double GroceryWeight, String GroceryCategory,String GroceryExpiryDate, double PacketSize, double CostPerPacket, double TotalCost)
	 {
		this.ProductId=ProductId;
		this.GroceryName=GroceryName;
		this.GroceryType=GroceryType;
		this.WholeSellerName=WholeSellerName;
		this.GroceryWeight=GroceryWeight;
		this.GroceryCategory=GroceryCategory;
		this.GroceryExpiryDate=GroceryExpiryDate;
		this.PacketSize=PacketSize;
		this.CostPerPacket=CostPerPacket;
		this.TotalCost=TotalCost;
	}
	
	@Override
	public String toString() {
		return "Grocerydetails [Product ID =  " +ProductId + "GroceryName= " 
				+GroceryName +"GroceryType= "+GroceryType+ "WholeSellerName= "
				+WholeSellerName+" GroceryWeight ="+GroceryWeight+ "GroceryCAtegory= "
				+GroceryCategory+"Grocery ExpiryDate = "+GroceryExpiryDate+ "PacketSize = "
				+PacketSize + "Cost (Per Packet) ="+CostPerPacket+ " TotalCost= "+PacketSize*CostPerPacket+"]";
	}

}
	