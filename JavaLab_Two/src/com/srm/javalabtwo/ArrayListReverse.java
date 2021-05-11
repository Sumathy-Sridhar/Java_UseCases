package com.srm.javalabtwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
public class ArrayListReverse {
	static Logger log=Logger.getLogger(ArrayListReverse.class.getName());
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
        List<String> l = new ArrayList<>();  
        log.info("Enter n value: ");
        var n =sc.nextInt();
        for(var i=1;i<=n;i++) {
        	l.add(sc.nextLine());
        } 
        Collections.reverse(l);  
        log.info("After Reversing");  
        log.info(l + " ");
        sc.close();
	}

}
