package com.qa.vidalhealth.sendMailWithAttachment;

public class CallByRef {
	
	
	int i=10;
	int j=20;
	
	public  void swap(CallByRef obj) {
		//this.i=i;
		//this.j=j;
	/*	obj.i=obj.i+1;
		obj.j=obj.j+1;*/
		
		/*int temp=0;
		temp=obj.i;
		obj.i=obj.j;
		obj.j=temp;*/
		
		obj.i=obj.i+obj.j;
		obj.j=obj.i-obj.j;
		obj.i=obj.i-obj.j;
		
		//System.out.println("i---="+i);
		//System.out.println("j---="+j);
	}

	public static void main(String[] args) {
		CallByRef obj = new CallByRef();
		System.out.println("i---="+obj.i);
		System.out.println("j---="+obj.j);
		
		obj.swap(obj);
		
		
		System.out.println("i---="+obj.i);
		System.out.println("j---="+obj.j);
	}

}
