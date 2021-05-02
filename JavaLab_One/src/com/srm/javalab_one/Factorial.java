package com.srm.javalab_one;

import java.util.Scanner;

public class Factorial {
	static void facto(int num) {
		int temp, fact=1;
		temp=num;
		if(num<0) {
			System.out.println("Negative numbers not allowed..");
		}else if((num==1) || (num==0)){
			System.out.println("Factorial of "+num+ " is 1");
		}
		else {
			for(int i=1;i<=num;i++) {
				fact=fact*i;
			}
			System.out.println("Factorial of "+ num + " is " + fact);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Factorial...");
		System.out.println("Enter number to find Factorial :");
		int num=sc.nextInt();
		facto(num);
		
	}

}
