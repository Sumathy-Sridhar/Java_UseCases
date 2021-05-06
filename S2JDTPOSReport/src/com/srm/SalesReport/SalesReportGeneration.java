package com.srm.SalesReport;

import java.util.Scanner;

public class SalesReportGeneration {
		void generateSalesReport(){
			String CustomerId="102we";
			String GroceryName="";
			String Category="";
			float Quantity;
			float CostPerItem;
			double Cost;
			double Total=0;
			double GrandTotal=0;
			double CGST;
			double SGST;
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the No.of.Items : ");
	     	int n=scan.nextInt();
			salesDetails[] sd=new salesDetails[n];
			for(int i=0;i<n;i++)
			{
		        scan.nextLine();
				System.out.println("Enter CustomerId : ");
				 CustomerId=scan.next();
				System.out.println("Enter GroceryName : ");
				GroceryName=scan.next();
				System.out.println("Enter Category: ");
				Category=scan.next();
				System.out.println("Enter Cost (Per Item) : ");
				CostPerItem=scan.nextFloat();
				System.out.println("Enter Quantity: ");
				Quantity=scan.nextFloat();
				sd[i]=new salesDetails(CustomerId,GroceryName, Category,Quantity, CostPerItem);
				Cost=sd[i].costCalc();
				Total+=Cost;	
			}
			CGST=Total*0.06f;
			SGST=Total*0.06f;
			GrandTotal=Total+CGST+SGST;
			salesDetails sad=new salesDetails();
		System.out.println("===========================================================================================");
		System.out.printf("%50s",sad.ShopName);
		System.out.println();
		System.out.printf("%60s",sad.Address);
		System.out.println();
		System.out.println("===========================================================================================");
		System.out.printf("%5s","Customer ID :");
		System.out.printf("%5s",sad.CustomerId);
		System.out.println();
		System.out.printf("%5s","Date :");
		System.out.printf("%5s",sad.Date);
		System.out.println();
		System.out.println("===========================================================================================");
		String format = "|%1$-5s|%2$-15s|%3$-20s|%4$-10s|%5$-20s\n";
	    System.out.format(format, "ID", "GROCERY NAME" ,"CATEGORY","QUANTITY","COST");
	    System.out.println("===========================================================================================");
		for(int i=0;i<n;i++)
		{
			String fmt ="|%1$-5s|%2$-15s|%3$-20s|%4$-10s|%5$-20s\n";
		    System.out.format(fmt,sd[i].CustomerId,sd[i].GroceryName, sd[i].Category,sd[i].Quantity,sd[i].Cost);
		}
		System.out.println("===========================================================================================");
		String fmt = "|%1$60s|%2$5s\n";
		System.out.format(fmt,"TOTAL",String.format("%.2f",Total));
		String fmt1 = "|%1$60s|%2$5s\n";
		System.out.format(fmt1,"C GST(6%)",String.format("%.2f",CGST));
		String fmt2 = "|%1$60s|%2$5s\n";
		System.out.format(fmt2,"S GST(6%)",String.format("%.2f",SGST));
		System.out.println("===========================================================================================");
		String fmt3 = "|%1$60s|%2$5s\n";
		System.out.format(fmt3,"GRAND TOTAL",String.format("%.2f",GrandTotal));
		System.out.println("===========================================================================================");

	}
	}


	