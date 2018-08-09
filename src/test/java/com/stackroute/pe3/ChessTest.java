package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ChessTest {
	private static Chess obj;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
	
		obj= new Chess();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		obj = null;

	}

	@Test
	public void testprint() {
		String[][] res= {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
				{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
				{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
				{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}
				};
		assertArrayEquals(res,obj.print());
		
	}

}
