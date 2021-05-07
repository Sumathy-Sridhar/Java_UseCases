package com.srm.AirVoiceProcessing;

import java.util.Comparator;

public class sortNameAndPhone implements Comparator<CustomerData> {
		@Override
		public int compare(CustomerData cd1, CustomerData cd2) {
			int val=cd1.CustomerName.compareTo(cd2.CustomerName);
			if(cd1.CustomerName.equals(cd2.CustomerName))
			{
				return cd1.PhoneNumber.compareTo(cd2.PhoneNumber);
			}
			else
			{
				return val;
			}
		}
}
