package com.qa.vidalhealth.sendMailWithAttachment;

public class DuplicateInArray {

	// static ;
	 
        public static void main(String[] args) {      
              
            //Initialize array   
            int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
            String [] arr2 = new String [] {"ab", "ab","ad", "cf"};
            
          
            
            
            
              
            System.out.println("Duplicate elements in given array: ");  
            //Searches for duplicate element  
            for(int i = 0; i < arr.length; i++) {  
            	
              	 
                for(int j = i + 1; j < arr.length; j++) { 
                	
                    if(arr[i] == arr[j])  
                    {
                    	int dupCount1=0;
                    	dupCount1=dupCount1++;
                        //System.out.println(arr[i]);
                        
                        System.out.println("dupCount1vv--"+dupCount1);
                    }
                        
                }  
                
               
                
              //  System.out.println("dupCount1--"+dupCount1);
                
            }  
   
           
            
            for(int i = 0; i < arr2.length; i++) {  
            	int dupCount2=0;
                for(int j = i + 1; j < arr2.length; j++) {  
                    if(arr2[i] == arr2[j]) 
                    {
                    	dupCount2=dupCount2++;
                        System.out.println(arr2[j]);  
                        System.out.println("dupCount2--"+dupCount2);
                    }
                }  
                
            }  
            
        }  
    }  
