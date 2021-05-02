package com.srm.javalab_one;

import java.util.Scanner;

public class PrimeNumber {
	void prime(int num) {
		boolean flag=true;
		if((num==0)||(num==1)){
			System.out.println(num + " is prime number");
		}
		else if (num<0) {
			System.out.println("Only Positive values Allowed..");
			flag=false;
		}
		else {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(num + " is not a prime number");
				flag=false; 
				break;
			}
		}
	}
		if(flag==true) {
			System.out.println(num + " is a prime number");
		}
		
	}

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Check if Prime or Not");
		System.out.println("Enter number : ");
		int num=scr.nextInt();
		PrimeNumber pnm=new PrimeNumber();
		pnm.prime(num);
	}

}
