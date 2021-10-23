package com.java.ex;

import java.util.Comparator;

public class BasicName implements Comparator{


	@Override
	public int compare(Object o1, Object o2) {
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		return p1.getName().compareTo(p2.getName());
	}

}
