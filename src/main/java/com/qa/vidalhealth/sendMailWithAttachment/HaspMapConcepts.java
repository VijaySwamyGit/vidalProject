package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class HaspMapConcepts {

	public static void main(String[] args) {


		
/*		HashMap<Integer,String> hp = new HashMap<Integer,String>();
		hp.put(1, "abc");
		hp.put(2, "pqr");
		hp.put(1, "abcd");
		
		System.out.println("hp---"+hp);
		
		String key = new String("abcde");
		
		hp.put(1, key);

		System.out.println("hp---"+hp);
		System.out.println("key value-- "+hp.get(2));*/
		
		HashSet hs = new HashSet();
		hs.add("vijay1");
		hs.add("vijay1");
		hs.add(null);
		hs.add("vijay2");
		hs.add(null);
		System.out.println("set values "+hs);
		
		ArrayList al = new ArrayList();
		al.add("vijay1");
		al.add("vijay1");
		al.add(null);
		al.add("vijay2");
		al.add(null);
		System.out.println("ArrayList values "+al);
		
		LinkedList ll = new LinkedList();
		ll.add("vijay1");
		ll.add("vijay1");
		ll.add(null);
		ll.add("vijay2");
		ll.add(null);
		System.out.println("LinkedList values "+ll);
	}

}
