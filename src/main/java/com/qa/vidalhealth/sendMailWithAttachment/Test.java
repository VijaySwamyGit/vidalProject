package com.qa.vidalhealth.sendMailWithAttachment;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {
	
	static Properties prop=null;
	//static FileInputStream fis=null;
	
	public static void m() throws FileNotFoundException
	{
		FileInputStream fis =new FileInputStream("E:\\SVN-V3-automation\\Automation\\src\\main\\java\\com\\qa\\vidalhealth\\Configuration\\config.properties");
		
		System.out.println(fis);
		
		try {
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		Test.m();
	}

}
