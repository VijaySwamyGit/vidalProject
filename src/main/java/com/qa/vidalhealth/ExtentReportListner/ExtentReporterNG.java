package com.qa.vidalhealth.ExtentReportListner;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.IReporter;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.buschmais.jqassistant.core.analysis.api.rule.Report;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

//import org.testng.IReporter;

//import com.relevantcodes.extentreports.IReporter;
import com.relevantcodes.extentreports.LogStatus;

import com.relevantcodes.extentreports.model.Test;

public  class ExtentReporterNG implements IReporter {

	private ExtentReports extent;
	//private ExtentReports report;
	//ITestResult result;
	//private com.relevantcodes.extentreports.Report report;
	
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		extent = new ExtentReports(outputDirectory + File.separator + "Extent.html",true);
		
		for(ISuite suite : suites) {
			Map <String, ISuiteResult> result = suite.getResults();
			
			for(ISuiteResult r:	result.values()) {
				ITestContext context = r.getTestContext();
				
				buildTestNodes(context.getPassedTests(),LogStatus.PASS);
				buildTestNodes(context.getFailedTests(),LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(),LogStatus.SKIP);
			}
		}
		
		extent.flush();
		extent.close();
	}
	
	private  void buildTestNodes(IResultMap tests, LogStatus status) {
		
		ExtentTest test;
		//ITestResult result;
		
		if(tests.size()>0) {
			
			
			
			for(ITestResult result: tests.getAllResults()) {
				
				test=extent.startTest(result.getMethod().getMethodName());
				
				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));
				
				for(String group : result.getMethod().getGroups())
					test.assignCategory(group);
				
				if(result.getThrowable()!=null) {
					test.log(status, result.getThrowable());
				}else {
					test.log(status, "Test "+status.toString().toLowerCase()+"ed");
				}
				extent.endTest(test);
			}
		}
		
	}
	
	private Date getTime(long millis) {
		
	
		Calendar calander = Calendar.getInstance();
		calander.setTimeInMillis(millis);
		return calander.getTime();
	}

	
	}





