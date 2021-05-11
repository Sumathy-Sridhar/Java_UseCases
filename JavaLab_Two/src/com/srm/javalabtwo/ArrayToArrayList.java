package com.srm.javalabtwo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class ArrayToArrayList {
	static Logger log=Logger.getLogger(ArrayToArrayList.class.getName());
	public static void main(String[] args) {
		
		var sc=new Scanner(System.in);
		log.info("Enter no of elements of Array : ");
		var n=sc.nextInt();
		var arr= new String[n];
		log.info("Enter array elements: ");
		for( var i=0;i<n;i++) {
			arr[i]=sc.nextLine();
		}
		var al = Arrays.asList(arr);

		log.info(al + " ");
		sc.close();
	}

}
