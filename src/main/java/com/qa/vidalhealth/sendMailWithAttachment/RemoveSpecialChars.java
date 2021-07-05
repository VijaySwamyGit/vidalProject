package com.qa.vidalhealth.sendMailWithAttachment;

public class RemoveSpecialChars {

	public static void main(String[] args) {


		String str2 = "Dha'nanj'aya.b123@#$%vi'dalhealt'htpa.com";
		//String str2 ="abcdefghijklmnopqrstuvwxyz";
		//regular exp [a bA B1 2]
		//str=str.replaceAll( "[^0-9B-Z ]" , "sp" );
		
		str2=str2.replaceAll("[.@a-zA-Z0-9]", "");
		//str=str.startsWith("#");
		//str.c
		
		System.out.println("str--"+str2);
		
	}

}
