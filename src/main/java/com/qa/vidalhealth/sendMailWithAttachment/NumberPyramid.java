package com.qa.vidalhealth.sendMailWithAttachment;

public class NumberPyramid {
	
  
        public static void main(String[] args) {
            int rows = 5;
      
            
            for(int i=1;i<=5;i++) {
            	for(int j=1;j<=i;j++) {
            		//System.out.print("*");
            		if(i==1)
            			System.out.print(" "+"2");
            		else
            			System.out.print(" "+(i*j));
            	}
            	System.out.println();
            }
            
        }
    }
