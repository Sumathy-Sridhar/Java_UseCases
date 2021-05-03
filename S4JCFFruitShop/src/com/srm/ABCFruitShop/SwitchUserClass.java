package com.srm.ABCFruitShop;

import java.util.Scanner;

public class SwitchUserClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO S4JCF FRUIT SHOP !!");
		System.out.println(" ");
		System.out.println("Choose the Type of Shop : ");
		System.out.println("1. Fruits Shop");
		System.out.println("2. Grocery Shop");
		Scanner scan=new Scanner(System.in);
		int option=scan.nextInt();
		if(option==1) {
			System.out.println("Welcome to ABC Fruitshop...Here we sell the fruitful fruits for the shape of you!!! ");
			FruitShop fshop=new FruitShop();
			fshop.getFruits();
			}
		else if(option==2) {	
			System.out.println("Welcome to ABC Grocery Store..Get your favourite grocery products all in one place @ lowest price!!");
			GroceryShop gshop=new GroceryShop();
			gshop.getGrocery();}
		else{
			System.out.println("Invalid Option...");
			}
	}
}

