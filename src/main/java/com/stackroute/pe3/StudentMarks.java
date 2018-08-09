package com.stackroute.pe3;

public class StudentMarks {

	public String checkGrade(int arr[]) {
		String s="";int flag=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0&&arr[i]<100)
				flag=0;
			else 
			{
				flag=1;
				break;
		}
		}
		if(flag==1) return "Error";
		else return "Passed";
     }
}