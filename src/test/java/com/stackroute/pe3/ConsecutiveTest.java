package com.stackroute.pe3;
import java.util.*;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



public class ConsecutiveTest {
	private static Consecutive obj;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
	
		obj= new Consecutive();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		obj = null;

	}
	@Test
	public void consectest1() {
		String res="98,96,95,94,93";
		String result=obj.consec(res);
		assertEquals(result,"Non consecutive numbers");
	}
	@Test
	public void consectest2() {
		String r2="54,53,52,51,50,49,48";
		String res=obj.consec(r2);
		assertEquals(res,"consecutive numbers");
	}
	@Test
	public void consectest3() {
		String r3="1,2,3,4,5,6,6";
		String res=obj.consec(r3);
		assertEquals(res,"Non consecutive numbers");
	}

}
