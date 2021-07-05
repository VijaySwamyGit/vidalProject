package com.qa.vidalhealth.sendMailWithAttachment;

public class ClassTest {
	
	
	int i=10;//instance variable
	String str="vijay";//instance variable
	static int i2=20;//static variable
	static String str2="vijaykartik";//static variable
	
	void m1()//instance method
	{
		int local=40;//local variable
		//static int local2=40;//static variables in methods is not allowed
		System.out.println("m1");
		//instance variable accessed directly in instance method
		System.out.println("instance method instance var--"+i+"  "+str+" "+local);
		//static variable accessed directly in instance method
		System.out.println("instance method static var--"+i2+"  "+str2);
		//static variable accessed using CLASS name in instance method
		System.out.println("instance method static var--"+ ClassTest.i2+"  "+ClassTest.str2);
	}
	
	static void m2()//static method
	{
		int local=30;//local variable
		//static int local2=40;//static variables in methods is not allowed
		System.out.println("m2");
		//static variable accessed directly in static method
		System.out.println("static method static var--"+i2+"  "+str2+" "+local);
		//static variable accessed using CLASS name in static method
		System.out.println("static method static var--"+ClassTest.i2+"  "+ClassTest.str2);
		
	}
	
	ClassTest()//o arg constructor
	{
		System.out.println("0 arg cons");
	}
	
	ClassTest(int a)//1 arg constructor
	{
		System.out.println("1 arg cons");
	}
	
	{System.out.println("instance block*******************");}//instance block
	
	static
	{System.out.println("static block");}//static block
	
	public static void main(String[] args) {


		new ClassTest().m1();//instance method access using head less object
		ClassTest obj = new ClassTest();
		obj.m1();//instance method access using head(reference) object
		new ClassTest().m2();//static method access using object
		ClassTest.m2();//static way access using CLASS name
		new ClassTest(10);
	}

}
