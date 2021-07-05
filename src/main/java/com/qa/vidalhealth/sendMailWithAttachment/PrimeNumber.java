package com.qa.vidalhealth.sendMailWithAttachment;

public class PrimeNumber {

	//*******************prime number *********************************
				 
					 public static void main(String args[]){  
					  double i,m=0,flag=0;    
					  int n=15;//it is the number to be checked  
					  m=n/Math.sqrt(n) ;   
					  int m2=n/2 ; 
					  System.out.println("***************m  "+m);
					  System.out.println("***************m  2--"+m2);
					//  System.out.println(m);
					  for(i=2;i<=m2;i++){    
					   if(n%i==0){    
					   System.out.println("Number is not prime");    
					 flag=1;    
					   break;    
					   }    
					  }    
					  if(flag==0)    
					  System.out.println("Number is prime");    
					}  
					
				//*******************prime number *********************************
	}



