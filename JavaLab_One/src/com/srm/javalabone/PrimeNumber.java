package com.srm.javalabone;

import java.util.Scanner;
import java.util.logging.Logger;

public class PrimeNumber {
	static Logger log=Logger.getLogger(PrimeNumber.class.getName());
	void prime(int num) {
		var flag=true;
		if((num==0)||(num==1)){
			log.info(num + " is prime number");
		}
		else if (num<0) {
			log.info("Only Positive values Allowed..");
			flag=false;
		}
		else {
		for(var i=2;i<=num/2;i++) {
			if(num%i==0) {
				log.info(num + " is not a prime number");
				flag=false; 
				break;
			}
		}
	}
		if(flag==true) {
			log.info(num + " is a prime number");
		}
		
	}

	public static void main(String[] args) {
		var scr=new Scanner(System.in);
		log.info("Check if Prime or Not");
		log.info("Enter number : ");
		var num=scr.nextInt();
		var pnm=new PrimeNumber();
		pnm.prime(num);
		scr.close();
	}

}
