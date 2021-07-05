/*package com.qa.vidalhealth.TestScripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.HomePage;
import com.qa.vidalhealth.Pages.LoginPage;
import com.qa.vidalhealth.Util.ExcelUtilities;
import com.qa.vidalhealth.Util.HandleWebTable;
import com.qa.vidalhealth.Util.HandleWebTable;
import com.qa.vidalhealth.Util.TestUtil;
import com.qa.vidalhealth.Util.TestUtil;

public class ReadToDoTaskWebTableTest extends TestBase{
	
	static String celText1[];
	static String celText2[];
	static String celText3[];
	
	public ReadToDoTaskWebTableTest(){
		PageFactory.initElements(driver, this);
	}
		@Test(enabled=false)
	public void readWebTable() {
			
			HomePage homePage = new HomePage();
			
			//preAuthSearchPage.searchOption();
			
			ExcelUtilities excelUtilities = new ExcelUtilities();
			LoginPage loginPage=new LoginPage();
			//HomePage homePage= new HomePage();
			TestUtil testUtil =new TestUtil();
			
			String loginCredentials []=testUtil.loginCredentials();
			String un = loginCredentials[0];
			String pwd =loginCredentials[1];
			HomePage hp = loginPage.login(un, pwd);
			
			//WebTableReadingTEMP WebTableReading = new WebTableReadingTEMP();
			HandleWebTable handleWebTable = new HandleWebTable();
			
			//WebTableReading.webTableReading();
			//WebElement webElement = ""
			WebElement tableNameWebElement= homePage.sendtoDoTaskTableName();
			handleWebTable.rowsNcloumnsOfwebTable(tableNameWebElement);
			
		
	}
		
		@Test(enabled=false)
		public void readColumnOfWebTable() {
				
				HomePage homePage = new HomePage();
				
				//preAuthSearchPage.searchOption();
				
				ExcelUtilities excelUtilities = new ExcelUtilities();
				LoginPage loginPage=new LoginPage();
				//HomePage homePage= new HomePage();
				TestUtil testUtil =new TestUtil();
				
				String loginCredentials []=testUtil.loginCredentials();
				String un = loginCredentials[0];
				String pwd =loginCredentials[1];
				HomePage hp = loginPage.login(un, pwd);
				
				//WebTableReadingTEMP WebTableReading = new WebTableReadingTEMP();
				HandleWebTable handleWebTable = new HandleWebTable();
				
				//WebTableReading.webTableReading();
				//WebElement webElement = ""
				WebElement tableNameWebElement= homePage.sendtoDoTaskTableName();
				handleWebTable.elapsedTimewebTable(tableNameWebElement);
				
			
		}
		
		
		@Test(priority=1)
		public void readColumnOfWebTableFirstPage() {
				
				HomePage homePage = new HomePage();
				
				//preAuthSearchPage.searchOption();
				
				ExcelUtilities excelUtilities = new ExcelUtilities();
				LoginPage loginPage=new LoginPage();
				//HomePage homePage= new HomePage();
				TestUtil testUtil =new TestUtil();
				
				String loginCredentials []=testUtil.loginCredentials();
				String un = loginCredentials[0];
				String pwd =loginCredentials[1];
				HomePage hp = loginPage.login(un, pwd);
				
				//WebTableReadingTEMP WebTableReading = new WebTableReadingTEMP();
				HandleWebTable handleWebTable = new HandleWebTable();
				
				//WebTableReading.webTableReading();
				//WebElement webElement = ""
				WebElement tableNameWebElement= homePage.sendtoDoTaskTableName();
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				String celText1[]=handleWebTable.elapsedTimewebTableFirstPage(tableNameWebElement);
				System.out.println("page1 of table ends---"+celText1);
				
				//************************************************
				WebElement nextPageWebElement2= homePage.toDoTaskTableNavigationalPage2();
				int pageNumber=2;
				
				int pageNumber=2;
				WebElement nextPageWebElement2=homePage.navigationalPageXpath(pageNumber);
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				
				String celText2[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement2,pageNumber);
				System.out.println("page2 of table ends---"+celText2);
				
				WebElement nextPageWebElement3= homePage.toDoTaskTableNavigationalPage3();
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				pageNumber=3;
				
				String celText3[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement3,pageNumber);
				System.out.println("page3 of table ends---"+celText3);
				
				
				WebElement nextPageWebElement4= homePage.toDoTaskTableNavigationalPage4();
				pageNumber=4;
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				
				String celText4[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement4,pageNumber);
				System.out.println("page4 of table ends--"+celText4);
				
				WebElement nextPageWebElement5= homePage.toDoTaskTableNavigationalPage5();
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				pageNumber=5;
				
				String celText5[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement5,pageNumber);
				System.out.println("page5 of table ends---"+celText5);
				
				
				WebElement nextPageWebElement6= homePage.toDoTaskTableNavigationalPage6();
				pageNumber=6;
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				
				String celText6[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement6,pageNumber);
				System.out.println("page6 of table ends--"+celText6);
				
				WebElement nextPageWebElement7= homePage.toDoTaskTableNavigationalPage7();
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				pageNumber=7;
				
				String celText7[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement7,pageNumber);
				System.out.println("page7 of table ends-"+celText7);
				
				
				WebElement nextPageWebElement8= homePage.toDoTaskTableNavigationalPage8();
				pageNumber=8;
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				
				String celText8[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement8,pageNumber);
				System.out.println("page8 of table ends---"+celText8);
				
				WebElement nextPageWebElement9= homePage.toDoTaskTableNavigationalPage9();
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				pageNumber=9;
				
				String celText9[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement9,pageNumber);
				System.out.println("page9 of table ends---"+celText9);
				
				WebElement nextPageWebElement10= homePage.toDoTaskTableNavigationalPage10();
				pageNumber=10;
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				
				String celText10[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement10,pageNumber);
				System.out.println("page10 of table ends---"+celText10);
				
				WebElement nextPageWebElement11= homePage.toDoTaskTableNavigationalPage11();
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				pageNumber=11;
				
				String celText11[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement11,pageNumber);
				System.out.println("page11 of table ends---"+celText11);
				
				WebElement nextPageWebElement12= homePage.toDoTaskTableNavigationalPage12();
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				pageNumber=12;
				
				String celText12[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement12,pageNumber);
				System.out.println("page12 of table ends-"+celText12);
				
				WebElement nextPageWebElement13= homePage.toDoTaskTableNavigationalPage13();
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				pageNumber=13;
				
				String celText13[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement13,pageNumber);
				System.out.println("page13 of table ends--"+celText13);
				
				WebElement nextPageWebElement14= homePage.toDoTaskTableNavigationalPage14();
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				pageNumber=14;
				
				String celText14[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement14,pageNumber);
				System.out.println("page14 of table ends--"+celText14);
				
				WebElement nextPageWebElement15= homePage.toDoTaskTableNavigationalPage15();
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				pageNumber=15;
				
				String celText15[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement15,pageNumber);
				System.out.println("page15 of table ends---"+celText15);
				

				 List list = new ArrayList(Arrays.asList(celText1));
			        
			        list.addAll(Arrays.asList(celText2));
			        list.addAll(Arrays.asList(celText3));
			        list.addAll(Arrays.asList(celText4));
			        list.addAll(Arrays.asList(celText5));
			        list.addAll(Arrays.asList(celText6));
			        list.addAll(Arrays.asList(celText7));
			        list.addAll(Arrays.asList(celText8));
			        list.addAll(Arrays.asList(celText9));
			        list.addAll(Arrays.asList(celText10));
			        list.addAll(Arrays.asList(celText11));
			        list.addAll(Arrays.asList(celText12));
			        list.addAll(Arrays.asList(celText13));
			        list.addAll(Arrays.asList(celText14));
			        list.addAll(Arrays.asList(celText15));
			        
			        Object[] c = list.toArray();
			        System.out.println("----------------------------------------------");
			       
			        
			        System.out.println("****####*******" +Arrays.toString(c));
			        
			      
			        	
			        	String str[]=new String[100];
			        	for(int i=0;i<str.length-1;i++) {
			        	str[i]=Arrays.toString(c);
			        	
			        	}
			        	
			        	System.out.println("****Final String1 time values*******" +str[0]);
			        	
			        	String str2=Arrays.toString(c);
			        	
			        	System.out.println("****Final String2 time values*******" +str2);
			        	
			        	String strArr[]= str2.split(",");
			        	
			        	
			        	//String[] strArr= {"bbb","mmm","oooo","aaa"}; 
			    		
			    		Arrays.sort(strArr, new Comparator<String>() {
			    			
			    			public int compare(String o1, String o2) {
			    				
			    				return o2.compareTo(o1);
			    			}
			    		});
			    		for (String i : strArr) {
			    			System.out.println("-------------->> "+i);
			    		}	
			    		
			    		int lastIndex=strArr.length-1;
			    		String lastValue="";
			    		for (int ii=0;ii<strArr.length-1;ii++) {
			    			System.out.println("************-->> "+strArr[ii]);
			    			
			    			lastValue=strArr[lastIndex];
			    			
			    		}
			    		
			    		System.out.println("************lowest time-->> "+strArr[lastIndex]);
			    	//	return lastValue;
		}
		
		
		@Test(priority=2,enabled=false)
		public void readColumnOfWebTableRestAllPages2() {
				
				HomePage homePage = new HomePage();
				
				//preAuthSearchPage.searchOption();
				
				ExcelUtilities excelUtilities = new ExcelUtilities();
				LoginPage loginPage=new LoginPage();
				//HomePage homePage= new HomePage();
				TestUtil testUtil =new TestUtil();
				
				String loginCredentials []=testUtil.loginCredentials();
				String un = loginCredentials[0];
				String pwd =loginCredentials[1];
				HomePage hp = loginPage.login(un, pwd);
				
				//WebTableReadingTEMP WebTableReading = new WebTableReadingTEMP();
				HandleWebTable handleWebTable = new HandleWebTable();
				
				//WebTableReading.webTableReading();
				//WebElement webElement = ""
				WebElement tableNameWebElement= homePage.sendtoDoTaskTableName();
				WebElement nextPageWebElement= homePage.toDoTaskTableNavigationalPage2();
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				int pageNumber=2;
				
				
				int pageNumber=2;
				WebElement nextPageWebElement2=homePage.navigationalPageXpath(pageNumber);
				
				String celText2[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement2,pageNumber);
				System.out.println("celText2---"+celText2);
			
		}
		
		@Test(priority=3,enabled=false)
		public void readColumnOfWebTableRestAllPages3() {
				
				HomePage homePage = new HomePage();
				
				//preAuthSearchPage.searchOption();
				
				ExcelUtilities excelUtilities = new ExcelUtilities();
				LoginPage loginPage=new LoginPage();
				//HomePage homePage= new HomePage();
				TestUtil testUtil =new TestUtil();
				
				String loginCredentials []=testUtil.loginCredentials();
				String un = loginCredentials[0];
				String pwd =loginCredentials[1];
				HomePage hp = loginPage.login(un, pwd);
				
				//WebTableReadingTEMP WebTableReading = new WebTableReadingTEMP();
				HandleWebTable handleWebTable = new HandleWebTable();
				
				//WebTableReading.webTableReading();
				//WebElement webElement = ""
				WebElement tableNameWebElement= homePage.sendtoDoTaskTableName();
				WebElement nextPageWebElement= homePage.toDoTaskTableNavigationalPage3();
				//handleWebTable.elapsedTimewebTable(tableNameWebElement);
				int pageNumber=3;
				
				String celText3[]=handleWebTable.elapsedTimewebTableAll(tableNameWebElement,nextPageWebElement,pageNumber);
				System.out.println("celText3");
				
				
			
		}
		
		@Test(priority=4,enabled=false)
	public void m() {
        List list = new ArrayList(Arrays.asList(celText1));
        
        list.addAll(Arrays.asList(celText2));
        
        Object[] c = list.toArray();
        
        System.out.println("****####"+Arrays.toString(c));
		
		//
	}

}
*/