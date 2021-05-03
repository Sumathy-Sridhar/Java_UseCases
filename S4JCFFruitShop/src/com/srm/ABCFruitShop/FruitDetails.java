package com.srm.ABCFruitShop;

public class FruitDetails {
	String fruitName;
	String fruitType;
	String fruitColor;
	String DistributorName;
	double fruitWeight;
	String fruitCategory;
	String location;
	String expiryDate;
	int quantity;
	double costPerUnit;
	double totalcost;

	
	public FruitDetails(String fruitName, String fruitType,String fruitColor, String distributorName, double fruitWeight, String fruitCategory,
			String location, String expiryDate, int quantity, double costPerUnit, double totalcost) {
		
		this.fruitName = fruitName;
		this.fruitType = fruitType;
		this.fruitColor=fruitColor;
		this.DistributorName = distributorName;
		this.fruitWeight = fruitWeight;
		this.fruitCategory = fruitCategory;
		this.location = location;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
		this.costPerUnit = costPerUnit;
		this.totalcost = totalcost;
	}
	@Override
	public String toString() {
		return "Fruitdetails [fruitName=" + fruitName + ", fruitType=" + fruitType + ",FruitColor=" + fruitColor+", DistributorName=" + DistributorName
				+ ", fruitWeight=" + fruitWeight + ", fruitCategory=" + fruitCategory + ", location=" + location
				+ ", expiryDate=" + expiryDate + ", quantity=" + quantity + ", costPerUnit=" + costPerUnit + ", totalcost=" + totalcost
				+ "]";
	}

}
