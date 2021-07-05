package com.qa.vidalhealth.sendMailWithAttachment;

//import com.qa.vidalhealth.Pages.navigationalPageXpath;

//import new new org.jruby.ext.stringio.StringIO.INVOKER.i(){}(){}.string;

public class TypeCoversion {

	public static void main(String[] args) {

/*int i=10;
String str="100";
int ii=Integer.parseInt(str);
String str2=Integer.toString(i);
String str3=String.valueOf(i);

System.out.println("int to string2--"+str2+2);
System.out.println("int to string3--"+str3+2);
System.out.println("string to int--"+ii+2);

int j=9;
String s=""+j;
System.out.println("string to int--"+s+1);

String exPath1 = "//a[@title='Page";
String exPath11 = " ";
String exPath111 = "i";
String exPath1111 = "']";
//String exPath1 = """";
String exPath2 = " 2']";
String exPath = exPath1 +exPath11+exPath111 +exPath1111;
System.out.println("exPath--"+exPath);*/
		//
		
		String referenceNumberr="REF05081900011";
		//String str="//a[contains(text(),'REF05081900011')]";
		
		String refXpath="//a[contains(text(),";
		
		//refXpath="\"refXpath+referenceNumberr\"";
		refXpath="\""+refXpath+"'"+referenceNumberr+"')]"+"\"";
		
		System.out.println("refXpath---"+refXpath);
		
		
		
		//

		
		String navigationalPageXpath="";
		String s1="//a[@onclick=\\\"javascript:pageIndex(";
		String s2="2";
		String s3= ",'tDSelfAssignment')\\\"]";
		
		navigationalPageXpath=navigationalPageXpath+s1+s2+s3;
		//a[@onclick=\"javascript:pageIndex(2,'tDSelfAssignment')\"]
		System.out.println("-----------------------------//a[@onclick=\\\"javascript:pageIndex(2,'tDSelfAssignment')\\\"]--");
		System.out.println("navigationalPageXpath---"+navigationalPageXpath);
	}

}
