package com.srm.abcfruitshop;
import java.util.Comparator;
import java.util.logging.Logger;
public class SortByDisAndType implements Comparator<GroceryDetails> {
	static Logger log=Logger.getLogger(SortByDisAndType.class.getName());
	@Override
	public int compare(GroceryDetails grod1 , GroceryDetails grod2) {
		if(grod1.grocerytype.compareTo(grod2.grocerytype)==0)
		{
			return grod1.groceryexpirydate.compareTo(grod2.groceryexpirydate);
		}
		else
		{
			return 0;
		}
	}

}
