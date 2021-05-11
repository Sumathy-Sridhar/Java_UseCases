package com.srm.abcfruitshop;

public class GroceryDetails {
	String productid;
	String groceryname;
	String grocerytype;
	String wholeSellername;
	double groceryweight;
	String grocerycategory;
	String groceryexpirydate;
	double packetsize;
	double costperpacket;
	double totalcost;
	
	public GroceryDetails(String productid, String groceryname, String grocerytype, String wholeSellername, 
			double groceryweight, String grocerycategory,String groceryexpirydate, double packetsize, 
			double costperpacket, double totalcost)
	 {
		this.productid=productid;
		this.groceryname=groceryname;
		this.grocerytype=grocerytype;
		this.wholeSellername=wholeSellername;
		this.groceryweight=groceryweight;
		this.grocerycategory=grocerycategory;
		this.groceryexpirydate=groceryexpirydate;
		this.packetsize=packetsize;
		this.costperpacket=costperpacket;
		this.totalcost=totalcost;
	}
	
	@Override
	public String toString() {
		return "Grocerydetails [Product ID =  " +productid + "GroceryName= " 
				+groceryname +"GroceryType= "+grocerytype+ "WholeSellerName= "
				+wholeSellername+" GroceryWeight ="+groceryweight+ "GroceryCAtegory= "
				+grocerycategory+"Grocery ExpiryDate = "+groceryexpirydate+ "PacketSize = "
				+packetsize + "Cost (Per Packet) ="+costperpacket+ " TotalCost= "+packetsize*costperpacket+"]";
	}

}
	