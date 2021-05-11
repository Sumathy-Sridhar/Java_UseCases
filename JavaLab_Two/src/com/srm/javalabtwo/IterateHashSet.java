package com.srm.javalabtwo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Logger;

public class IterateHashSet {
	static Logger log=Logger.getLogger(IterateHashSet.class.getName());
	public static void main(String[] args) {
		
	     HashSet<String> hset = new HashSet<>();
	     hset.add("Brown");
	     hset.add("Cony");
	     hset.add("Peach");
	     hset.add("Goma");
	     hset.add("Milk");
	     log.info("Elements of HashSet: ");
	     log.info(" ");
	     Iterator<String> it = hset.iterator();
	     while(it.hasNext()){
	        log.info(it.next());
	     }
	  }

	}
