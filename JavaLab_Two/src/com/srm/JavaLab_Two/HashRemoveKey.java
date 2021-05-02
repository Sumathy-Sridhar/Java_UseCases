package com.srm.JavaLab_Two;

import java.util.HashMap;
import java.util.Map;

public class HashRemoveKey {
	private static void printMap(Map<String, Integer> mapData) {
		// TODO Auto-generated method stub
        for(String str:mapData.keySet()) {
        	System.out.println(str);
        }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map < String, Integer > mapData = new HashMap < String, Integer > ();
        System.out.println("Hashamp Elements: ");
        mapData.put("Brown", 1);
        mapData.put("Cony", 2);
        mapData.put("Milk", 3);
        mapData.put("Peach", 4);
        System.out.println(" ");
        System.out.println("Before Removing Key: ");
        printMap(mapData);
        mapData.remove("Milk");
        System.out.println(" ");
        System.out.println("After Removing Key: ");
        printMap(mapData);
	}
}
