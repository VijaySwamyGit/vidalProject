package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateInString {
	
    
       // public void findIt(String str) {  
          
        	//without using MAP
          /*  char[] charArray = str.toCharArray(); 
            
            
            for(int i = 0; i < charArray.length; i++) {  
                for(int j = i + 1; j < charArray.length; j++) {  
                    if(charArray[i] == charArray[j])  
                        System.out.println(charArray[j]);  
                }  
            
            }
  
            
        }
         */
        	//Without using MAP
      
        public static void main(String a[]) {  
        	
        	DuplicateInString dis = new DuplicateInString();  
            dis.findIt("india is my country");  
        } 
        
        
        
        //
        public void findIt(String str) {  
             Map<Character, Integer> baseMap = new HashMap<Character, Integer>(); //character is "Key" here & Integer is "Value" 
            // Map<Integer, List<WebElement>>  wb = Map<Integer, List<WebElement>> ();
             char[] charArray = str.toCharArray(); 
             
             System.out.println("Basemap1 --values--"+baseMap);
             System.out.println("charArray --values--"+charArray);
             
           //  System.out.println(charArray);
            // System.out.println(charArray[0]);
             
             
          
             for (char ch : charArray) {  
            	// for (Character ch : charArray) { 
            	 
            	//System.out.println("ch---"+ch);
            	//System.out.println("chh---"+ baseMap.containsKey(ch));
            	 
                 if (baseMap.containsKey(ch)) {  //if HashMap does not contains the character it goes to else part
                	 int count=baseMap.get(ch);  //of code & inserts that character into HaspMap, if it is available then gets
                                                 //count of that character &  puts it back to list, after increasing count by 1
                	 
                	 System.out.println("int value--"+count);
                	// baseMap.put(ch, +baseMap.get(ch)+1);
                	 baseMap.put(ch, ++count);
                	 System.out.println("Basemap2 --values--"+baseMap);
                	
                    // baseMap.put(ch, baseMap.get(ch) + 1);  
                     
                 } else {  
                     baseMap.put(ch, 1);  
                     System.out.println("Basemap3 --values--"+baseMap);
                 }  
             }  
             
             
             Set<Character> keys = baseMap.keySet(); 
             
     
             for (char ch : keys) {
            	 //for(Character ch : keys)
                 if (baseMap.get(ch) > 1) {  
                     System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
                 }  
             }  
             
             
             System.out.println("__________________________");
             
             Set keyValue = baseMap.entrySet();
             Iterator itr=keyValue.iterator();  
         	while(itr.hasNext()){  
         	Map.Entry entry=(Map.Entry)itr.next();  
         	System.out.println(entry.getKey()+" = "+entry.getValue());  
         }  
        }
             
         }
         //
   


