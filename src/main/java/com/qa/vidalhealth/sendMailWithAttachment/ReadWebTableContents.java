package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWebTableContents {

	public static void main(String[] args) {
	
		    	WebDriver driver;
		    	System.setProperty("webdriver.chrome.driver","E:\\SVN-V3-automation\\Automation\\Driverserver\\chromedriver.exe");
		    	driver = new ChromeDriver();
		    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    	driver.get("http://demo.guru99.com/test/table.html");
		    	
		    	//To locate table.
		    	WebElement mytable = driver.findElement(By.xpath("/html/body/table/tbody"));
		    	
		    	
		    	//mytable.
		    	//To locate rows of table. 
		    	List < WebElement > table_rows = mytable.findElements(By.tagName("tr"));
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
		}
		//

	


