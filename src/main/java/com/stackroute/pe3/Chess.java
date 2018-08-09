package com.stackroute.pe3;

public class Chess {
	public String[][] print()
	{
		int i,j;
		String[][] st=new String[8][8];
		String str1="WW|";
		String str2="BB|";
		for(i=0;i<8;i++)
		{
			for(j=0;j<8;j++)
			{
				if(((i+j)%2)==0)
					st[i][j]=str1;
				else
					st[i][j]=str2;					
			}
		}
		return st;
	}
		
	}
