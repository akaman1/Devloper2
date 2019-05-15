package com.nt.service;

import java.util.Calendar;

public class WishServiceImpl implements WishService {

	@Override
	public String generateWishMessage() {
		System.out.println("Hillo");
		System.out.println("H r u");
         Calendar cal=null;
         int hour=0;
       //  String msg=null;
         //get system DATE
         cal=Calendar.getInstance();
         //get current date  & time
         hour=cal.get(Calendar.HOUR_OF_DAY);
         if(hour<=12)
        	 return "Good Morning::::-------->"; 
         if(hour<16)
        	 return "Good  After Noon::::-------->"; 
         if(hour<20)
        	 return "Good   E.......V-------->"; 
         else
        	 return "G------N--------->";
	}

}
