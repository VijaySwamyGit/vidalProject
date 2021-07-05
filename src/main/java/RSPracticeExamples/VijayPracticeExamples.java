package RSPracticeExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VijayPracticeExamples {
	
	//*******************************************************************************************************
	public void duplicateInArray()
	{
		int [] arr = new int []{1,2,2,3,3,3,4,4,4,4};
		ArrayList<Integer> al = new ArrayList <Integer>();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int dup=0;
			
			if(!al.contains(arr[i]))
			{
				al.add(arr[i]);
				dup++;
			
			
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					dup++;
				}
				
				
			}
			System.out.println(arr[i]+"---> "+dup+" -Time/s");
			}
			
		}
	}
	
	//////////
	public void duplicateInArray2()
	{
		Integer [] arr = new Integer []{1,2,2,3,3,3,4,4,4,4};
		
		List<Integer>   l = Arrays.asList(arr);
		Set<Integer> s = new HashSet<Integer>(l);
		System.out.println(s);
	
	}
		//******************************************************************************************************************
		public void sumOfArrayElements(int[] ar)
		{
			int sum=0;
			for(int i=0;i<ar.length;i++)
			{
				sum=sum+ar[i];
			}
			System.out.println("sum---> "+sum);
		}
		
//******************************************************************************************************************		
		
		public void mulOfGivenNumber(int i, int j)//without mul operator
		{
			int mul=0;
			
			for(int k=1;k<=i;k++)
			{
				mul=mul+j;
			}
		
			System.out.println("mul-- "+mul);
		}
