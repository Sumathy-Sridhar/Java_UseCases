package com.srm.ABCFruitShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FruitShop {
	public void getFruits() {
		List<FruitDetails> fd = new ArrayList<FruitDetails>();	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of.Fruits Records : ");
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println("Enter the Fruit Name:");
			String fruitName= sc.next();
			System.out.println("Enter the Fruit Type:");
			String fruitType= sc.next();
			System.out.println("Enter the Fruit Color:");
			String fruitColor= sc.next();
			System.out.println("Enter the Fruit Weight[In Numbers]:");
			double fruitWeightr= sc.nextDouble();
			System.out.println("Enter the Distributor Name:");
			String DistributorName= sc.next();
			System.out.println("Enter the Fruit Category:");
			String fruitcategory= sc.next();
			System.out.println("Enter Your Location:");
			String location= sc.next();
			System.out.println("Enter the ExpiryDate:(Enter Valid Date*) ");
			String expiryDate= sc.next();
			System.out.println("Enter the Quantity:");
			int quantity= sc.nextInt();
			System.out.println("Enter the Cost:[In Numbers]");
			double costPerUnit= sc.nextDouble();
			fd.add(new FruitDetails(fruitName, fruitType, fruitColor, DistributorName,fruitWeightr, fruitcategory, location, expiryDate, quantity, costPerUnit,quantity*costPerUnit));
		}
		
		FruitsManipulation fmanip=new FruitsManipulation();
		fmanip.getFruitArray((ArrayList<FruitDetails>)fd);
		fmanip.serachByDistributor((ArrayList<FruitDetails>)fd,"Ashok");
		fmanip.searchByFruitName((ArrayList<FruitDetails>)fd,"Apple");
		fmanip.searchByLocation((ArrayList<FruitDetails>)fd,"Kashmir");
		}
}
			
