package com.stackroute.pe3;

public class Matrix {

//		int m,n;
//		private int a[][], b[][], c[][];
		
		public int[][] testmat(int m, int n, int a[][], int b[][]) {
			int[][] sum = new int[m][n];
			for(int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                sum[i][j] = a[i][j] + b[i][j];
	            }
	        }
		return sum;
	}

	
	}