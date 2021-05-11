package com.srm.javalabtwo;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class HashRemoveKey {
	static Logger log=Logger.getLogger(HashRemoveKey.class.getName());
	private static void printMap(Map<String, Integer> mapData) {
        for(String str:mapData.keySet()) {
        	log.info(str);
        }
		
	}
	public static void main(String[] args) {
	
        Map < String, Integer > mapData = new HashMap <> ();
        log.info("Hashamp Elements: ");
        mapData.put("Brown", 1);
        mapData.put("Cony", 2);
        mapData.put("Milk", 3);
        mapData.put("Peach", 4);
        log.info(" ");
        log.info("Before Removing Key: ");
        printMap(mapData);
        mapData.remove("Milk");
        log.info(" ");
        log.info("After Removing Key: ");
        printMap(mapData);
	}
}
