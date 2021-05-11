package com.srm.abcfruitshop;
import java.util.Scanner;
import java.util.logging.Logger;
public class SwitchUserClass {
	static Logger log=Logger.getLogger(SwitchUserClass.class.getName());
	public static void main(String[] args) {
		log.info("WELCOME TO S4JCF FRUIT SHOP !!");
		log.info(" ");
		log.info("Choose the Type of Shop : ");
		log.info("1. Fruits Shop");
		log.info("2. Grocery Shop");
		var scan=new Scanner(System.in);
		var option=scan.nextInt();
		if(option==1) {
			log.info("Welcome to ABC Fruitshop...Here we sell the fruitful fruits for the shape of you!!! ");
			var fshop=new FruitShop();
			fshop.getFruits();
			}
		else if(option==2) {	
			log.info("Welcome to ABC Grocery Store..Get your favourite grocery products all in one place @ lowest price!!");
			var gshop=new GroceryShop();
			gshop.getGrocery();}
		else{
			log.info("Invalid Option...");
			}
		scan.close();
	}
}

