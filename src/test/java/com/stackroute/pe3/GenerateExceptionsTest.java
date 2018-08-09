package com.stackroute.pe3;

import static org.junit.Assert.*;
import org.junit.Ignore;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class GenerateExceptionsTest {
	private static GenerateExceptions obj;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
	
		obj= new GenerateExceptions();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		obj = null;

	}

	@Test 
	public void testNegat() {
		String r=obj.Negat();
		assertEquals("java.lang.NegativeArraySizeException",r);	
		
	}
	@Test 
	public void testIndex() {
		String r=obj.Index();
		assertEquals("java.lang.IndexOutOfBoundsException: Index: 2, Size: 2",r);
		
	}
	@Test 
	public void testNullPointer() {
		String r=obj.NullPointer();
		assertEquals("java.lang.NullPointerException",r);
		
	}


}
