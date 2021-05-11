package com.srm.javalabone;

import java.util.Scanner;
import java.util.logging.Logger;

public class BubbleSort {
	static Logger log=Logger.getLogger(BubbleSort.class.getName());
  static void bubbleSort(int[] arr) {
        int len= arr.length;  
        var temp = 0;  
         for(var i=0; i < len; i++){  
                 for(var j=1; j < (len-i); j++){  
                          if(arr[j-1] > arr[j]){    
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  

	}

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		log.info("Bubble Sort...");
		log.info("Enter n value : ");
		var n=sc.nextInt();
		int[] arr= new int[n];
		log.info("Enter array elements: ");
		for(var i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		log.info("Array Before Bubble Sort");  
        for(var i=0; i < arr.length; i++){  
                log.info(arr[i] + " ");  
        }  
        log.info("");  
        bubbleSort(arr);  
        sc.close();
        log.info("Array After Bubble Sort");  
        for(var i=0; i < arr.length; i++){  
                log.info(arr[i] + " ");  
        }  


	}

}
