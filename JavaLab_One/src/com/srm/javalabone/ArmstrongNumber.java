package com.srm.javalabone;
import java.util.Scanner;
import java.util.logging.Logger;
public class ArmstrongNumber {
	static Logger log=Logger.getLogger(ArmstrongNumber.class.getName());
	static void chkArmstrong(int num) {
		int temp;
		int val;
		var count=0;
		var sum=0;
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
            log.info(val+ " is an Armstrong Number");
        }
        else
        {
            log.info(val+  " is not an Armstrong Number");
        }    
	}

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Armstrong Number...");
		log.info("Enter the Number :");
		var num=sc.nextInt();
		chkArmstrong(num);
		sc.close();
	}

}
