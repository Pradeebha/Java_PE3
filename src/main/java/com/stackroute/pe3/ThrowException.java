package com.stackroute.pe3;

public class ThrowException {
	String msg="";
	public ThrowException(String msg) {
		this.msg=msg;
	}
	public String throwexcep()
	{
		try {
			Exception e=new Exception();
			throw e;
		}
		catch(Exception e) {
			return msg;
		}
		finally {
			System.out.println("reached finally");;
		}
	}
	
}
