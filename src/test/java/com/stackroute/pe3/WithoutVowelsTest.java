package com.stackroute.pe3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WithoutVowelsTest {
	private static WithoutVowels wv;

	@Before
	public void setUp() {
		wv = new WithoutVowels();
	}

	@After
	public void tearDown(){
		wv = null;
	}

	@Test
	public void test() {
		String[] l1= {"India","United States","Germany","Egypt","czechoslovakia"};
		String[] l2= {"Ind","Untd Stts","Grmny","Egypt","czchslvk"};
	  assertArrayEquals(l2,wv.vowels(l1));
	
	}
	
	@Test
	public void test2() {
		String[] l1= {"i","iae","ea","eooaia"};
		String[] l2= {"","","",""};
	  assertNotEquals(l2,wv.vowels(l1));
	
		
	}


}