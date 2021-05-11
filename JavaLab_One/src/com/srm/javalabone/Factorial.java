package com.srm.javalabone;
import java.util.Scanner;
import java.util.logging.Logger;
public class Factorial {
	static Logger log=Logger.getLogger(Factorial.class.getName());
	static void facto(int num) {
		var fact=1;
		if(num<0) {
			log.info("Negative numbers not allowed..");
		}else if((num==1) || (num==0)){
			log.info("Factorial of "+num+ " is 1");
		}
		else {
			for(var i=1;i<=num;i++) {
				fact=fact*i;
			}
			log.info("Factorial of "+ num + " is " + fact);
		}
		
	}
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Factorial...");
		log.info("Enter number to find Factorial :");
		var num=sc.nextInt();
		facto(num);
		sc.close();
		
	}

}
