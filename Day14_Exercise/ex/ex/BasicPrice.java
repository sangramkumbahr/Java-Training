package com.java.ex;

import java.util.Comparator;

public class BasicPrice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		if(p1.getPrice()>=p2.getPrice())
		{
			return 1;
			
		}else {
			return -1;
		}
	}
	

}
