package com.qa.vidalhealth.TestScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.vidalhealth.Base.TestBase;

public class ParallelTestRun extends TestBase {
	
	
	public ParallelTestRun() {
		//PageFactory.initElements(driver, this);
	}

	
	@Test
	public void m1() {
		System.out.println("m1");
	}
	
	@Test
	public void m2() {
		System.out.println("m2");
	}
	
	@Test
	public void m3() {
		System.out.println("m3");
	}
	
	@Test
	public void m4() {
		System.out.println("m4");
	}
	
	@Test
	public void m11() {
		System.out.println("m11");
	}
	
	@Test
	public void m22() {
		System.out.println("m22");
	}
	
	@Test
	public void m33() {
		System.out.println("m33");
	}
	
	@Test
	public void m44() {
		System.out.println("m44");
	}
}
