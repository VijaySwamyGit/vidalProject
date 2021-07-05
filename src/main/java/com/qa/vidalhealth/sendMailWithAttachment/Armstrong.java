package com.qa.vidalhealth.sendMailWithAttachment;


	


	import java.util.Scanner;

	public class Armstrong {
		
		int n3=0;
		
		
		public void armstrong() {
			System.out.println("enter any number");
			Scanner scn = new Scanner(System.in);
			int armNum = scn.nextInt();
			int temp=0;
			temp=armNum;
			//System.out.println("entered armstrong number is---" +armNum +temp);
			//int n1=0 ;
			
			String numStr=""+armNum;
			int numLength=numStr.length();
		//	System.out.println("length---"+numLength);
			
			while(armNum>0) {
		
				
				
				int n1 = armNum%10;//rem
				int n2 = armNum/10;//qou

				if(numLength==3)
				{
				n3=n3+(n1*n1*n1);
				}
				
				if(numLength==4)
				{
				n3=n3+(n1*n1*n1*n1);
				}
				
				if(numLength==5)
				{
				n3=n3+(n1*n1*n1*n1*n1);
				}
				
			
				
				//System.out.println("entered armstrong number is---" +armNum);
				armNum=n2;
		
			}
			
			if(temp==n3) {
			
							System.out.println("Valid Armstrong number is--" +n3);
						 }
			else
				System.out.println("Entered number is not Armstrong number");
			

		}
		
		public static void main(String[] args) {
			
			Armstrong obj = new Armstrong();
			obj.armstrong();
			
		}

	}



