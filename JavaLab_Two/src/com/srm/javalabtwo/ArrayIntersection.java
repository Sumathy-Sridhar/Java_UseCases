package com.srm.javalabtwo;

import java.util.Scanner;
import java.util.logging.Logger;
public class ArrayIntersection {
	static Logger log=Logger.getLogger(ArrayIntersection.class.getName());
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		int n;
		int m;
		int i;
		int j;
		log.info("Enter no of elements for first Array : ");
		n=sc.nextInt();
		var arr1= new int[n];
		log.info("Enter array elements: ");
		for( i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		log.info("Enter no of elements for second Array : ");
		 m=sc.nextInt();
		var arr2= new int[n];
		log.info("Enter array elements: ");
		for(j=0;j<m;j++) {
			arr2[j]=sc.nextInt();
		}
	      log.info("Intersection of two arrays is: ");
	     for(i=0;i<n;i++) {
	    	 for(j=0;j<m;j++) {
	    		 if(arr1[i]==arr2[j]) {
	    			 log.info(arr2[j]+ " ");
	    		 }
	    	 }
	     }
	   
	sc.close();}
}
