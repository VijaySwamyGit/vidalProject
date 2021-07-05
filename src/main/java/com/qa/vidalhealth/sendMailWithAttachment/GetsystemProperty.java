package com.qa.vidalhealth.sendMailWithAttachment;


	
	import java.util.*;  
	import java.io.*;  
	public class GetsystemProperty { 
	public static void main(String[] args)throws Exception{  
	  
	Properties p=System.getProperties();  
	Set set=p.entrySet();  
	
	System.out.println("****************"+set);
	System.out.println("******************************");
	  
	Iterator itr=set.iterator();  
	while(itr.hasNext()){  
	Map.Entry entry=(Map.Entry)itr.next();  
	System.out.println(entry.getKey()+" = "+entry.getValue());  
	}  
	  
	}  
	} 


