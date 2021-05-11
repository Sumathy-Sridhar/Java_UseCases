package com.srm.javalabtwo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class ArrayListToString {
	static Logger log=Logger.getLogger(ArrayListToString.class.getName());
	public static void main(String[] args) {
		
		var sc=new Scanner(System.in);
		ArrayList<String> arrlist= new ArrayList<>();  
        log.info("Enter n value: ");
        var n =sc.nextInt();
        log.info("Enter ArrayList Elements: ");
        for(var i=1;i<=n;i++) {
        	arrlist.add(sc.nextLine());
        } 
		var array = new String[arrlist.size()];              
		for(var j =0;j<arrlist.size();j++){
		  array[j] = arrlist.get(j);
		}
		log.info("Coverted string: ");
		for(String k: array)
		{
			log.info(k);
		}
		sc.close();
	}

}
