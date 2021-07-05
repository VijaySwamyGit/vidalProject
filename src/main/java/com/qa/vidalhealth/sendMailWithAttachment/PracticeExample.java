package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExample {
	
	//*******************************
	int i=10;
	int j=20;
	
	PracticeExample()
	{
		this(3,4,5);
		System.out.println("zero arg constructor");
	}
	
	PracticeExample(int a, int b,int c)
	{
		System.out.println("3 arg constructor");
	}
	
	
	PracticeExample(int i, int j)
	{
		this();
		i=this.i;
		j=this.j;
		System.out.println("i and j values are " +i+" " +"and"+ " " +j);
	}
	
	//***************************************
	
	
//1111111111111***************************************************************	
	public void palindrome(String str)
	{
		int l = str.length();
		String strRev="";
		for(int i=l-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			strRev = strRev+ch;
		}
		
		if(str.equalsIgnoreCase(strRev))
		//return "palindrome";
			System.out.println("---palindrome");
		else
			//return "Not Palidrome";
			
			System.out.println("---Not palindrome");
	}
	//222222222222222222************************************************************
	public void allLinks()
	{
		System.setProperty("webdriver.chrome.driver","E:\\SVN-V3-automation\\Automation\\Driverserver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement w:allLinks)
		{
			String linkTextStr = w.getText();
			String hrefStr = w.getAttribute("href");
			
			System.out.println("linktext--"+linkTextStr+"linkAddress--"+hrefStr);
		}
	}
	
	//33333333333333333333333333****************************************************************************
	public void fibonaciSeries()
	{
		int n1=0,n2=1;
		int count=9;
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<=count;i++)
		{
			int n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}
	//444444444444444444444444444***************************************************************
	public void removeSpecialChars(String str)
	{
		String str2 = str.replaceAll("[^a-zA-Z]", "");
		System.out.println("----o/p=  "+str2);
		
	}
	
	public void dupInString(String str)
	{
		Map<Character,Integer> hp = new HashMap<Character,Integer>();
		char ch[] = str.toCharArray();
		
		for(char letter:ch)
		{
			if(hp.containsKey(letter))
			{
				int count = hp.get(letter);
				count++;
				hp.put(letter, count);
			}else {
				hp.put(letter, 1);
			}
		}
		
		Set<Character> keys = hp.keySet();
		for(char cc:keys)
		{
			if(hp.get(cc)>1)
			{
				System.out.println(cc +" is--"+hp.get(cc)+" times");
			}
		}
		
	}
//555555555555555555555555************************************************************************
	
	public void reverseString()
	{
		String strReverse="";
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter the string");
		String str = scn.next();
		int l = str.length();
		
		for(int i=l-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			strReverse =strReverse+ch;
		}
		
		System.out.println("Reverse of "+str +" is "+strReverse);
	}
	
	//66666666666666666666************************************************************************
	
		public void reverseEntireSentence()
		{
			String strReverse="";
			Scanner scn = new Scanner(System.in);
			System.out.println("please enter the Sentence");
			String str = scn.nextLine();
			int l = str.length();
			
			for(int i=l-1;i>=0;i--)
			{
				char ch = str.charAt(i);
				strReverse =strReverse+ch;
			}
			
			System.out.println("reverseEntireSentence--> "+str+"--" +" is "+"--"+strReverse);
		}
		
		//7777777777777777************************************************************************
		
		public void reverseEachWordOfEntireSentence()
		{
			String strReverse="";
			Scanner scn = new Scanner(System.in);
			System.out.println("please enter the Sentence");
			String str = scn.nextLine();
			String arr[] = str.split(" ");
			
			//int arrSize = arr.length;
			//System.out.println("arrSize is "  + arrSize);
			
			for(int j=0;j<=arr.length-1;j++)
			{
			   int l = arr[j].length();
			   
			  // System.out.println("length of --"+arr[j].length());
			  // System.out.println("length of l--"+l);
			
				for(int i=l-1;i>=0;i--)
				{
					char ch = arr[j].charAt(i);
					strReverse =strReverse+ch;	
						
				}
				
				strReverse=strReverse+" ";
			}
			
			System.out.println("reverseEachWordOfEntireSentence--> "+str+"--" +" is "+"--"+strReverse);
		}
	//8888888888888888888*****************************************************************
	
	public void reverseSentence()
	{
		String reversedSentence="";
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter the sentence to be reversed");
		String str = scn.nextLine();
		String arr[] = str.split(" ");
		int l = arr.length;
		
		for(int i=l-1;i>=0;i--)
		{
			reversedSentence = reversedSentence+" " +arr[i];
			
		}
		
		System.out.println("Reverse of sentence "+ str+"  " +" is "+"--"+reversedSentence);
	}
	//9999999999999999999999999*****************************************************************************
	public void swapWithoutTemp()
	{
		String a = "vijay";
		String b = "shilpa";
		System.out.println("before swapping---"+" a="+a+" b="+b);
		a = a+b;
		
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("after swapping---"+" a="+a+" b="+b);
	}
	
	//1010101010*************************************************************
	
	public void swapWithouttempInt()
	{
		int a=10; int b=20;
		System.out.println("before swapping---"+" a="+a+" b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping---"+" a="+a+" b="+b);
		
	}
	//11/11/11/11*******************************
	
	public void arrangeInArrDesc()
	{
		int arr[]= {2,4,5,6,7};
		int l = arr.length;
		
		for(int i=0;i<=l-1;i++)
		{
			for(int j=i+1;j<=l-1;j++)
			{
			if(arr[i]<arr[j])
			{
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
			}
			}
			
		}
		
		for(int k:arr)
		{
			System.out.println(k);
		}
		
	}
	//1212121212****************************
	
	public void CountGivenWord()
	{
		int occurence=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter sentence");
		String str = scn.nextLine();
		String arr[] = str.split(" ");
		//Scanner scn = new Scanner(System.in);
		System.out.println("please enter word to count");
		String word = scn.next();
		
		int l = arr.length;
		for(int i=0;i<l;i++)
		{
			if(arr[i].length() == word.length())
			{
				if(arr[i].equals(word))
				{
					occurence++;
				}
			}
		}
		
		System.out.println("count of word  "+word+" is  "+occurence);
	}
	//13131313**********************************
	public void LargestWord()
	{
		int occurence=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter sentence");
		String str = scn.nextLine();
		String arr[] = str.split(" ");
		
		
		int l = arr.length;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(arr[i].length() < arr[j].length())
				{
					String temp="";
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		
		System.out.println("largest word is "+ arr[0]);
		
		for(String ss:arr)
		{
			System.out.println("arr values-- "+ ss);
		}
	}
	//14141414**************
	
	public void armStrongNumber()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter number");
		int armNum = scn.nextInt();
		String sNum = String.valueOf(armNum);
		int l = sNum.length();
		int temp = armNum;
		int n1=0,n2=0,n3=0;
		while(armNum>0)
		{
			
			n1 = armNum%10;
			n2 = armNum/10;
			
			if(l == 3)
			{
				n3=n3+(n1*n1*n1);
			}
			if(l == 4)
			{
				n3=n3+(n1*n1*n1*n1);
			}
			
			armNum=n2;
		}
		
		if(temp==n3)
		{
			System.out.println(temp +" is valid ArmStrong number");
		}else
		{
			System.out.println(temp +" is Not valid ArmStrong number");
		}
		
	}
	//15151515*********************************
	
	public void primeNumber(int Num)
	{
		int m = Num/2;
		int flag=0;
		for(int i=2;i<=m;i++)
		{
			if(Num%i == 0)
			{
				System.out.println("not prime");
				flag=1;
				break;
			}
		}
		
		
		if(flag==0)
		{
		 System.out.println("prime");
		}
	
	}
	
	//16161616
	
	public void duplicateInArray()
	{
		int arr[]= {1,2,2,2,4,5,5,6};
		int dupCount=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					dupCount=dupCount++;
					System.out.println("dupCount--"+dupCount);
				}
			}
		}
	}
	//**********************************************************************************************
	
	    static void reverseStringRetainingPositionOfSpaces(String input) {  
	   
	        char[] inputArray = input.toCharArray();  
	        char[] result = new char[inputArray.length];  
	   
	       // System.out.println("----"+result.length+"--"+inputArray.length);
	        //System.out.println("----"+result+"--"+inputArray);
	        
		        for (int i = 0; i < inputArray.length; i++) {  
	            if (inputArray[i] == ' ') {  
	                result[i] = ' ';  
	            }  
	        }  
	       
	   
	        int j = result.length - 1;  
	   
	        
	      /*  for (int i = 0; i < inputArray.length; i++) {  
	            System.out.print(" --> " + inputArray[i]); 
	        }*/
	        
	        for (int i = 0; i < inputArray.length; i++) {  
	             
	            if (inputArray[i] != ' ') //I am Vijay inputArray[0]=I,inputArray[1]=' ',inputArray[2]=a, inputArray[3]=m,inputArray[4]=' '
	            						  //inputArray[5]=V,inputArray[6]=i,inputArray[7]=j, inputArray[8]=a,inputArray[9]=y
	            {  
	                if (result[j] == ' ') //space available at position 1 and 4 of array
	                						//I am Vijay inputArray[9]=I,inputArray[8]=A,inputArray[7]=m, inputArray[6]=V,inputArray[5]=i
	                						//inputArray[4]=' ',inputArray[3]=j,inputArray[2]=a, inputArray[1]=' ',inputArray[0]=y
	                {  
	                    j--;  
	                }  
	                result[j] = inputArray[i];  
	                j--;  
	            }  
	        }  
	        System.out.println(input + " --> " + String.valueOf(result));  
	    }  
	//**************************************************************************************************
	    
	    public void reverseStringretainingPostionOfspaces()
	    {
	    
	    String str = "Vidal Health TPA";
	    char ch[] = str.toCharArray();
	    int l = ch.length;
	    
	    System.out.println(l);
	    char [] result= new char[l];
	    int rl=result.length;
	    System.out.println("--> "+rl+" "+l);
	    for(int i=0;i<l;i++)
	    {
	    	if(ch[i]==' ')
	    	{
	    		result[i]=' ';
	    	}
	    }
	    
	    rl=rl-1;
	    System.out.println("--> "+rl+" "+l);
	    for(int i=0;i<l;i++)
	    {
	    	if(ch[i]!=' ')
	    	{
	    		if(result[rl]==' ')
	    		{
	    			rl--;
	    		}
	    		
	    	
	    	result[rl]=ch[i];
	    	rl--;
	    	}
	    }
	    
	    System.out.println("result---  "+result);
	    }
	    
	    //******************************************************************************
	
	public static void main(String[] args) {
		
		//PracticeExample obj = new PracticeExample(100,200);
		PracticeExample obj = new PracticeExample();
		//String strRes = obj.palindrome("madam");
		//obj.palindrome("madamm");
		//System.out.println("Result---"+strRes);
		//obj.allLinks();
		//obj.fibonaciSeries();
		//obj.removeSpecialChars("vijay@12#$%Rit");
		//obj.dupInString("india is my country");
		//obj.reverseString();
		//obj.reverseEntireSentence();
		obj.reverseSentence();
		//obj.reverseEachWordOfEntireSentence();
		//obj.swapWithoutTemp();
		//obj.swapWithouttempInt();
		//obj.arrangeInArrDesc();
		//obj.CountGivenWord();
		//obj.LargestWord();
		//obj.armStrongNumber();
		//obj.primeNumber(11);
		//obj.duplicateInArray();
		//obj.reverseStringRetainingPositionOfSpaces("I Am Vijay");
		//obj.reverseStringretainingPostionOfspaces();
		//obj.reverseEachWordOfEntireSentence();
		
	}

}
