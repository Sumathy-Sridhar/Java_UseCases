package com.srm.javalabone;

import java.util.Scanner;
import java.util.logging.Logger;

public class RemoveArrayDuplicates {
	static Logger log=Logger.getLogger(RemoveArrayDuplicates.class.getName());
	public static int removeDuplicateElements(int arr[]){
        var index = 1;
       for (var i = 1; i < arr.length; i++) {
           if (arr[i] != arr[index-1])
               arr[index++] = arr[i];
       }

		  return index;
	}
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Removing Duplicate Elements in the array..");
		log.info("Enter array length: ");
		var n=sc.nextInt();
		int[] arr= new int[n];
		log.info("Array Elements: ");
		for(var i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		removeDuplicateElements(arr);
		log.info("\nThe new length of the array is: "+removeDuplicateElements(arr));
		sc.close();
	}

}
