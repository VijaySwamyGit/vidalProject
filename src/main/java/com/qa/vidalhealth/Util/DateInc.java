package com.qa.vidalhealth.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;

public class DateInc {
	
	public static void main(String args[]){
		//Given Date in String format
		String oldDate = "13/03/2019";  
		System.out.println("Date before Addition: "+oldDate);
		//Specifying date format that matches the given date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		try{
		   //Setting the date to the given date
		   c.setTime(sdf.parse(oldDate));
		}catch(ParseException e){
			e.printStackTrace();
		 }
		   
		//Number of Days to add
		c.add(Calendar.DAY_OF_MONTH, 1);  
		//Date after adding the days to the given date
		String newDate = sdf.format(c.getTime());  
		//Displaying the new Date after addition of Days
		System.out.println("Date after Addition: "+newDate);
		String newDateTime = newDate+" "+"11:00 AM";
   		System.out.println("Date after Addition: "+newDateTime);
	   }

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String date = "10/11/2019";
		
	
		
		String sourceDate = "10/03/2019";
		//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date myDate = null;
		try {
			myDate = format.parse(sourceDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myDate = DateInc.addDays(myDate, 1);
		System.out.println("----"+ myDate);
	}
		
		
			  static public String addOneDay(String date) {
				  DateInc obj = new DateInc();
			    return LocalDate.parse(date).plusDays(1).toString();
			  }
			  
			  
			 
			      public static Date addDays(Date date, int days)
			      {
			    	  
			    	  System.out.println("date--"+date);
			          Calendar cal = Calendar.getInstance();
			          System.out.println("date cal--"+cal);
			         cal.setTime(date);
			          cal.add(Calendar.DATE, days);
			        //  cal.get//minus number would decrement the days
			          return cal.getTime();
			      }*/
			  }
	


