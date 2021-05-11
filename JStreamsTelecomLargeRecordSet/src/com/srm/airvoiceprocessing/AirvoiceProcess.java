package com.srm.airvoiceprocessing;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.List;
public class AirvoiceProcess implements BaseModel{
	static Logger log=Logger.getLogger(AirvoiceProcess.class.getName());
	public static void main(String[] args) {
		var pre="Prepaid";
		var pos="Postpaid";
		var fal="False";
		var tru="True";
		var tan="Tanzania";		
		List<CustomerData> cdata=new ArrayList<>();
		cdata.add(new CustomerData("AV01","Brown","India","9874446466",pre,tru));
		cdata.add(new CustomerData("AV02","Cony","Uganda","6104661566",pre,tru));
		cdata.add(new CustomerData("AV03","Lavin","Nigeria","56721456794",pos,fal));
		cdata.add(new CustomerData("AV04","Sally",tan,"7845646461",pre,fal));
		cdata.add(new CustomerData("AV05","Sumathy","Nigeria","5674214589",pos,fal));
		cdata.add(new CustomerData("AV06","Aishu","SouthAfrica","2548989799",pre,tru));
		cdata.add(new CustomerData("AV07","John",tan,"9874457896",pos,fal));
		cdata.add(new CustomerData("AV08","Regina","Uganda","6148774942",pos,tru));
		cdata.add(new CustomerData("AV09","Cresantra","South Africa","97897944145",pre,tru));
		cdata.add(new CustomerData("AV10","Sumathy","Rwanda","9176842875",pre,tru));
		var sc=new Scanner(System.in);
		log.info("1. Fetch first 5 records");
		log.info("""
				2. Find all the records where the Customer is from “Tanzania” "
				, and has Postpaid connection with 
				, no VAS enabled
				 """);
		log.info("""
				3.Find all the records where the Customer is from “South Africa” 
				, & “Rwanda” and has Prepaid
				 , connection with atleast one VAS enabled
				 """);
		log.info("""
				4.Perform Sorting Operations as follows :
				 , i) Find all phones that starts with “61*”
				 , ii) And Customer’s base country should be “Uganda”
				 , iii) And vas Activated
				""");
		log.info("5. Print Record based on CustomerName and PhoneNumber");
		log.info("6. Print Customer Details based on CustomerId ");
		log.info("""
				7. Perform Sorting Operations as follows :
				 , Find all phones that starts with “56*”
				 , And Customer’s base country should be “Nigeria”
				 , And convert all Customer's name to uppercase
				 """);
		log.info("8. Print the Content of collection details in single line");
		log.info("9. Print Records After sorting Based on customer Name and Phone Number");
		log.info("10. Display All AirVoice Cusotmer Records");
		log.info("Enter choice: ");
		var choice=sc.nextInt();
		var line="-----------------------------------------------------------------------------";
		log.info(line);
		switch(choice) {
		case 1:
			log.info("Displaying First 5 records..");
			log.info(line);
        	List<CustomerData> cus = cdata.stream() .limit(5).collect(Collectors.toList());
		    cus.forEach(obj -> log.info("Customer ID:"+ obj.customerid + 
		    			"CustomerName: "+ obj.customername + "Country : " + obj.country + 
		    			"PhoneNumber : "+ obj.phonenumber + "ConnectionType : " + obj.connectiontype + "Vas (IsActive): " + obj.vas));
       break;
	case 2:
		log.info("Displaying all the records where the Customer is from “Tanzania” and has Postpaid connection with\r\n"
				+ "");
		log.info(line);
		var rf=new RecordFilters();
		rf.filterRecordbyCountry(cdata);
		break;
	case 3:
		log.info("""
				Displaying all the records where the Customer is from “South Africa”"
				,  & “Rwanda” and has Prepaid
				, connection with atleast one VAS enabled
				""");
		log.info(line);
		var r=new RecordFilters();
		r.filterbyCountryconntype(cdata);
		break;
	case 4: log.info("""
			  Displaying records after performing Sorting Operations: 
			, i) Find all phones that starts with “61*”
			 , ii) And Customer’s base country should be “Uganda”
			 , iii) And vas Activated
			 """);
	log.info(line);
		var rl=new RecordFilters();
		rl.sortbyPhonenumber(cdata);
		break;
	case 5: 
		log.info("Displaying Records Based on CustomerName and PhoneNumber...");
		log.info(line);
		var rec=new RecordFilters();
		log.info("Enter Customer Name : ");
		String customername=sc.next();
		log.info("Enter Phone Number: ");
		String phonenumber=sc.next();
		rec.searchbyCustnamePhonenum(cdata, customername, phonenumber);
		break;
	case 6: 
		log.info("Displaying Customer Details Based on CustomerID : ");
		log.info(line);
		var ref=new RecordFilters();
		log.info("Enter CustomerId :");
		String customerid=sc.next();
		ref. printbyCustid(cdata, customerid);
		break;
	case 7: 
		log.info("""
			Displaying records after sorting based on Find all phones that starts with “56*"
			 , And Customer’s base country should be Nigeria
			 , And convert all Customer's name to Uppercase
			""");
	log.info(line);
	var rd=new RecordFilters();
	rd.sortAndCovertUpper(cdata);
	break;
	case 8:
	log.info("Displaying the content of collections in single line");
	log.info(line);
	log.fine(cdata + "");
	break;
	case 9:
	log.info("Displaying Results after Sorting Based on CustomerName and Phone Number");
	log.info("----------------------------------------------------");
	var rt=new RecordFilters();
	rt.sortbyCnameandPhone(cdata);
	break;
	case 10: log.info("Displaying All AirVoiceCustomer records..");
	log.info("----------------------------------------------------");
	List<CustomerData> cust = cdata.stream().collect(Collectors.toList());
    cust.forEach(obj -> log.info("Customer ID:"+ obj.customerid + 
    			"CustomerName: "+ obj.customername + "Country : " + obj.country + 
    			"PhoneNumber : "+ obj.phonenumber + "ConnectionType : " + obj.connectiontype + "Vas (IsActive): " + obj.vas));
    break;
	default:log.info("Invalid Choice...");
	sc.close();
		}
	}
	
}
