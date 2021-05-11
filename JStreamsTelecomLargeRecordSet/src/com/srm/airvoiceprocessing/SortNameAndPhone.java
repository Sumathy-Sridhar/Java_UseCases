package com.srm.airvoiceprocessing;
import java.util.Comparator;
public class SortNameAndPhone implements Comparator<CustomerData> {
		@Override
		public int compare(CustomerData cd1, CustomerData cd2) {
			int val=cd1.customername.compareTo(cd2.customername);
			if(cd1.customername.equals(cd2.customername))
			{
				return cd1.phonenumber.compareTo(cd2.phonenumber);
			}
			else
			{
				return val;
			}
		}
}



