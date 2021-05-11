package com.srm.abcfruitshop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
public class GroceryShop {
	static Logger log=Logger.getLogger(GroceryShop.class.getName());
	public void getGrocery() {
		List<GroceryDetails> gd = new ArrayList<>();	
		var sc = new Scanner(System.in);
		log.info("Enter the no.of.Grocery Records : ");
		var n=sc.nextInt();
		for (var i=0;i<n;i++) {
			log.info("Enter Product Identification Number : ");
			var productid=sc.next();
			log.info("Enter Grocery Name : ");
			String groceryname=sc.next();
			log.info("Enter Grocery Type: ");
			String grocerytype=sc.next();
			log.info("Enter WholeSeller Name :");
			String wholesellername=sc.next();
			log.info("Enter Grocery Weight :");
			var groceryweight=sc.nextDouble();
			log.info("Enter Grocery Category : ");
			String grocerycategory=sc.next();
			log.info("Enter Grocery ExpiryDate (Enter Valid Date *) :");
			String groceryexpirydate=sc.next();
			log.info("Enter Packet Size (In grams) :");
			var packetsize=sc.nextDouble();
			log.info("Enter Cost (Per Packet) :");
			var costperpacket=sc.nextDouble();
			gd.add(new GroceryDetails(productid,groceryname, grocerytype,wholesellername,groceryweight, grocerycategory,groceryexpirydate,packetsize, costperpacket,packetsize*costperpacket));
		}
		var gromanip=new GroceryManipulation();
		gromanip.getGrocery(gd);
		gromanip.disAndTypeSort(gd);
	sc.close();
	}
}

