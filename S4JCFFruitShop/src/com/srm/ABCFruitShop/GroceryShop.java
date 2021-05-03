package com.srm.ABCFruitShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryShop {
	public void getGrocery() {
		List<GroceryDetails> gd = new ArrayList<GroceryDetails>();	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of.Grocery Records : ");
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println("Enter Product Identification Number : ");
			String ProductId=sc.next();
			System.out.println("Enter Grocery Name : ");
			String GroceryName=sc.next();
			System.out.println("Enter Grocery Type: ");
			String GroceryType=sc.next();
			System.out.println("Enter WholeSeller Name :");
			String WholeSellerName=sc.next();
			System.out.println("Enter Grocery Weight :");
			double GroceryWeight=sc.nextDouble();
			System.out.println("Enter Grocery Category : ");
			String GroceryCategory=sc.next();
			System.out.println("Enter Grocery ExpiryDate (Enter Valid Date *) :");
			String GroceryExpiryDate=sc.next();
			System.out.println("Enter Packet Size (In grams) :");
			double PacketSize=sc.nextDouble();
			System.out.println("Enter Cost (Per Packet) :");
			double CostPerPacket=sc.nextDouble();
			System.out.println("Enter Total Cost :");
			double TotalCost=sc.nextDouble();
			gd.add(new GroceryDetails(ProductId,GroceryName, GroceryType,WholeSellerName,GroceryWeight, GroceryCategory,GroceryExpiryDate, PacketSize, CostPerPacket,PacketSize*CostPerPacket));

		}
		GroceryManipulation gromanip=new GroceryManipulation();
		gromanip.getGrocery((ArrayList<GroceryDetails>)gd);
		gromanip.DisAndTypeSort((ArrayList<GroceryDetails>)gd);
	
	}
}

