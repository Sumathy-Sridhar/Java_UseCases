package com.srm.abcfruitshop;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
public class GroceryManipulation {
	static Logger log=Logger.getLogger(GroceryManipulation.class.getName());
	void getGrocery(List<GroceryDetails> arlist )
	{
		for(var i=0;i<arlist.size();i++)
		{
			log.info((arlist.get(i)+ " "));
		}
	}
	void disAndTypeSort(List<GroceryDetails> arlist)
	{
		Collections.sort(arlist,new SortByDisAndType());
		for(var i=0;i<arlist.size();i++)
		{
			log.info(arlist.get(i)+ " ");
		}
	}	

	}

