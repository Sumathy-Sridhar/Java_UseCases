package com.srm.AirVoiceProcessing;

public class CustomerData {
	String CustomerId;
	String CustomerName;
	String Country;
	String PhoneNumber;
	String Connectiontype;
	String vas;
	 
	 public CustomerData(String CustomerId, String CustomerName,String Country, String PhoneNumber,
			 String Connectiontype, String vas){
		 this.CustomerId=CustomerId;
		 this.CustomerName=CustomerName;
		 this.Country=Country;
		 this.PhoneNumber=PhoneNumber;
		 this.Connectiontype=Connectiontype;
		 this.vas=vas;
				 
	 }

	@Override
	public String toString() {
		return "CustomerData [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", Country=" + Country
				+ ", PhoneNumber=" + PhoneNumber + ", Connectiontype=" + Connectiontype + ", vas=" + vas + "]";
	}

}
