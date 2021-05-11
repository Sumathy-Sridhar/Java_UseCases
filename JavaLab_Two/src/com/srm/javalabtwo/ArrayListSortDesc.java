package com.srm.javalabtwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class ArrayListSortDesc {
	static Logger log=Logger.getLogger(ArrayListSortDesc.class.getName());
	public static void main(String[] args) {
		
		var sc=new Scanner(System.in);
        List<String> arraylist = new ArrayList<>();  
        log.info("Enter n value: ");
        var n =sc.nextInt();
        log.info("Enter ArrayList Elements : ");
        for(var i=1;i<=n;i++) {
        	arraylist.add(sc.nextLine());
        }
        log.info(" ");
        log.info("Before Sorting:");
 	   for(String str: arraylist){
 			log.info(str);
 		}
 	   log.info(" ");
 	   Collections.sort(arraylist, Collections.reverseOrder());
 	   log.info("ArrayList in descending order:");
 	   for(String str: arraylist){
 			log.info(str);
 		}
 	  sc.close();
	}

}
