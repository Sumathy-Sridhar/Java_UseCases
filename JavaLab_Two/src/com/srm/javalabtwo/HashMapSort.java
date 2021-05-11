package com.srm.javalabtwo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Logger;
public class HashMapSort {
	static Logger log=Logger.getLogger(HashMapSort.class.getName());
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(57, "B");
        hmap.put(1, "S");
        hmap.put(24, "Z");
        hmap.put(02, "X");
        hmap.put(36, "Q");
        hmap.put(66, "K");
        hmap.put(0, "R");

        log.info("Before Sorting:");
        Set<Entry<Integer, String>> set = hmap.entrySet();
        Iterator<Entry<Integer, String>> iterator = set.iterator();
        while(iterator.hasNext()) {
              Entry<Integer, String> me = iterator.next();
              log.info(me.getKey() + ": ");
              log.info(me.getValue()+ "");
        }
        Map<Integer, String> map = new TreeMap<>(hmap); 
        log.info("After Sorting:");
        Set<Entry<Integer, String>> set2 = map.entrySet();
        Iterator<Entry<Integer, String>> iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
             Entry<Integer, String> me2 = iterator2.next();
             log.info(me2.getKey() + ": ");
             log.info(me2.getValue()+ "");
        }
   }

	}

