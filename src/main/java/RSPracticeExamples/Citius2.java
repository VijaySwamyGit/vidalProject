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

public class Citius2 {

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
		
		WebElement my_table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		List <WebElement> table_rows = my_table.findElements(By.tagName("tr"));
		
		int row_count = table_rows.size();
		//int row=1;
		System.out.println("row_count--"+row_count);
		for(int i=0;i<row_count-3;i++)
		{
		List<WebElement> cell_values = table_rows.get(i).findElements(By.tagName("td"));
		int k =cell_values.size();
		System.out.println("cell_count--"+k);
		//String str = cell_values.get(i).getText();
		//System.out.println("str value--"+str);
		
		
		}
		        
		   
		  }
		
		 /* Iterator<WebElement> itr = column3.iterator();
		  while(itr.hasNext())
		  {
			  WebElement e1 = itr.next();
			  String s1 = e1.getText();
			  if(s1)
		  }*/

	}


