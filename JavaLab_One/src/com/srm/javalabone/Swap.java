package com.srm.javalabone;

import java.util.Scanner;
import java.util.logging.Logger;

public class Swap {
	static Logger log=Logger.getLogger(Swap.class.getName());
	static void swapNumbers(int num1, int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		log.info("After Swapping...");
		log.info("num1 : "+num1);
		log.info("num2 : "+num2);
	}

	public static void main(String[] args) {
		
		var sc=new Scanner(System.in);
		log.info("Swapping Two numbers without using Third Varibale...");
		log.info("Enter number 1: ");
		var num1=sc.nextInt();
		log.info("Enter number 2: ");
		var num2=sc.nextInt();
		swapNumbers(num1,num2);
		sc.close();
	}

}
