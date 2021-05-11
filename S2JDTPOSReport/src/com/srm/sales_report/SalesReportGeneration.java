package com.srm.sales_report;
import java.util.Scanner;
import java.util.logging.Logger;
public class SalesReportGeneration {
	static Logger log=Logger.getLogger(SalesReportGeneration.class.getName());
		void generateSalesReport(){
			float quantity;
			float costperitem;
			double cost;
			var total=0.0;
			double cgst;
			double sgst;
			double grandtotal;
			var scan =new Scanner(System.in);
			log.info("Enter the No.of.Items : ");
	     	var n=scan.nextInt();
			var sd=new SalesDetails[n];
			for(var i=0;i<n;i++)
			{
		        scan.nextLine();
				log.info("Enter CustomerId : ");
				String customerid=scan.next();
				log.info("Enter GroceryName : ");
				String groceryname=scan.next();
				log.info("Enter Category: ");
				String category=scan.next();
				log.info("Enter Cost (Per Item) : ");
				costperitem=scan.nextFloat();
				log.info("Enter Quantity: ");
				quantity=scan.nextFloat();
				sd[i]=new SalesDetails(customerid,groceryname, category,quantity, costperitem);
				cost=sd[i].costCalc();
				total+=cost;	
			}
			cgst=total*0.06f;
			sgst=total*0.06f;
			grandtotal=total+cgst+sgst;
			var sad=new SalesDetails();
	var line="======================================================================";
		System.out.printf("%50s",sad.shopname);
		log.info("");
		System.out.printf("%60s",sad.address);
		log.info("");
		log.info(line);
		System.out.printf("%5s","Customer ID :");
		System.out.printf("%5s",sad.customerid);
		log.info("");
		System.out.printf("%5s","Date :");
		System.out.printf("%5s",sad.date);
		log.info("");
		log.info(line);
		var format = "|%1$-5s|%2$-15s|%3$-20s|%4$-10s|%5$-20s\n";
	    System.out.printf(format, "ID", "GROCERY NAME" ,"CATEGORY","QUANTITY","COST");
	    log.info(line);
		for(var i=0;i<n;i++)
		{
			var fmt ="|%1$-5s|%2$-15s|%3$-20s|%4$-10s|%5$-20s\n";
		    System.out.format(fmt,sd[i].customerid,sd[i].groceryname, sd[i].category,sd[i].quantity,
		    		sd[i].cost);
		}
		log.info(line);
		var fmt1 = "|%1$60s|%2$5s\n";
		System.out.format(fmt1,"TOTAL",String.format("%.2f",total));
		System.out.format(fmt1,"C GST(6%)",String.format("%.2f",cgst));
		System.out.format(fmt1,"S GST(6%)",String.format("%.2f",sgst));
		log.info(line);
		System.out.format(fmt1,"GRAND TOTAL",String.format("%.2f",grandtotal));
		log.info(line);
		scan.close();
	}
		
	}


	