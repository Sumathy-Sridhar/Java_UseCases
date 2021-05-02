package com.srm.javalab_one;
import java.util.Scanner;
public class ReverseNumber {
	void revNumber(int num) {
		int rev=0,n, rem;
		n=num;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of "+n+ " is " +rev);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Reverse number..");
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		ReverseNumber rn=new ReverseNumber();
		rn.revNumber(num);
	}

}
