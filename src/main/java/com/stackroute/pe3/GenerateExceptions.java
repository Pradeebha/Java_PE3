package com.stackroute.pe3;

import java.util.ArrayList;
import java.util.List;

public class GenerateExceptions {
	public String Negat() {
		try {
		int i=-1;
		int[] array = new int[i];
		return null;
		}
		catch(NegativeArraySizeException e) {
			e.printStackTrace();
			return e.toString();
			}
		
	}
	public String Index() {
		try {
			List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			System.out.println(list.get(2));
			return null;
		}
		catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			return e.toString();
			
			}
		
	}
	public String NullPointer() {
		try {
		GenerateExceptions g=null;
		g.toString();
		return null;
		}
		catch(NullPointerException e) {
			
			e.printStackTrace();
			return e.toString();
			}
		
	}

	

}
