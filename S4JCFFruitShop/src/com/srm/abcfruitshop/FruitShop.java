package com.srm.abcfruitshop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
public class FruitShop {
	static Logger log=Logger.getLogger( FruitShop.class.getName());
	public void getFruits() {
		List<FruitDetails> fd = new ArrayList<>();	
		var sc = new Scanner(System.in);
		log.info("Enter the no.of.Fruits Records : ");
		var n=sc.nextInt();
		for (var i=0;i<n;i++) {
			log.info("Enter the Fruit Name:");
			String fruitname= sc.next();
			log.info("Enter the Fruit Type:");
			String fruittype= sc.next();
			log.info("Enter the Fruit Color:");
			String fruitcolor= sc.next();
			log.info("Enter the Fruit Weight[In Numbers]:");
			var fruitweight= sc.nextDouble();
			log.info("Enter the Distributor Name:");
			String distributorname= sc.next();
			log.info("Enter the Fruit Category:");
			String fruitcategory= sc.next();
			log.info("Enter Your Location:");
			String location= sc.next();
			log.info("Enter the ExpiryDate:(Enter Valid Date*) ");
			String expirydate= sc.next();
			log.info("Enter the Quantity:");
			var quantity= sc.nextInt();
			log.info("Enter the Cost:[In Numbers]");
			var costperunit= sc.nextDouble();
			fd.add(new FruitDetails(fruitname, fruittype, fruitcolor, distributorname,fruitweight, fruitcategory, location, expirydate, quantity, costperunit,quantity*costperunit));
		}
		sc.close();
		var fmanip=new FruitsManipulation();
		fmanip.getFruitArray(fd);
		fmanip.searchByDistributor(fd,"Ashok");
		fmanip.searchByFruitName(fd,"Apple");
		fmanip.searchByLocation(fd,"Kashmir");
		}
}
			
