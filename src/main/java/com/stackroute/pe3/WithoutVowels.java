package com.stackroute.pe3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithoutVowels {

	public String[] vowels(String[] st) {
		int len=st.length;
		for(int i=0;i<len;i++)
		{
			st[i]=st[i].replaceAll("a|e|i|o|u", "");
		}
		return st;
	}
}
