package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
					
					while(true)
					{
						
						System.out.print("Enter the String");
					Scanner in = new Scanner(System.in);
					
					String str = in.next();
					
					
			String strrev = "";
					
					int l = str.length();
					for(int i=l-1;i>=0;i--)
					{
						char c = str.charAt(i);
						strrev = strrev + c;
					}
					if(str.equalsIgnoreCase(strrev))
					{
						System.out.println("palindrome");
					}
					else
					{
						System.out.println("NOT----palindrome");

					}
					}
					
					
				}

	}



