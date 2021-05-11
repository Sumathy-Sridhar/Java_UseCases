package com.srm.airvoiceprocessing;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
public class RecordFilters {
	static Logger log=Logger.getLogger(RecordFilters.class.getName());
	public void filterRecordbyCountry(List<CustomerData> cdata)
	{
			List <CustomerData> cus=cdata.stream().filter(fil-> fil.country.equals("Tanzania") && 
				fil.connectiontype.equals("Postpaid") && fil.vas.equals("False"))
		.collect(Collectors.toList());
		cus.forEach(obj -> log.info("customer_id:"+ obj.customerid + 
    			"customer_name: "+ obj.customername + "country : " + obj.country + 
    			"phone_number : "+ obj.phonenumber + "connection_type : " + obj.connectiontype
    			+ "vas(is_active): " + obj.vas));
	}
	public void filterbyCountryconntype(List<CustomerData> cdata)
	{
		List<CustomerData> cus=cdata.stream().filter(fl-> fl.country.equals("South Africa") ||
				fl.country.equals("Rwanda") &&
				fl.connectiontype.equals("Prepaid") && fl.vas.equals("True"))
		.map(fl->fl).collect(Collectors.toList());
		cus.forEach(obj -> log.info(" customer_id:"+ obj.customerid + 
    			" customer_name: "+ obj.customername + " country : " + obj.country + 
    			" phone_number : "+ obj.phonenumber + " connection_type : " + obj.connectiontype
    			+ " vas(is_active): " + obj.vas));
	}
	public void sortbyPhonenumber(List<CustomerData> cdata)
	{
		List<CustomerData>cus=cdata.stream().filter(c-> c.country.equals("Uganda") && 
				c.phonenumber.startsWith("61") && c.vas.equals("True"))
		.map(c->c).collect(Collectors.toList());
		cus.forEach(obj -> log.info(" customer_id:"+ obj.customerid + 
    			" customer_name: "+ obj.customername + " country : " + obj.country + 
    			" phone_number : "+ obj.phonenumber + " connection_type : " + obj.connectiontype
    			+ " vas(is_active): " + obj.vas));
	}
	public void searchbyCustnamePhonenum(List<CustomerData> cdata,
			String customername,String phonenumber)
	{
		List<CustomerData> cus=cdata.stream().filter(ct-> ct.customername.equals(customername) 
				&& ct.phonenumber.equals(phonenumber))
		.map(c->c).collect(Collectors.toList());
		cus.forEach(obj -> log.info(" Customer ID:"+ obj.customerid + 
    			"customername: "+ obj.customername + "country : " + obj.country + 
    			"phonenumber : "+ obj.phonenumber + "connectiontype : " + obj.connectiontype
    			+ "vas(IsActive): " + obj.vas));
	}
	public void printbyCustid(List<CustomerData> cdata , String customerid)
	{
		List<CustomerData> cus = cdata.stream().filter(fill-> fill.customerid.equals(customerid))
				.collect(Collectors.toList());
		if(cus.isEmpty())
		{
			log.info("No Record Found");
		}
		else
		{
			cus.forEach(obj -> log.info("Customer ID:"+ obj.customerid + 
	    			" CustomerName: "+ obj.customername + " Country : " + obj.country + 
	    			" PhoneNumber : "+ obj.phonenumber + " ConnectionType : " + obj.connectiontype
	    			+ " vas (is_active): " + obj.vas));
		}
	}
	public void sortAndCovertUpper(List<CustomerData> cdata)
	{
		List<CustomerData> cus= cdata.stream().filter(f-> f.country.equals("Nigeria") &&
				f.phonenumber.startsWith("56"))
		.map((CustomerData cu)->{
			cu.customername=cu.customername.toUpperCase();
			return cu;
		}).collect(Collectors.toList());
		cus.forEach(obj -> log.info(" Customer ID:"+ obj.customerid + 
    			" CustomerName: "+ obj.customername + " Country : " + obj.country + 
    			" PhoneNumber : "+ obj.phonenumber + " ConnectionType : " + obj.connectiontype
    			+ " Vas(IsActive): " + obj.vas));
	}
	public void sortbyCnameandPhone(List<CustomerData> cda) {
		Collections.sort(cda,new SortNameAndPhone());
		for(var i=0;i<cda.size();i++) {
			log.fine(cda + " ");
		}
	}
	
	
}