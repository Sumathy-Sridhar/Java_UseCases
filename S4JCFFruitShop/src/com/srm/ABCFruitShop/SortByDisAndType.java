package com.srm.ABCFruitShop;

import java.util.Comparator;

public class SortByDisAndType implements Comparator<GroceryDetails> {
	@Override
	public int compare(GroceryDetails grod1 , GroceryDetails grod2) {
		if(grod1.GroceryType.compareTo(grod2.GroceryType)==0)
		{
			return grod1.GroceryExpiryDate.compareTo(grod2.GroceryExpiryDate);
		}
		else
		{
			return grod1.GroceryExpiryDate.compareTo(grod2.GroceryExpiryDate);
		}
	}

}
