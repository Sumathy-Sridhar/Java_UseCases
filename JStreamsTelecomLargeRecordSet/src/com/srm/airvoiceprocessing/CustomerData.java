package com.srm.airvoiceprocessing;
public class CustomerData {
	String customerid;
	String customername;
	String country;
	String phonenumber;
	String connectiontype;
	String vas;
	 
	 public CustomerData(String customerid, String customername,String country, String phonenumber,
			 String connectiontype, String vas){
		 this.customerid=customerid;
		 this.customername=customername;
		 this.country=country;
		 this.phonenumber=phonenumber;
		 this.connectiontype=connectiontype;
		 this.vas=vas;
				 
	 }

	@Override
	public String toString() {
		return "CustomerData [CustomerId=" + customerid + ", CustomerName=" + customername + ", Country=" + country
				+ ", PhoneNumber=" + phonenumber + ", Connectiontype=" + connectiontype + ", vas=" + vas + "]";
	}

}
