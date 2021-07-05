package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrangeArrayInDesc {

	public static void main(String[] args) {
		
		String[] strArr= {"vijay","kartik","ritvik","shilpa"}; 
		
		
		
		Arrays.sort(strArr, new Comparator<String>() {
			
			public int compare(String str1, String str2) 
			{
				int ret=str2.compareTo(str1);
				return ret;
			}
		});
		for (String i : strArr) {
			System.out.println(i);
		}
		
//	ArrayList ar2 = new ArrayList(3);
		//int [] ar = new int [1];
		
		int arr[]= {4,8,2,1};
		//int arr2[]=new int[10];
		//char[] arr= {'s','g','t','u'};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int t=0;
				//char t;
				if(arr[i] < arr[j])
				{
					t=arr[i];
					arr[i] =arr[j];
					arr[j]=t;
					
					/*a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];*/
				}
			}
		}
		for (int ii : arr) {
		//for (char ii : arr) {
			System.out.println(ii);
		}

	}

}

/*public static boolean verifyObjectPresent(WebDriver driver) {
 
     try {
 
      driver.findElement(By.linkText("+ Report Categories"));
 
      return true;
 
     } catch (Exception e) { 
 
      return false;
 
     }*/
