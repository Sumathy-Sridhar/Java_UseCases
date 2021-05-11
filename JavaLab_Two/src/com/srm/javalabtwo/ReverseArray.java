package com.srm.javalabtwo;

import java.util.Scanner;
import java.util.logging.Logger;

public class ReverseArray {
	static Logger log=Logger.getLogger(ReverseArray.class.getName());
	public static void main(String[] args) {
		
		var sc=new Scanner(System.in);
		log.info("Enter no of elements of Array : ");
		var n=sc.nextInt();
		var arr= new int[n];
		log.info("Enter array elements: ");
		for( var i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		log.info("Reversed Array: ");
		for(var i=n-1;i>=0;i--) {
			log.info(arr[i]+ " ");
		}
		sc.close();
	}

}
