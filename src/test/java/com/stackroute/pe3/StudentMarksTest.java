package com.stackroute.pe3;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StudentMarksTest {
	private static StudentMarks student;

	@Before
	public void setUp(){
		student = new StudentMarks();
	}

	@After
	public void tearDown() {
		student = null;
	}

	@Test
	public void test1() {
		int x[]= {30,40,60,70,80};
		String s = student.checkGrade(x);
		assertEquals("Passed",s);
	}
	
	@Test
	public void test2() {
		int x[]= {35,109,65,70,85};
		String s = student.checkGrade(x);
		assertEquals("Error",s);	
	}
	

}