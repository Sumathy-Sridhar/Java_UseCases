package com.srm.javalab_one;

import java.util.Scanner;

public class ArmstrongNumber {
	static void chkArmstrong(int num) {
		int temp,val,count=0,sum=0;
		temp=num;
		val=num;
		while(temp > 0)
        {
            temp = temp / 10;
            count++;
        }
        while(num > 0)
        {
            temp = num % 10;
            sum = (int) (sum+Math.pow(temp, count));
            num = num / 10;
        }
        if(sum == val)
        {
            System.out.println(val+ " is an Armstrong Number");
        }
        else
        {
            System.out.println(val+  " is not an Armstrong Number");
        }    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Armstrong Number...");
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		chkArmstrong(num);
	}

}
