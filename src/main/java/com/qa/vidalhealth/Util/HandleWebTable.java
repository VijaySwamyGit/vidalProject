package com.qa.vidalhealth.Util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.qa.vidalhealth.Base.TestBase;
import com.qa.vidalhealth.Pages.HomePage;
//import com.qa.vidalhealth.Pages.HomePage3;

public class HandleWebTable extends TestBase{
	
	
	boolean flag1=false;
	public HandleWebTable(){
		PageFactory.initElements(driver, this);
	}
	
	HomePage homePage = new HomePage();
	
	//READ ALL ROWS & COLUMNS OF WEBTABLE STARTS
	public void rowsNcloumnsOfwebTable(WebElement tableNameWebElement) {
	List < WebElement > table_rows =tableNameWebElement.findElements(By.tagName("tr"));
	
	
	//System.out.println("rows_table--->" + table_rows);
	   
	//To calculate no of rows In table.
	int rows_count = table_rows.size();
	
	//Loop will execute till the last row of table.
	for (int row = 0; row < rows_count; row++) {
		
	    //To locate columns(cells) of that specific row.
	    List < WebElement > row_Columns = table_rows.get(row).findElements(By.tagName("td"));
	    
	    //To calculate no of columns (cells). In that specific row.
	    int columns_count = row_Columns.size();
	    
	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
	    //Loop will execute till the last cell of that specific row.
	    for (int column = 0; column < columns_count; column++) {
	    	
	        // To retrieve text from that specific cell.
	        String celtext = row_Columns.get(column).getText();
	        
	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
	    }
	    System.out.println("-------------------------------------------------- ");
	}

	}
	
	//READ ALL ROWS & COLUMNS OF WEBTABLE ENDS
	
	//READ COLUMN OF WEBTABLE STARTS
		public void  elapsedTimewebTable(WebElement tableNameWebElement) {
			
			
		List < WebElement > table_rows =tableNameWebElement.findElements(By.tagName("tr"));
		
		
		//System.out.println("rows_table--->" + table_rows);
		   
		//To calculate no of rows In table.
		int rows_count = table_rows.size();
		String celtextArr[]= new String[rows_count-1];
		int arrSize = celtextArr.length;
		
		System.out.print("arrSize--"+arrSize);
		
		//Loop will execute till the last row of table.
		for (int row = 1; row < rows_count; row++) {
			
		    //To locate columns(cells) of that specific row.
		    List < WebElement > row_Columns = table_rows.get(row).findElements(By.tagName("td"));
		  
		    	
		        // To retrieve text from that specific cell.
		        String celtext = row_Columns.get(4).getText();
		      
		        	celtextArr[row-1]=celtext;
		        	System.out.println("Arr-Cell Value of row number " + row + " Arr-and column number 4 " + " Is " + celtextArr[row-1]);
		       // }
		        
		        System.out.println("Cell Value of row number " + row + " and column number 4 " + " Is " + celtext);
		   // }
		        
		        
		        
		     
		    System.out.println("-------------------------------------------------- ");
		}
		
		   //Sort & display in Descending order
	   
			
			Arrays.sort(celtextArr, new Comparator<String>() {
				
				public int compare(String o1, String o2) {
					
					return o2.compareTo(o1);
				}
			});
			for (String i : celtextArr) {
				System.out.println("arranged--in desc"+i);
			}
	        //TEMP
			
			System.out.println("******"+celtextArr[arrSize-1]);//minimum time

		}
		
		//READ COLUMN OF WEBTABLE ENDS
		
		
		//READ COLUMN OF WEBTABLE ALL STARTS
				public String[]  elapsedTimewebTableAll(WebElement tableNameWebElement,WebElement nextPageWebElement, int pageNumber) {
					
					
					 System.out.println("------- "+nextPageWebElement+"*************");
					
					TestUtil.scrollDown();
					
					if(pageNumber==11 || pageNumber==21 || pageNumber==31 || pageNumber==41) {
						homePage.nextSetOfPagesIconToDoTask();
					}
					
					try {
						if(pageNumber!=11 || pageNumber!=21 || pageNumber!=31 || pageNumber!=41)
					nextPageWebElement.click();
					}
					catch(NoSuchElementException e){
						System.out.println("*****Catch BLOCK************");
						String endOfPages[]=new String[1];
						return endOfPages;
					}
					
					
				List < WebElement > table_rows =tableNameWebElement.findElements(By.tagName("tr"));
				
				   
				//To calculate no of rows In table.
				int rows_count = table_rows.size();
				String celtextArr[]= new String[rows_count-1];
				int arrSize = celtextArr.length;
				
				System.out.print("arrSize--"+arrSize);
				
				//Loop will execute till the last row of table.
				for (int row = 1; row < rows_count; row++) {
					
				    //To locate columns(cells) of that specific row.
				    List < WebElement > row_Columns = table_rows.get(row).findElements(By.tagName("td"));
				  
				    	
				        // To retrieve text from that specific cell.
				        String celtext = row_Columns.get(4).getText();
				      
				        	celtextArr[row-1]=celtext;
				        	//System.out.println("Arr-Cell Value of row number " + row + " Arr-and column number 4 " + " Is " + celtextArr[row-1]);
				       // }
				        
				        System.out.println("Cell Value of row number " + row + " and column number 4 " + " Is " + celtext);
				   // }
				        
				        
				        
				     
				    System.out.println("-------------------------------------------------- ");
				}
				return celtextArr;
				
				}
				
						


			
				//READ COLUMN OF WEBTABLE  ALL ENDS
				
