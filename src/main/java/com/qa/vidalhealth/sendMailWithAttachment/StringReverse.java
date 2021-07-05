package com.qa.vidalhealth.sendMailWithAttachment;

public class StringReverse {

	
		//String REVERSE
				public static void main(String [] args)
				{
					String str = "vijay";
					String strrev = "";
					
					int l = str.length();
					for(int i=l-1;i>=0;i--)
					{
						char c = str.charAt(i);
						strrev = strrev + c;
					}
					
					System.out.println(strrev);
				}
				
				////String REVERSE
	}


