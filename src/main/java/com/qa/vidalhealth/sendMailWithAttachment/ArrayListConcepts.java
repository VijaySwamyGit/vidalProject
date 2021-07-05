package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcepts {

	public static void main(String[] args) {

 
		List<String> arrayList1 = new ArrayList<String>(10);
		//arrayList1.it
		
		arrayList1.add("vijay1");
		arrayList1.add("vijay2");
		
		List<String> arrayList2 = new ArrayList<String>();
		
		arrayList2.add("vijay3");
		arrayList2.add("vijay4");
		
		List<String> arrayList3 = new ArrayList<String>();
		
		arrayList3.add("vijay5");
		arrayList3.add("vijay6");
		
	
		
		System.out.println("arrayList1--"+arrayList1);
		System.out.println("arrayList2--"+arrayList2);
		System.out.println("arrayList3--"+arrayList3);
		
		arrayList1.addAll(arrayList2);
		System.out.println("arrayList1--"+arrayList1);
		
		

	}

}
