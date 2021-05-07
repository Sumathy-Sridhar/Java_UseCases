package com.srm.AirVoiceProcessing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class RecordFilters {
	public void FilterRecordByCountry(ArrayList<CustomerData> cdata)
	{
			List <CustomerData> cus=cdata.stream().filter(fil-> fil.Country.equals("Tanzania") && 
				fil.Connectiontype.equals("Postpaid") && fil.vas.equals("False"))
		.collect(Collectors.toList());
		cus.forEach(obj -> System.out.println(" Customer ID:"+ obj.CustomerId + 
    			" CustomerName: "+ obj.CustomerName + " Country : " + obj.Country + 
    			" PhoneNumber : "+ obj.PhoneNumber + " ConnectionType : " + obj.Connectiontype
    			+ " Vas(IsActive): " + obj.vas));
	}
	public void FilterByCountryConType(ArrayList<CustomerData> cdata)
	{
		List<CustomerData> cus=cdata.stream().filter(fl-> fl.Country.equals("South Africa") ||
				fl.Country.equals("Rwanda") &&
				fl.Connectiontype.equals("Prepaid") && fl.vas.equals("True"))
		.map(fl->fl).collect(Collectors.toList());
		cus.forEach(obj -> System.out.println(" Customer ID:"+ obj.CustomerId + 
    			" CustomerName: "+ obj.CustomerName + " Country : " + obj.Country + 
    			" PhoneNumber : "+ obj.PhoneNumber + " ConnectionType : " + obj.Connectiontype
    			+ " Vas(IsActive): " + obj.vas));
	}
	public void SortByPhoneNumber(ArrayList<CustomerData> cdata)
	{
		List<CustomerData>cus=cdata.stream().filter(c-> c.Country.equals("Uganda") && 
				c.PhoneNumber.startsWith("61") && c.vas.equals("True"))
		.map(c->c).collect(Collectors.toList());
		cus.forEach(obj -> System.out.println(" Customer ID:"+ obj.CustomerId + 
    			" CustomerName: "+ obj.CustomerName + " Country : " + obj.Country + 
    			" PhoneNumber : "+ obj.PhoneNumber + " ConnectionType : " + obj.Connectiontype
    			+ " Vas(IsActive): " + obj.vas));
	}
	public void SearchByCustNameAndPhoneNumber(ArrayList<CustomerData> cdata,
			String CustomerName,String PhoneNumber)
	{
		List<CustomerData> cus=cdata.stream().filter(ct-> ct.CustomerName.equals(CustomerName) 
				&& ct.PhoneNumber.equals(PhoneNumber))
		.map(c->c).collect(Collectors.toList());
		cus.forEach(obj -> System.out.println(" Customer ID:"+ obj.CustomerId + 
    			" CustomerName: "+ obj.CustomerName + " Country : " + obj.Country + 
    			" PhoneNumber : "+ obj.PhoneNumber + " ConnectionType : " + obj.Connectiontype
    			+ " Vas(IsActive): " + obj.vas));
	}
	public void PrintByCusId(ArrayList<CustomerData> cdata , String CustomerId)
	{
		List<CustomerData> cus = cdata.stream().filter(fill-> fill.CustomerId.equals(CustomerId))
				.collect(Collectors.toList());
		if(cus.isEmpty())
		{
			System.out.println("No Record Found");
		}
		else
		{
			cus.forEach(obj -> System.out.println(" Customer ID:"+ obj.CustomerId + 
	    			" CustomerName: "+ obj.CustomerName + " Country : " + obj.Country + 
	    			" PhoneNumber : "+ obj.PhoneNumber + " ConnectionType : " + obj.Connectiontype
	    			+ " Vas(IsActive): " + obj.vas));
		}
	}
	public void SortAndUpper(ArrayList<CustomerData> cdata)
	{
		cdata.stream().filter(f-> f.Country.equals("Nigeria") &&
				f.PhoneNumber.startsWith("56"))
		.map((CustomerData cu)->{
			cu.CustomerName=cu.CustomerName.toUpperCase();
			return cu;
		}).forEach(System.out::println);
	}
	public void SortByCNamePhNumber(ArrayList<CustomerData> cda) {
		Collections.sort(cda,new sortNameAndPhone());
		cda.forEach(System.out::println);	
	}
	
	
}