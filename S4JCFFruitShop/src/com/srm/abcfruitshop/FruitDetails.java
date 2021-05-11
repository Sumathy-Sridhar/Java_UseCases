package com.srm.abcfruitshop;
public class FruitDetails {
	String fruitname;
	String fruittype;
	String fruitcolor;
	String distributorname;
	double fruitweight;
	String fruitcategory;
	String location;
	String expirydate;
	int quantity;
	double costperunit;
	double totalcost;
	public FruitDetails(String fruitname, String fruittype,String fruitcolor, String distributorname, double fruitweight, String fruitcategory,
			String location, String expirydate, int quantity, double costperunit, double totalcost) {
		this.fruitname = fruitname;
		this.fruittype = fruittype;
		this.fruitcolor=fruitcolor;
		this.distributorname = distributorname;
		this.fruitweight = fruitweight;
		this.fruitcategory = fruitcategory;
		this.location = location;
		this.expirydate = expirydate;
		this.quantity = quantity;
		this.costperunit = costperunit;
		this.totalcost = totalcost;
	}
	@Override
	public String toString() {
		return "Fruitdetails [fruitName=" + fruitname + ", fruitType=" + fruittype + ",FruitColor=" + fruitcolor+", DistributorName=" + distributorname
				+ ", fruitWeight=" + fruitweight + ", fruitCategory=" + fruitcategory + ", location=" + location
				+ ", expiryDate=" + expirydate + ", quantity=" + quantity + ", costPerUnit=" + costperunit + ", totalcost=" + totalcost
				+ "]";
	}

}
