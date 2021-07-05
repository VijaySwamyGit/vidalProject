package com.qa.vidalhealth.sendMailWithAttachment;

public class ReadOnlyDigits {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "vijay@0987654123";
		String str2 = "";
		System.out.println(str1.length());
		
		for(int i=0;i<=str1.length()-1;i++)
		{
		     
		        char ch =str1.charAt(i);
		 if(ch>=48 && ch<=58)
		     {
			str2=str2+ch;
		     }
		//System.out.println(str2);

		}
		System.out.println(str2);
	}

}
