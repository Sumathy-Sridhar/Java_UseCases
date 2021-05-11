package com.srm.javalabtwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class LinkedListToArrayList {
	static Logger log=Logger.getLogger(LinkedListToArrayList.class.getName());
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
        List<String> l = new ArrayList<>();  
        log.info("Enter n value: ");
        var n =sc.nextInt();
        log.info("Enter LinkedList Elements: ");
        for(var i=1;i<=n;i++) {
        	l.add(sc.nextLine());
        } 
        
	List<String> list = new ArrayList<>(l);
	log.info("Converted ArrayList : ");
	for (String str : list){
	  log.info(str);
	}
	sc.close();
  }
}