				//READ COLUMN OF WEBTABLE FirstPAge STARTS
				public String[]  elapsedTimewebTableFirstPage(WebElement tableNameWebElement) {
					
					
				List < WebElement > table_rows =tableNameWebElement.findElements(By.tagName("tr"));
				
				   
				//To calculate no of rows In table.
				int rows_count = table_rows.size();
				String celtextArr[]= new String[rows_count-1];
				int arrSize = celtextArr.length;
				
				System.out.print("arrSize--"+arrSize);
				
				//Loop will execute till the last row of table.
				for (int row = 1; row < rows_count; row++) {
					
				    //To locate columns(cells) of that specific row.
				    List < WebElement > row_Columns = table_rows.get(row).findElements(By.tagName("td"));
				  
				    	//
				   /* ArrayList arrList = new ArrayList();
				  
				    arrList = row_Columns.get(4).getText();*/
				    //
				        // To retrieve text from that specific cell.
				   
				        String celtext = row_Columns.get(4).getText();
				       
				        	celtextArr[row-1]=celtext;
				        	
				        	System.out.println("Arr-Cell Value of row number " + row + " Arr-and column number 4 " + " Is " + celtextArr[row-1]);
				       // }
				        
				        System.out.println("Cell Value of row number " + row + " and column number 4 " + " Is " + celtext);
				   // }
				        
				        
				        
				     
				    System.out.println("-------------------------------------------------- ");
				    
				    //
		        	/*for(int i=0;i<celtextArr.length;i++) {
		        	if(celtextArr[i]==)
		        	}*/
		        	//
				}
				return celtextArr;
				
				}
				
						


			
				//READ COLUMN OF WEBTABLE  FirstPage ENDS
				
				
				//REFERENCE NUMBER READING STARTS
				
				//READ COLUMN OF WEBTABLE ALL STARTS
				public String[]  elapsedTimewebTableAllRef(WebElement tableNameWebElement,WebElement nextPageWebElement, int pageNumber) {
					
					
					 System.out.println("------- "+nextPageWebElement+"*************"+pageNumber);
					
					TestUtil.scrollDown();
					
					/*if(pageNumber==11 || pageNumber==21 ) {
						homePage.nextSetOfPagesIconToDoTask();
					
						TestUtil.scrollDown();
						TestUtil.delayToSync();
						//TestUtil.delayToSync();
					}*///commented on 31122019 as this code is included in traverseWebTable() of same class
					
					
						if(pageNumber!=11 && pageNumber!=21)
							try {
									nextPageWebElement.click();
									TestUtil.scrollDown();
									TestUtil.delayToSync();
								}
									catch(Exception e){
													System.out.println("*****Catch BLOCK************");
													String endOfPages[]=new String[1];
													return endOfPages;
													  }
					
					
				List < WebElement > table_rows =tableNameWebElement.findElements(By.tagName("tr"));
				
				   
				//To calculate no of rows In table.
				int rows_count = table_rows.size();
				String celtextArr[]= new String[rows_count-1];
				int arrSize = celtextArr.length;
				
				System.out.print("arrSize--"+arrSize);
				
				//Loop will execute till the last row of table.
				for (int row = 1; row < rows_count; row++) {
					
				    //To locate columns(cells) of that specific row.
				    List < WebElement > row_Columns = table_rows.get(row).findElements(By.tagName("td"));
				  
				    	
				        // To retrieve text from that specific cell.
				        String celtext = row_Columns.get(0).getText();
				      
				        	celtextArr[row-1]=celtext;
				        	//System.out.println("Arr-Cell Value of row number " + row + " Arr-and column number 4 " + " Is " + celtextArr[row-1]);
				       // }
				        
				        System.out.println("Cell Value of row number " + row + " and column number 0 ref num " + " Is " + celtext);
				   // }
				        
				        
				        
				     
				    System.out.println("-------------------------------------------------- ");
				}
				return celtextArr;
				
				}
				
						


			
				//READ COLUMN OF WEBTABLE  ALL ENDS
				
