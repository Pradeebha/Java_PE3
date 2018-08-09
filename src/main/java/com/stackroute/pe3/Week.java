package com.stackroute.pe3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;
import java.util.*;

public class Week {


public ArrayList<String> TestWe() {
	String date="Mon 06/08/2018";
	SimpleDateFormat sdf = new SimpleDateFormat("E dd/MM/yyyy");
	Calendar cal = Calendar.getInstance();
	try{
		   cal.setTime(sdf.parse(date));
		}catch(ParseException e){
			e.printStackTrace();
		 }
	 ArrayList<String> li=new ArrayList<String>();
	
	li.add(sdf.format(cal.getTime()));
    cal.add(Calendar.DAY_OF_WEEK, 6);  
	li.add(sdf.format(cal.getTime()));  
	return li;
	   
  }
}

