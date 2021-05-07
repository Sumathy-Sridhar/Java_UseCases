package com.srm.AirVoiceProcessing;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class AirVoiceProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CustomerData> cdata=new ArrayList<CustomerData>();
		cdata.add(new CustomerData("AV01","Brown","India","9874446466","Prepaid","True"));
		cdata.add(new CustomerData("AV02","Cony","Uganda","6104661566","Prepaid","True"));
		cdata.add(new CustomerData("AV03","Lavin","Nigeria","56721456794","Postpaid","False"));
		cdata.add(new CustomerData("AV04","Sally","Tanzania","7845646461","Postpaid","False"));
		cdata.add(new CustomerData("AV05","Sumathy","Nigeria","5674214589","Postpaid","False"));
		cdata.add(new CustomerData("AV06","Aishu","SouthAfrica","2548989799","Prepaid","True"));
		cdata.add(new CustomerData("AV07","John","Tanzania","9874457896","Postpaid","False"));
		cdata.add(new CustomerData("AV08","Regina","Uganda","6148774942","Postpaid","True"));
		cdata.add(new CustomerData("AV09","Cresantra","South Africa","97897944145","Prepaid","True"));
		cdata.add(new CustomerData("AV10","Sumathy","Rwanda","9176842875","Prepaid","True"));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Fetch first 5 records");
		System.out.println("2. Find all the records where the Customer is from “Tanzania” and has Postpaid connection with\r\n"
				+ "no VAS enabled");
		System.out.println("3.Find all the records where the Customer is from “South Africa” & “Rwanda” and has Prepaid\r\n"
				+ "connection with atleast one VAS enabled");
		System.out.println("4.Perform Sorting Operations as follows\r\n"
				+ "1. Find all phones that starts with “61*”\r\n"
				+ "2. And Customer’s base country should be “Uganda”\r\n"
				+ "3. And vas Activated");
		System.out.println("5. Print Record based on CustomerName and PhoneNumber");
		System.out.println("6. Print Customer Details based on CustomerId ");
		System.out.println("7. Perform Sorting Operations as follows\r\n"
				+ "Find all phones that starts with “56*”\r\n"
				+ " And Customer’s base country should be “Nigeria”\r\n"
				+ " And convert all Customer's name to uppercase");
		System.out.println("8. Print the Content of collection details in single line");
		System.out.println("9. Print Records After sorting Based on customer Name and Phone Number");
		System.out.println("10. Display All AirVoice Cusotmer Records");
		System.out.println("Enter choice: ");
		int choice=sc.nextInt();
		System.out.println("----------------------------------------------------");
		switch(choice) {
		case 1:
			System.out.println("Displaying First 5 records..");
			System.out.println("----------------------------------------------------");
        	List<CustomerData> cus = cdata.stream() .limit(5).collect(Collectors.toList());
		    cus.forEach(obj -> System.out.println("Customer ID:"+ obj.CustomerId + 
		    			"CustomerName: "+ obj.CustomerName + "Country : " + obj.Country + 
		    			"PhoneNumber : "+ obj.PhoneNumber + "ConnectionType : " + obj.Connectiontype + "Vas (IsActive): " + obj.vas));
       break;
	case 2:
		System.out.println("Displaying all the records where the Customer is from “Tanzania” and has Postpaid connection with\r\n"
				+ "");
		System.out.println("----------------------------------------------------");
		RecordFilters rf=new RecordFilters();
		rf.FilterRecordByCountry(cdata);
		break;
	case 3:
		System.out.println("Displaying all the records where the Customer is from “South Africa” & “Rwanda” and has Prepaid\r\n"
				+ "connection with atleast one VAS enabled");
		System.out.println("----------------------------------------------------");
		RecordFilters r=new RecordFilters();
		r.FilterByCountryConType(cdata);
		break;
	case 4: System.out.println("Displaying records after performing Sorting Operations: "
			+ "1. Find all phones that starts with “61*”\r\n"
			+ "2. And Customer’s base country should be “Uganda”\r\n"
			+ "3. And vas Activated ");
	System.out.println("----------------------------------------------------");
		RecordFilters rl=new RecordFilters();
		rl.SortByPhoneNumber(cdata);
		break;
	case 5: 
		System.out.println("Displaying Records Based on CustomerName and PhoneNumber...");
		System.out.println("----------------------------------------------------");
		RecordFilters rec=new RecordFilters();
		System.out.println("Enter Customer Name : ");
		String CustomerName=sc.next();
		System.out.println("Enter Phone Number: ");
		String PhoneNumber=sc.next();
		rec.SearchByCustNameAndPhoneNumber(cdata, CustomerName, PhoneNumber);
		break;
	case 6: 
		System.out.println("Displaying Customer Details Based on CustomerID : ");
		System.out.println("----------------------------------------------------");
		RecordFilters ref=new RecordFilters();
		System.out.println("Enter CustomerId :");
		String CustomerId=sc.next();
		ref.PrintByCusId(cdata, CustomerId);
		break;
	case 7: System.out.println("Displaying records after sorting based on Find all phones that starts with “56*”\\r\\n\"\r\n"
			+" And Customer’s base country should be “Nigeria”\\r\\n\"\r\n"
			+" And convert all Customer's name to uppercase");
	System.out.println("----------------------------------------------------");
	RecordFilters rd=new RecordFilters();
	rd.SortAndUpper(cdata);
	break;
	case 8: System.out.println("Displaying the content of collections in single line");
	System.out.println("----------------------------------------------------");
	System.out.println(cdata);
	break;
	case 9: System.out.println("Displaying Results after Sorting Based on CustomerName and Phone Number");
	System.out.println("----------------------------------------------------");
	RecordFilters rt=new RecordFilters();
	rt.SortByCNamePhNumber(cdata);
	break;
	case 10: System.out.println("Displaying All AirVoiceCustomer records..");
	System.out.println("----------------------------------------------------");
	List<CustomerData> cust = cdata.stream().collect(Collectors.toList());
    cust.forEach(obj -> System.out.println("Customer ID:"+ obj.CustomerId + 
    			"CustomerName: "+ obj.CustomerName + "Country : " + obj.Country + 
    			"PhoneNumber : "+ obj.PhoneNumber + "ConnectionType : " + obj.Connectiontype + "Vas (IsActive): " + obj.vas));
    break;
	default:System.out.println("Invalid Choice...");
		}
	}
	
}
