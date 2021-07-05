package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapConcepts {

	public static void main(String[] args) {

		Map<Character, Integer> hp = new HashMap<Character,Integer>();
		
		String str="india";
	
		char [] charArr=str.toCharArray();
		
		   for (Character ch : charArr) {  
          	 
           	System.out.println("ch---"+ch);
           	System.out.println("containsKey---"+ hp.containsKey(ch));
           	System.out.println("*******************************");
           	 
                if (hp.containsKey(ch)) {  
                	//System.out.println("hp.get(ch)--"+hp.get(ch));
               	 int count=hp.get(ch);
               //	System.out.println("count--"+count);
               	 hp.put(ch, ++count);
               	 
               	//System.out.println("hp.put(ch, ++count);"+hp.put(ch, ++count));
               	
                   // baseMap.put(ch, baseMap.get(ch) + 1);  
                    
                } else {  
                    hp.put(ch, 1);  
                }  
                
              System.out.println("hp.put(ch, ++count);&&&&&&&&&&&&&"+hp);
                
                Set<Character> keys = hp.keySet();  
                for (Character chr : keys) {  
                    if (hp.get(chr) > 1) {  
                        System.out.println(ch + "  is " + hp.get(chr) + " times");  
            }
		
		
		

	}
		   
		   }
	}

}