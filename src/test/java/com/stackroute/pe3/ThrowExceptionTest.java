package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ThrowExceptionTest {
	private static ThrowException obj1;
	private static ThrowException obj2;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
	
		obj1= new ThrowException("hello");
		obj2= new ThrowException("world");

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		obj1 = null;
		obj2 = null;

	}

	@Test
	public void testthrowexcep1() {
		String res=obj1.throwexcep();
		assertEquals(res,"hello");
		
	}
	@Test
	public void testthrowexcep2() {
		String res=obj2.throwexcep();
		assertEquals(res,"world");
		
	}
	


}
