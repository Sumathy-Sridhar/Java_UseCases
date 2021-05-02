package com.srm.JavaLab_Two;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter no of elements of Array : ");
		n=sc.nextInt();
		String[] arr= new String[n];
		System.out.println("Enter array elements: ");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextLine();
		}
		List al = Arrays.asList(arr);

		System.out.println(al);

	}

}