//*********************************************************************************************************************************		
		//compare 2 arrays and form 3rd array of duplicates found in 2 arrays
		public void compare2Array()
		{
			int a[]= {1,2,3,4,7};
			int b[]= {2,2,5,6,7};
			
			ArrayList<Integer> al = new ArrayList<Integer>();
			
			for(int i=0;i<=a.length-1;i++)
			{
				
				//System.out.print("a- "+a[i]);
				//System.out.print("b- "+b[i]);
				if(a[i] == b[i])
				{
					al.add(a[i]);
					System.out.println(al);
				}
			}
			//System.out.println(al);
			Object[] arr = al.toArray();
			
			
		System.out.println(arr);
		
		for(Object obj:arr)
		{
			System.out.println("---- "+obj);
		}
		
		for(int k=0;k<=arr.length-1;k++)
		{
			System.out.println("--- "+arr[k]);
		}
			
			
		}
		
	//************************************************************************************************************	
		//Reverse number using mathematical operators
		
		public void reverseNumber()
		{
			int num = 54003;
			int reverseNum=0;
			
			while(num>0)
			{
			int Rem=num%10;
			reverseNum=Rem+reverseNum*10;
			int quo = num/10;
			
			num=quo;
			
			}
			
			System.out.println(reverseNum);
		}
		
		//*************************************************************
		//largest difference of adjacent numbers in an array
		
		public void largestDiff()
		{
			int a[]= {1,3,100,9,22,1,4};
			int diff=0;
			
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i+1]-a[i]>diff)
				{
					diff=a[i+1]-a[i];
				}
			}
			
			System.out.println("Largest diff---> "+diff);
		}
		
		
		//*******************************************************************
		
		public void pyramid1()
		{
			for(int i=1;i<5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
					System.out.print("\t");
				}
				
				System.out.println();
			}
			
		}
		//**********************************************************************
		public void pyramid2()
		{
			for(int i=5;i>=0;i--)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
					System.out.print("\t");
				}
				
				System.out.println();
			}
			
		}
		//****************************************************************
		
		
		public void minInMDarray()
		{
			int a[][]= {{11,2,3},{8,10,5},{7,8,5}};
			
			int min=a[0][0];
			for(int i=0;i<=a.length-1;i++)
			{
				for(int j=0;j<=a.length-1;j++)
				{
					if(a[i][j]<min)
					{
						min=a[i][j];
					}
				}
			}
			
			System.out.println(min);
		}
		
		
		//**************************************************************************
		
		public void duplicateInString()
		{
			String str = "vijaya";
			char ch='a';
			int count=0;
			
			for(int i=0;i<=str.length()-1;i++)
			{
				if(ch==str.charAt(i))
				{
					count++;
				}
				
				//System.out.println("---- "+ ch +"----"+count);
			}
			System.out.println("---- "+ ch +"----"+count);
		}
		//*********************************************************************************
		
		public void duplicateInSentence()
		{
			String str = "india is my country";
			char arr[] = str.toCharArray();
			//int [] arr = new int []{1,2,2,3,3,3,4,4,4,4};
			ArrayList<Character> al = new ArrayList <Character>();
			ArrayList<Character> al2 = new ArrayList <Character>();
			
			for(int i=0;i<=arr.length-1;i++)
			{
				int dup=0;
				
				if(!al.contains(arr[i]))
				{
					al.add(arr[i]);
					dup++;
				
				
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[i]==arr[j])
					{
						dup++;
					}
					
					
				}
				
			
				System.out.println(arr[i]+"---> "+dup+" -Time/s");
				}
				//System.out.println(al);
				
			}
			
			for(int k=0;k<=arr.length-1;k++)
			{
				al2.add(arr[k]);
			}
			System.out.println(al);
			al2.add('v');
			System.out.println(al2);
			al2.removeAll(al);
			System.out.println(al2);
			
		}
		//************************************************************************************
		
		public void EY()
		{
			String s1="EY";
			String s2="EY";
			System.out.println(s1==s2);
			System.out.println(s1.equals(s2));
			String s3="EY";
			String s4="EY";
			System.out.println(s3==s4);
			String s5=new String("EY");
			System.out.println(s4==s5);
			System.out.println(s4.equals(s5));
		}
		
		public void EY2()
		{
			
			int a=10;
			int b=90;
			String c="EY";
		 System.out.println(a+b+c);
			System.out.println(c+a+b);
			
		}
		
		//************************************************************
		
		public void lengthOfString()
		{
			
			String str="automation Testing";
			char ch []= str.toCharArray();
			int length=0;
			
			for(char c:ch)
			{
				length++;
			}
			
			System.out.println("length of string is "+length);
		}
		
		//*******************************************************************
		
		public void tringReverseWithoutLengthFunc()
		{
			
			String str="Testing";
			char ch []= str.toCharArray();
			int count=0;
			String strRev="";
			
			for(char c:ch)
			{
				count++;
			}
			
			System.out.println("length of string is "+count);
			
			for(int i=count-1;i>=0;i--)
			{
				strRev=strRev+str.charAt(i);
			}
			
			System.out.println("reverse of string is "+strRev);
		}
		//**************************************************
		
		public void ReverseStringretainingPositionOfspace()
		{
			String str = "I Am Not a String";
			String strReverse="";
			//char ch[]=str.toCharArray();
			String strArr [] = str.split(" ");
			
			for(int i=strArr.length-1;i>=0;i--)
			{
				
				strReverse=strReverse+str.charAt(i);
			}
			
			System.out.println("reverse of string is "+strReverse);
		}
		
		//***********************************************************//
		public void secondRepit()
		{
			int secondRep=0;
		String str="vijayayivy";
		char ch[] = str.toCharArray();
		ArrayList l = new ArrayList();
		ArrayList l2 = new ArrayList();
		for(int i=0;i<str.length();i++)
		{
			if(!l.contains(ch[i]))
			{
				l.add(ch[i]);
			}
			else
			{
				l2.add(ch[i]);
			}
			
			//Object oArr[] = l2.toArray();
			
		}
		
		Object oArr[] = l2.toArray();
		int count=0;
		System.out.println(l2);
		Character chh = (Character)l2.get(secondRep);
		System.out.println(chh);
		for(int j=0;j<oArr.length;j++)
		{
			if(chh.equals(oArr[j]))
			{
				count++;
			}
		}
		System.out.println("2nd repeatative charaacter in a string is -- "+l2.get(secondRep));
		System.out.println(count+1);
		
		}
		
		
		
		
		
		
		//*************************************************
	

	public static void main(String[] args) {
		
		VijayPracticeExamples obj = new VijayPracticeExamples();
		//obj.duplicateInArray();
		//int [] ar= {1,2,3,4,5,6};
		//obj.sumOfArrayElements(ar);
		//obj.mulOfGivenNumber(8,7);
		//obj.compare2Array();
		//obj.reverseNumber();
		//obj.largestDiff();
		//obj.pyramid2();
		//obj.maxInMDarray();
		//obj.duplicateInString();
		//obj.duplicateInSentence();
		//obj.EY2();
		//obj.EY();
		//obj.eyt();
		//obj.lengthOfString();
		//obj.tringReverseWithoutLengthFunc();
		//obj.ReverseStringretainingPositionOfspace();
		//obj.duplicateInArray2();
		obj.secondRepit();
		

	}

}
