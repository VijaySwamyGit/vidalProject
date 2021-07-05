package RSPracticeExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

//import junit.framework.Assert;

public class Citius {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\old system's-D drive data\\OTHERS\\Vahak\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//
		driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//
	    
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		List<WebElement> column4 = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tr//td[4]"));
		  System.out.println("NUMBER OF ROWS IN THIS TABLE = "+ column4 .size());
		  int row_num=1;
		  for (WebElement tdElement : column4 )
		  {
		       /* System.out.println("row # " + row_num + ", col #3 text=" +tdElement.getText());
		        //Assert.assertTrue("500", tdElement.getText());
		        String str = tdElement.getText();
		        String str2 ="";
		        //char ch []=str.toCharArray();
		        for(int k=0;k<3;k++)
		        {
		        	char ch =str.charAt(k);
		        	str2 = str2+ch;
		        }
		        int i = Integer.parseInt(str2);
		        if(i>500)
		        {
		        	String s1=tdElement.getText();
		        	System.out.println("---- "+s1);
		        	Assert.assertEquals(str2, tdElement.getText());
		        	
		        }*/
			  System.out.println("row # " + row_num + ", col #4 text=" +tdElement.getText());
			  String values = tdElement.getText();
			  int i = Integer.parseInt(values);
		        if(i>2004)
		        {
		        
		        	Assert.assertEquals(values, tdElement.getText());
		        	Reporter.log("pass--", true);
		        	 System.out.println("pass-------sop");
		        	
		        }else
		        {
		        	Assert.assertEquals(values, tdElement.getText());
		        	Reporter.log("fail--", true);
		        	 System.out.println("fail-------sop");
		        }
		        
		   row_num++;
		  }
		
		 /* Iterator<WebElement> itr = column3.iterator();
		  while(itr.hasNext())
		  {
			  WebElement e1 = itr.next();
			  String s1 = e1.getText();
			  if(s1)
		  }*/

	}

}