				//READ COLUMN OF WEBTABLE FirstPAge STARTS
				public String[]  elapsedTimewebTableFirstPageRef(WebElement tableNameWebElement) {
					
					
				List < WebElement > table_rows =tableNameWebElement.findElements(By.tagName("tr"));
				
				   
				//To calculate no of rows In table.
				int rows_count = table_rows.size();
				String celtextArr[]= new String[rows_count-1];
				int arrSize = celtextArr.length;
				
				System.out.print("arrSize--"+arrSize);
				
				//Loop will execute till the last row of table.
				for (int row = 1; row < rows_count; row++) {
					
				    //To locate columns(cells) of that specific row.
				    List < WebElement > row_Columns = table_rows.get(row).findElements(By.tagName("td"));
				  
				    	//
				   /* ArrayList arrList = new ArrayList();
				  
				    arrList = row_Columns.get(4).getText();*/
				    //
				        // To retrieve text from that specific cell.
				   
				        String celtext = row_Columns.get(0).getText();
				       
				        	celtextArr[row-1]=celtext;
				        	
				        	System.out.println("Arr-Cell Value of row number " + row + " Arr-and column number 0 ref num" + " Is " + celtextArr[row-1]);
				       // }
				        
				        System.out.println("Cell Value of row number " + row + " and column number 0 ref num " + " Is " + celtext);
				   // }
				        
				        
				        
				     
				    System.out.println("-------------------------------------------------- ");
				    
				    //
		        	/*for(int i=0;i<celtextArr.length;i++) {
		        	if(celtextArr[i]==)
		        	}*/
		        	//
				}
				return celtextArr;
				
				}
				
						


			
				//READ COLUMN OF WEBTABLE  FirstPage ENDS
	
				//	//REFERENCE NUMBER READING STARTS
				
				//temp s
				
		public boolean traverseWebTable(WebElement tableNameWebElement, int pageNumberRxd, String lastrefernceNumber) 
		{
				int pageNumber=pageNumberRxd;
				HomePage homePage = new HomePage();
				HandleWebTable handleWebTable;
		
				if(flag1==false)//IF CONDITION IS NOT REQUIRED
				{
				pageNumber=pageNumberRxd;
				
				//added on 31122019 starts
				if(pageNumber==11 || pageNumber==21 ) {
					//homePage.nextSetOfPagesIconToDoTask();
				
					TestUtil.scrollDown();
					TestUtil.scrollDown();
					TestUtil.delayToSync();
					//TestUtil.delayToSync();
				}
				//added on 31122019 ends
				WebElement nextPageWebElement=null;
				
				if(pageNumber == 11 || pageNumber == 21)
				{
					System.out.println("--------------pagenumber 11 or 21------------");
					
				}
				else
				{
					if(pageNumber > 11 && pageNumber < 21)
					
					{
						System.out.println("--------------pagenumber greater then 11 & less then 21------------");
						nextPageWebElement= TestUtil.navigationalPageXpathToDoTask(pageNumber-10);
					}else
					{
					
					
					 nextPageWebElement= TestUtil.navigationalPageXpathToDoTask(pageNumber);
					}
				}
				
				
				handleWebTable=new HandleWebTable();
				String celText[]=handleWebTable.elapsedTimewebTableAllRef(tableNameWebElement,nextPageWebElement,pageNumber);
				System.out.println("page--"+pageNumber+"- of table ends---"+celText);
				
					for(int i=0;i<=celText.length-1;i++) 
					{
						System.out.println("page values===="+pageNumber+"--"+celText[i]);
						if(lastrefernceNumber.equalsIgnoreCase(celText[i].trim())) 
						{
							homePage.clickOnReferenceNumberLink3(lastrefernceNumber);
							flag1=true;
							System.out.println("found in page--"+pageNumber);
							break;
						}
					}
				
				}//IF CONDITION IS NOT REQUIRED

				return flag1;
			}
				
		//temp ss
		public boolean traverseFirstPageOfWebTable(WebElement tableNameWebElement, String lastrefernceNumber ) 
		{
				HandleWebTable handleWebTable;
				handleWebTable=new HandleWebTable();
				String celText1[]=handleWebTable.elapsedTimewebTableFirstPageRef(tableNameWebElement);
				System.out.println("page1 of table ends---"+celText1);	
				
				for(int i=0;i<=celText1.length-1;i++) 
				{
					System.out.println("page1 values===="+celText1[i]);
					if((lastrefernceNumber).equals(celText1[i].trim())) 
					{	
						System.out.println("found in page1--"+lastrefernceNumber);
						homePage.clickOnReferenceNumberLink3(lastrefernceNumber, flag1);
						flag1=true;
						System.out.println("found in page1");
						break;
					}
						
				}
				
				return flag1;
		  }
				//temp ee

}
