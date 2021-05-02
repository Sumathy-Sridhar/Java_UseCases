package com.srm.JavaLab_Two;

import java.util.Scanner;

public class ArrayIntersection {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m,i,j;
		System.out.println("Enter no of elements for first Array : ");
		n=sc.nextInt();
		int[] arr1= new int[n];
		System.out.println("Enter array elements: ");
		for( i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter no of elements for second Array : ");
		 m=sc.nextInt();
		int[] arr2= new int[n];
		System.out.println("Enter array elements: ");
		for(j=0;j<m;j++) {
			arr2[j]=sc.nextInt();
		}
	      System.out.print("Intersection of two arrays is: ");
	     for(i=0;i<n;i++) {
	    	 for(j=0;j<m;j++) {
	    		 if(arr1[i]==arr2[j]) {
	    			 System.out.print(arr2[j]+ " ");
	    		 }
	    	 }
}
	}

}
