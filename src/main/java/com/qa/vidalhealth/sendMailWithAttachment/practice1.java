package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class practice1 {
	
	//
	public void fibbonacci()
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("enter the number---");
		int count = scn.nextInt();
		
		int n1=0,n2=1,n3=0;
		
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<count;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.print(" "+n3);
		}
	}
	//
	
	
	//
	public void palindrome()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter string---");
		String str1=scn.next();
		String strrev="";
		int strLength = str1.length();
		char [] chArray = str1.toCharArray();
		
		for(int i=strLength-1;i>=0;i--)
		{
			strrev=strrev+chArray[i];
		}
		
		System.out.println("strrev---"+strrev);
		
		if(str1.equals(strrev))
		{
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}
	//
	
	public void findDuplicate(String str)
	{
		Map<Character,Integer> hp = new LinkedHashMap<Character, Integer>();
		
		char[] charArray = str.toCharArray();
		
		for(Character dup:charArray)
		{
			if(hp.containsKey(dup))
			{
				int dupCount = hp.get(dup);
				dupCount=dupCount+1;
				
				hp.put(dup, dupCount);
				
			}
			else 
			{
			hp.put(dup, 1);	
			}
		}
		
		Set s= hp.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Integer i = new Integer(1);
			Map.Entry m = (Map.Entry)itr.next();
			//System.out.println(m.getKey()+"----"+m.getValue());
			if(m.getValue().equals(i))
			{
				//System.out.println("NO dup");
			}else {
				System.out.println("dup--"+m.getValue()+"--"+m.getKey());
			}
		}
		
		
		
	}
	
	

	public static void main(String[] args) {


		/*WebDriver driver;
		System.setProperty("webdriver.chrome.driver","E:\\SVN-V3-automation\\Automation\\Driverserver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/table.html");
		
		WebElement mytable=driver.findElement(By.xpath("/html/body/table/tbody"));
		
		List<WebElement> tableRows = mytable.findElements(By.tagName("tr"));
		int RC = tableRows.size();
		
		for(int i=0;i<RC;i++)
		{
			List<WebElement> tableColumns=tableRows.get(i).findElements(By.tagName("td"));
			
			int CC = tableColumns.size();
			
			for(int j=0;j<CC;j++)
			{
				String cellData = tableColumns.get(j).getText();
				System.out.println("row--"+i+"--"+"column--"+j+"--"+cellData);
			}
			 System.out.println("-------------------------------------------------- ");
		}*/
		
		practice1 obj = new practice1();
		//obj.findDuplicate("india is my country");
		//obj.palindrome();
		obj.fibbonacci();
		
		
	}

}
