package com.srm.javalabone;
import java.util.Scanner;
import java.util.logging.Logger;
public class ReverseNumber {
	static Logger log=Logger.getLogger(ReverseNumber.class.getName());
	void revNumber(int num) {
		var rev=0;
		int n;
		int rem;
		n=num;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		log.info("Reverse of "+n+ " is " +rev);
	}

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Reverse number..");
		log.info("Enter the number: ");
		var num=sc.nextInt();
		var rn=new ReverseNumber();
		rn.revNumber(num);
		sc.close();
	}

}
