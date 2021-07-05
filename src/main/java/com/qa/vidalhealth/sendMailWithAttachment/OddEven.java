package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OddEven {

//	************************************************EVEN ODD number**************
		
			public static void main(String [] args)
			{
				/*while(true)
				{
					Scanner in = new Scanner(System.in); 
				       System.out.println("Enter num Value:  ");
				       int num = in.nextInt();
				       
				       if(num%2==0)
				       {
				    	   System.out.println("even");
				       }
				       else
				       {
				    	   System.out.println("odd");
				       }
				      
				}*/
				
				String navigationalPageXpathDE="";
				String s1= "//a[@onclick=\"javascript:pageIndex(";
				String s2= 20+"";
				String s3= ",'tableData')\"]";
				navigationalPageXpathDE=navigationalPageXpathDE+s1+s2+s3;
				System.out.println("navigationalPageXpathDE--"+navigationalPageXpathDE);
					//WebElement userAssignmentIconWebElement =driver.findElement(By.xpath(userAssignmentIconXpath));
					//return userAssignmentIconWebElement;
				
				
			}
}
			
			//*********************************************EVEN ODD number**************
	


