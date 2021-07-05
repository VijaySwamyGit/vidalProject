package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.Date;


public class Timestamp {

	public static void main(String[] args) {
		Date date = new Date(System.currentTimeMillis());

        
        String dateString = date.toString();
        System.out.println("dateString---"+dateString);
        dateString = dateString.replaceAll("[^a-zA-Z0-9]", "");
        
        
        System.out.println("dateString---"+dateString);

	}

}
