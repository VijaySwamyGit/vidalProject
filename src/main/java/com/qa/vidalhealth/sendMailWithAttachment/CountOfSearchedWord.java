package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.Scanner;

public class CountOfSearchedWord {

	public static void main(String[] args) {
		

		     System.out.println("Input the sentence");
		     Scanner s = new Scanner(System.in);
		     String input = s.nextLine();
		     //String input = s.next();

		     System.out.println("Input the word that has to be searched");
		    // String word = s.nextLine();
		     String word = s.next();
		     
		     //Modified
		     int occurancee = 0;
		     String arrWord[]=input.split(" ");
		   //int x= str2.length;
		     for(int i=0;i<=arrWord.length-1;i++) {
		    	 if(arrWord[i].length() == word.length()) {
		             if(arrWord[i].equals(word)) {
		                 occurancee ++;
		             }
		             
		             //largest word in the sentence
		      
		    	 }     
		    	 
		    	 for(int j=0;j<=arrWord.length;j++) {
		    		 for(int k=j+1;k<arrWord.length;k++)
		             if(arrWord[j].length() < arrWord[k].length()) {
		            	 String temp="";
		            	 temp=arrWord[j];
		            	 arrWord[j]=arrWord[k];
		            	 arrWord[k]=temp;
		             }
		            	 
		            // }
		    		
		    	 
		     }
		    	
		    		 System.out.println("*******largest word   is  "+arrWord[(arrWord.length-1)-(arrWord.length-1)]);
		    		 
		    		//largest word in the sentence
		    		 
		    	// }
		    	 //Modified
		    	 
		    	 /*************************/
	
		     
		     /****************************/
		    	 
		    	 //Modified
		     } 
		     if(occurancee > 0)
		     {
		    	
		         System.out.println("the string is present and the count of the given string is : " + occurancee);
		     }
		     else 
		         System.out.println("The string is not present");
		     
		     //Modified
		

	}
}


