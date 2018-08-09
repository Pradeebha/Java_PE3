package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MatrixTest {
	private static Matrix mat;

	@Before
	public void setUp() {
		mat = new Matrix();
	}

	@After
	public void tearDown(){
		mat = null;
	}

	@Test
	public void test1() {
		int n =3;
		int m =2;
	int a[][] = {{1,4},{2,5},{3,6}};
	int b[][] = {{7,4},{6,3},{5,2}};
	int[][] res = new int [3][2];
	res=mat.testmat(n,m,a,b); 
	int [][] exp = {{8,8},{8,8},{8,8}};
	assertArrayEquals(exp,res);
	}
	
	@Test
	public void test2() {
		int n= 2;
		int m= 3;
	int a[][] = {{-1,-2},{3,-2},{-4,6}};
	int b[][] = {{2,4},{-1,7},{2,-5}};
	int[][] res = new int [3][2];
	res = mat.testmat(m, n, a, b);
	int [][] exp = {{1,2},{2,5},{-2,1}};
	assertArrayEquals(exp,res);
		
	}
	
	@Test
	public void test3() {
		int n= 2;
		int m= 3;
	int a[][] = {{2,-3},{3,5},{1,6}};
	int b[][] = {{2,4},{-1,-7},{2,1}};
	int[][] res = new int [3][2];
	res = mat.testmat(m, n, a, b);
	int [][] exp = {{4,1},{2,-2},{3,7}};
	assertArrayEquals(exp,res);
		
	}


}